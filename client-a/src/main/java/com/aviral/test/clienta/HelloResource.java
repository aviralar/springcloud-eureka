package com.aviral.test.clienta;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/clienta")
public class HelloResource {
	
	@Value("${message}")
	String msg;
	
	@GetMapping
	public String hello() {
		return msg;
	}

}
