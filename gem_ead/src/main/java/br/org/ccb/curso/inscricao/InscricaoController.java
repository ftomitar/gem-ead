package br.org.ccb.curso.inscricao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inscricao")
public class InscricaoController {

	@Autowired
	private InscricaoService inscricaoService;
	
	@GetMapping
	public List<Inscricao> findAll(){
		return this.inscricaoService.findAll();
	}

}
