package br.org.ccb.curso.matricula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {

	@Autowired
	private MatriculaService inscricaoService;
	
	@GetMapping
	public List<Matricula> findAll(){
		return this.inscricaoService.findAll();
	}

}
