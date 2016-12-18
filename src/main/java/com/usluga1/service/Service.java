package com.usluga1.service;
import java.util.List;

import javax.json.Json;
import javax.json.JsonObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.usluga1.Controler;
import com.usluga1.domain.Testowa;
import com.usluga1.domain.TestowaRepository;

@Component
public class Service {
	
	@Autowired
	TestowaRepository userRepository;
	
	Log log = LogFactory.getLog(Controler.class);
	
	public String funkcjsaTest(){
		Testowa test= userRepository.findById(new Long(0));
		
		JsonObject json = Json.createObjectBuilder().add("name",test.getNazwisko().toString()).add("surname","paczuski").build();
		json.toString();
		log.info("\n-------------------------info--------------------------------");
		log.info("\n-----"+test.toString()+"-----");
		return json.toString();

	}
	
	
}
