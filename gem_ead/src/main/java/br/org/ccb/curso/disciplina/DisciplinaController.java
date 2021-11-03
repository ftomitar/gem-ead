package br.org.ccb.curso.disciplina;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

	@Autowired
	private DisciplinaService disciplinaService;
	
	@GetMapping
	public List<Disciplina> findAll(){
		return this.disciplinaService.findAll();
	}

}
