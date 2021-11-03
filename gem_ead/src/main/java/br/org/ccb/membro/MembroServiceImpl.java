package br.org.ccb.membro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembroServiceImpl implements MembroService{

	@Autowired
	private MembroRepository membroRepository;
	
	@Override
	public List<Membro> findAll() {
		return this.membroRepository.findAll();
	}

}
