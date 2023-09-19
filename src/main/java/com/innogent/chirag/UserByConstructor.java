package com.innogent.chirag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserByConstructor {
	Iphone iphone;

	@Autowired
	public UserByConstructor(@Qualifier("13") Iphone iphone  ) {
		super();
		this.iphone = iphone;
		System.out.println("using user constructor injection");
	}

	public Iphone getIphone() {
		return iphone;
	}

	public void setIphone(Iphone iphone) {
		System.out.println("USING SETTER METHOD");
		this.iphone = iphone;
	}
	
	
	
}
