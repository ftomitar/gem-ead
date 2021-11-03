package br.org.ccb.curso.administracao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.ccb.curso.CursoOferecido;
import br.org.ccb.curso.googleclassroom.GoogleSalaDeAula;
import br.org.ccb.curso.salaDeAula.SalaDeAula;
import br.org.ccb.curso.salaDeAula.SalaDeAulaRepository;

@Service
public class AdministracaoServiceImpl implements AdministracaoService{

	@Autowired
	private AdministracaoRepository administracaoRepository;
	
	@Autowired
	private SalaDeAulaRepository salaDeAulaRepository;
	
	@Override
	public List<Administracao> findAll() {
		return this.administracaoRepository.findAll();
	}
	
	public void criarSalaLocalidade(String estado, String cidade, String setor, String localidade, String curso, String disciplina) {
		
		List<Administracao> result = administracaoRepository.findByEstadoAndCidadeAndSetorAndLocalidade(estado, cidade, setor, localidade);
		if(result.isEmpty()) {
			return;
		}
		
		for(Administracao administracao : result) {
			CursoOferecido cursoOferecido  = administracao.obterCursoOferecido(curso, disciplina);
			if(cursoOferecido == null) {
				continue;
			}
			criarSalaAula(administracao, cursoOferecido);
		}
	}

	private void criarSalaAula(Administracao administracao, CursoOferecido cursoOferecido) {
		
		SalaDeAula salaDeAula = new SalaDeAula();
		salaDeAula.setLocalidade(administracao.getLocalidade());
		salaDeAula.setCidade(administracao.getCidade());
		salaDeAula.setEstado(administracao.getEstado());
		salaDeAula.setSetor(administracao.getSetor());
		salaDeAula.setCurso(cursoOferecido.getCurso());
		salaDeAula.setDisciplina(cursoOferecido.getDisciplina());
		salaDeAula.setStatus(cursoOferecido.getStatus());
		salaDeAula.setPeriodoLetivo(cursoOferecido.getPeriodoLetivo());
		salaDeAula.defineNomeSalaDeAula();
		
		GoogleSalaDeAula googleSalaDeAula = new GoogleSalaDeAula();
		boolean criouSalaDeAulaGoogle = googleSalaDeAula.criarSalaAula(cursoOferecido, salaDeAula);
		
		if(criouSalaDeAulaGoogle) {
			salaDeAula.setUrl(googleSalaDeAula.obterUrlSalaAula());
		}
		
		salaDeAula = salaDeAulaRepository.save(salaDeAula);
		
		administracao.getSalasDeAulaAtivas().add(salaDeAula.getSalaAulaAtiva());
		administracaoRepository.save(administracao);
	}
}
