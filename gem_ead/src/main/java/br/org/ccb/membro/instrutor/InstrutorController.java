package br.org.ccb.membro.instrutor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {

	@Autowired
	private InstrutorService instrutorService;
	
	@GetMapping
	public List<Instrutor> findAll(){
		return this.instrutorService.findAll();
	}
}
