package br.org.ccb.membro.musico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicoServiceImpl implements MusicoService{

	@Autowired
	private MusicoRepository membroRepository;
	
	@Override
	public List<Musico> findAll() {
		return this.membroRepository.findAll();
	}

}
