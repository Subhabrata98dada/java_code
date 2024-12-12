package com.nt.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.nt.documents.Artist;

@Repository
public class ArtistImplementattion {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	public List<Artist> getUser()
	{
		Query query=new Query();
		query.addCriteria(Criteria.where("name").is("saharukh"));
		query.addCriteria(Criteria.where("id").is("s1"));
		return mongoTemplate.find(query,Artist.class);
	}
}
