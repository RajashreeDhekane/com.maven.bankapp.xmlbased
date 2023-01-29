package com.maven.bankapp.xmlbased;

import org.springframework.stereotype.Component;

@Component
public class Engineer implements Employee {

	public String work() {
		return "Engineer start work....";
		
	}
}
