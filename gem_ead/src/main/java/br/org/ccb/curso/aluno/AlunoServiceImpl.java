package br.org.ccb.curso.aluno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoServiceImpl implements AlunoService{

	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public List<Aluno> findAll() {
		return this.alunoRepository.findAll();
	}

}
