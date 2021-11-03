package br.org.ccb.membro.musico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/musico")
public class MusicoController {

	@Autowired
	private MusicoService musicoService;
	
	@GetMapping
	public List<Musico> findAll(){
		return this.musicoService.findAll();
	}
}
