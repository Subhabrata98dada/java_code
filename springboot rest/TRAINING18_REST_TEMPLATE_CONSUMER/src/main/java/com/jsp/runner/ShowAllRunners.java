package com.jsp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.jsp.entity.Student;
import com.jsp.responsestructure.ResponseStructure;
@Component
public class ShowAllRunners implements CommandLineRunner{
	@Autowired
	private RestTemplate template;
	@Override
	public void run(String... args) throws Exception {
		String baseurl="http://localhost:8080/get";
	    ResponseEntity<ResponseStructure> re=template.getForEntity(baseurl,ResponseStructure.class);
		System.out.println(re.getBody().getData());
	}

}
