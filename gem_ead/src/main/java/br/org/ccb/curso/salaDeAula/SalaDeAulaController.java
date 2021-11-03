package br.org.ccb.curso.salaDeAula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaDeAulaController {

	@Autowired
	private SalaDeAulaService salaDeAulaService;
	
	@GetMapping("/salaDeAula")
	public List<SalaDeAula> findAll(){
		return this.salaDeAulaService.findAll();
	}	
}
