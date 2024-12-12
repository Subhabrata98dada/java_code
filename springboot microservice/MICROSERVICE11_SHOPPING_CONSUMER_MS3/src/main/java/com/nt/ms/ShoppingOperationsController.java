package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nt.client.FeignClientInterface;

@RestController
@RequestMapping("/shopping")
public class ShoppingOperationsController {
	
	@Autowired
	private FeignClientInterface clientComponent;
	
	@GetMapping("/purchase")
	public ResponseEntity<String> doShopping()
	{
		System.out.println("-------------------------");
//		String msg="shopping dashra festible is hapening";
		//invode provider method using client component
		
		return clientComponent.invokeDoBilling();
	}
}
