package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("BILL")
public interface FeignClientInterface {
	
	@GetMapping("/billing/bill")
	public ResponseEntity<String> invokeDoBilling();
	

}
