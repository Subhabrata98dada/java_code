package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("flipkart")
public final class Flipkart {
	
	public Flipkart()
	{
		System.out.println(this.getClass());
	}
	
	@Autowired
	@Qualifier("supplier")
	private Currier currier;
	public String shopping(String product[],double prices[])
	{
		String products=Arrays.toString(product);
		String priceslist=Arrays.toString(prices);
		double total=0;
		for(double tag:prices)
			total+=tag;
		int orderid=new Random().nextInt(3000,5000);
		String currierInfo=currier.delivery(orderid);
		String totaldestriction="Shopping by Flipkart\n"+
		                         "the products are: "+products
		                         +"\nThe prices are: "+priceslist
		                         +"\ntotal ammount: "+total+
		                         "\n"+currierInfo;
		return totaldestriction;
	}

}
