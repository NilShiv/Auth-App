package com.nil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	
	@GetMapping("/")
	public String test(){
		return "jai mahakal";
	}
}
