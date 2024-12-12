package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("dhl")
public final class DHL implements Currier{
	
	public DHL()
	{
		System.out.println(this.getClass());
	}

	@Override
	public String delivery(int orderId) {
		
		return "oder delivered by DHL devivery partner with order id:"+orderId;
	}

}
