package com.ioc.SpringUsingConfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.SpringUsingConfig.classes.GoldCustomer;
import com.ioc.SpringUsingConfig.classes.PlatinumCustomer;
import com.ioc.config.AppConfig;

@SpringBootApplication
public class SpringUsingConfigApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		GoldCustomer gc = (GoldCustomer) ac.getBean("goldCustomer");
		PlatinumCustomer pc = (PlatinumCustomer) ac.getBean("platinumCustomer");
		gc.disp();
		pc.disp();
	}

}
