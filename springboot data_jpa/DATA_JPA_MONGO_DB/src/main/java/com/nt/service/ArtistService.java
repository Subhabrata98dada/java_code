package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.documents.Artist;
import com.nt.repository.ArtistRepository;

@Service
public class ArtistService {
	@Autowired
	private ArtistRepository repository;
	public String registerArtist(Artist artist)
	{
		return repository.save(artist).getId();
	}
}
