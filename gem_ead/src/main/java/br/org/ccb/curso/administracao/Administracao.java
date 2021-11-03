package br.org.ccb.curso.administracao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.org.ccb.curso.CursoOferecido;
import br.org.ccb.curso.salaDeAula.SalaDeAulaAtiva;
import lombok.Data;

@Data
@Document(collection="administracao")
public class Administracao {
	@Id
	private String codigo;
	private String estado;
	private String cidade;
	private String localidade;
	private String setor;
	private List<SalaDeAulaAtiva> salasDeAulaAtivas;
	private List<CursoOferecido> cursosOferecidos;
	
	public CursoOferecido obterCursoOferecido(String curso, String disciplina) {
		Optional<CursoOferecido> opCursoOferecido = cursosOferecidos.stream().filter(c -> curso.equals(c.getCurso())).findFirst();
		if(opCursoOferecido.isEmpty()) {
			return null;
		}
		return opCursoOferecido.get();
		
	}
}
