package br.org.ccb.curso.administracao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdministracaoController {

	@Autowired
	private AdministracaoService administracaoService;
	
	@GetMapping("/administracao")
	public List<Administracao> obterTodos(){
		return this.administracaoService.findAll();
	}
	
	
	@GetMapping("/administracao/criarCurso/{localidade}/{curso}/{disciplina}")
	public void criar(@PathVariable(value = "localidade") String localidade,
		              @PathVariable(value = "curso") String curso,
			          @PathVariable(value = "disciplina") String disciplina){
		this.administracaoService.criarSalaLocalidade("São Paulo", "Guarulhos", "Setor 1",  localidade, curso, disciplina);
	}

}
