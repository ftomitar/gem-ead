package br.org.ccb.curso.historico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historico")
public class HistoricoController {

	@Autowired
	private HistoricoService historicoService;
	
	@GetMapping
	public List<Historico> findAll(){
		return this.historicoService.findAll();
	}

}
