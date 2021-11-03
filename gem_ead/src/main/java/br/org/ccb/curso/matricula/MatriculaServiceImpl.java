package br.org.ccb.curso.matricula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaServiceImpl implements MatriculaService{

	@Autowired
	private MatriculaRepository inscricaoRepository;
	
	@Override
	public List<Matricula> findAll() {
		return this.inscricaoRepository.findAll();
	}

}
