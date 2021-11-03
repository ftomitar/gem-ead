package br.org.ccb.membro.instrutor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstrutorServiceImpl implements InstrutorService{

	@Autowired
	private InstrutorRepository instrutorRepository;
	
	@Override
	public List<Instrutor> findAll() {
		return this.instrutorRepository.findAll();
	}

}
