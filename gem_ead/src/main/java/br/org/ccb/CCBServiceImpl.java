package br.org.ccb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CCBServiceImpl implements CCBService{

	@Autowired
	private CCBRepository ccbRepository;
	
	@Override
	public List<CCB> findAll() {
		return this.ccbRepository.findAll();
	}

}
