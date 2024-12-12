package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("bluedirt")
public final class BlueDirt implements Currier{
	
	public BlueDirt()
	{
		System.out.println(this.getClass());
	}
	
	@Override
	public String delivery(int orderId) {
		System.out.println("hello");
		return "oder delivered by BlueDirt devivery partner with order id:"+orderId;
	}

}
