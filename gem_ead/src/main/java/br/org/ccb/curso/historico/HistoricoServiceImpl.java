package br.org.ccb.curso.historico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoricoServiceImpl implements HistoricoService{

	@Autowired
	private HistoricoRepository historicoRepository;
	
	@Override
	public List<Historico> findAll() {
		return this.historicoRepository.findAll();
	}

}
