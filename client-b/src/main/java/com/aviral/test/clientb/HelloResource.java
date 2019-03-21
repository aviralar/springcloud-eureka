package com.aviral.test.clientb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/rest/hello/clientb")
public class HelloResource {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "fallback")
	@GetMapping
	public String hello() {
		String url = "http://client-a/rest/hello/clienta";
		return restTemplate.getForObject(url, String.class);
	}
	
	public String fallback() {
		return "Fallback Hello World!!";
	}
	
	
}
