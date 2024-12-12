package com.nt.ms;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingController {
	@GetMapping("/bill")
	public ResponseEntity<String> getBill()
	{
		int billAmmount=new Random().nextInt(200000);
		System.out.println(billAmmount);
		return new ResponseEntity<String>("Total bill is :"+billAmmount,HttpStatus.OK);
	}
}
