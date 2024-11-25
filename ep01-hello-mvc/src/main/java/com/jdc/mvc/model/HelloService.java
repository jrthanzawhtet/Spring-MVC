package com.jdc.mvc.model;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String getMessage() {
		return "Hello from Root Application Context";
	}

}
