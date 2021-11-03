package br.org.ccb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ccb")
public class CCBController {

	@Autowired
	private CCBService ccbService;
	
	@GetMapping
	public List<CCB> obterTodos(){
		return this.ccbService.findAll();
	}

}
