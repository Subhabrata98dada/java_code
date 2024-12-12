package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerater {
	@Autowired
	private LocalDateTime datetime;
	
	public WishMessageGenerater()
	{
		System.out.println(this.getClass());
	}
	
	public String gestWish()
	{
		int time=datetime.getHour();
		if(time<12) return "good morning current time:"+time;
		if(time<16) return "good afternoon time:"+time;
		if(time<20) return "good evening time:"+time;
		else return "good night";
	}

}
