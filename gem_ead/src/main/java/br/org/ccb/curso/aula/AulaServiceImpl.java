package br.org.ccb.curso.aula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AulaServiceImpl implements AulaService{

	@Autowired
	private AulaRepository aulaRepository;
	
	@Override
	public List<Aula> findAll() {
		return this.aulaRepository.findAll();
	}

	@Override
	public List<Aula> findByCursoAndDisciplina(String curso, String disciplina) {
		return this.aulaRepository.findByCursoAndDisciplinaOrderByAula(curso, disciplina);
	}

}
