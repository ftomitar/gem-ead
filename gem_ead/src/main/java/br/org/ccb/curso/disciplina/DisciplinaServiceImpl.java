package br.org.ccb.curso.disciplina;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaServiceImpl implements DisciplinaService{

	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	@Override
	public List<Disciplina> findAll() {
		return this.disciplinaRepository.findAll();
	}

}
