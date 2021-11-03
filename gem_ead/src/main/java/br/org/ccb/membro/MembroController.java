package br.org.ccb.membro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/membro")
public class MembroController {

	@Autowired
	private MembroService membroService;
	
	@GetMapping
	public List<Membro> findAll(){
		return this.membroService.findAll();
	}
}
