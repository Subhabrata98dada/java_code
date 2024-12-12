package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Currier{
	
	public DTDC()
	{
		System.out.println(this.getClass());
	}
	
	@Override
	public String delivery(int orderId) {
		
		return "oder delivered by DTDC devivery partner with order id:"+orderId;
	}

}
