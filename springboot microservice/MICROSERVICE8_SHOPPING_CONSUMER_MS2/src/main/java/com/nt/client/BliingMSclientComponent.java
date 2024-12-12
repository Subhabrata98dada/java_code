package com.nt.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BliingMSclientComponent {
	@Autowired
	private LoadBalancerClient client;
	
	public String invokeDoBilling()
	{
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		//get service instance object provided by eureka
//		List<ServiceInstance> instances=;
		//get instance of service
		ServiceInstance instance=client.choose("BILLING");
		// get the details of provider ms
		String url= instance.getUri()+"/billing/bill";
		System.out.println(url);
		//use rest template to invoke the methods of providers
		RestTemplate rt=new RestTemplate();
		String res= rt.getForObject(url,String.class);
		return res;
	}
	
}
