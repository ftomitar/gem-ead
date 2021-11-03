package br.org.ccb.curso.aula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AulaController {

	@Autowired
	private AulaService aulaService;
	
	@GetMapping("/aula")
	public List<Aula> findAll(){
		return this.aulaService.findAll();
	}
	
	@GetMapping("/aula/{curso}/{disciplina}")
	public List<Aula> findByCursoAndDisciplinaOrderByAula(
			@PathVariable(value = "curso") String curso, 
			@PathVariable(value = "disciplina") String disciplina)
	{
		return this.aulaService.findByCursoAndDisciplina(curso, disciplina);
	}
	

}
