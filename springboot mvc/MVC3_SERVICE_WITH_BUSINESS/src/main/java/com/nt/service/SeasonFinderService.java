package com.nt.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("seasonservice")
public class SeasonFinderService {
	
	public String findSeason()
	{
		LocalDateTime date=LocalDateTime.now();
		int month=date.getMonthValue();
		if(month >=3 && month<=7) return "summer";
		else if(month >= 8 && month<=10) return "spring";
		else return "winter";
	}

}
