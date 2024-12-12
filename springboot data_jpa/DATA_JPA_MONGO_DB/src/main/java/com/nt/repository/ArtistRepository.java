package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nt.documents.Artist;

@Repository
public interface ArtistRepository extends MongoRepository<Artist,String>{

}
