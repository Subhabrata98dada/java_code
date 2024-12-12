package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.documents.Artist;
import com.nt.repository.ArtistImplementattion;
import com.nt.service.ArtistService;

@Component
public class DemoRunner implements CommandLineRunner {
	
	@Autowired
	private ArtistService service;
	
	@Autowired
	private ArtistImplementattion implementattion;
	@Override
	public void run(String... args) throws Exception {
		List<Artist> artists=implementattion.getUser();
		artists.forEach(i->System.out.println(i));
	}

}
