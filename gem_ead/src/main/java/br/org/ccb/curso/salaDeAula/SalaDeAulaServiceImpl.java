package br.org.ccb.curso.salaDeAula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaDeAulaServiceImpl implements SalaDeAulaService{

	@Autowired
	private SalaDeAulaRepository instrutorRepository;
	
	@Override
	public List<SalaDeAula> findAll() {
		return this.instrutorRepository.findAll();
	}

}
