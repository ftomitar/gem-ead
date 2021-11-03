package br.org.ccb.curso.inscricao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscricaoServiceImpl implements InscricaoService{

	@Autowired
	private InscricaoRepository inscricaoRepository;
	
	@Override
	public List<Inscricao> findAll() {
		return this.inscricaoRepository.findAll();
	}

}
