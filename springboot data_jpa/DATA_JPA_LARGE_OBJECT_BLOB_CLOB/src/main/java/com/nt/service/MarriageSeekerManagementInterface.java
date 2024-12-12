package com.nt.service;

import java.util.Optional;

import com.nt.entity.MarriageSeeker;

public interface MarriageSeekerManagementInterface {
	
	String registerMarriageSeeker(MarriageSeeker seeker);
	Optional<MarriageSeeker> getMarriageSeeker(Integer id);

}
