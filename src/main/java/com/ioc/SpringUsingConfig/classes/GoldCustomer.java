package com.ioc.SpringUsingConfig.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GoldCustomer {
	String type;

	@Autowired
	public void setType(@Value("Gold Customer") String type) {
		this.type = type;
	}
	
	public void disp() {
		System.out.println("This is "+type);
	}
}

