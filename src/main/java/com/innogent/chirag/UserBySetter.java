package com.innogent.chirag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
public class UserBySetter {
	Iphone iphone;

	public void setIphone(Iphone iphone) {
		this.iphone = iphone;
		System.out.println("using setter injection in user");
	}
	
}
