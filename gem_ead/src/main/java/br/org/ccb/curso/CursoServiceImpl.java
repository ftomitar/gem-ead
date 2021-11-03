package br.org.ccb.curso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public List<Curso> findAll() {
		return this.cursoRepository.findAll();
	}

}
