package com.watkings.business.league;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.watkings.domain.LeagueTable;
import com.watkings.domain.LeagueTableRepository;


@RestController
@RequestMapping("/league")
public class LeagueController {
	
	@Autowired
	LeagueTableRepository repo;
	
	@RequestMapping("/table")
	//"Tabela ligowa dla ligi o podanym ID")
	public List<LeagueTable> getLeagueTable(){
		String result = "Tabela ligi "; 
		return repo.findAll();
	}
}
