package com.innogent.chirag;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class FirstSpringBootAppApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		UserByAutowire user1= (UserByAutowire)context.getBean("userByAutowire");
		user1.iphone.onClickActionButton();
		UserBySetter user2= context.getBean(UserBySetter.class);
		user2.iphone.onDoubleTab();
		UserByConstructor user3=(UserByConstructor)context.getBean("userByConstructor");
		user3.iphone.onHold();
	}

}
@Configuration
@ComponentScan
 class MyConfig{
	@Bean
	public Iphone getIphone14() {
		return new Iphone14();
	}
	@Bean
	public UserBySetter getUserBySetter() {
		UserBySetter user = new UserBySetter();
		user.setIphone(getIphone14());
		return user;
	}
}

interface Iphone{
	public void onClickActionButton();
	public void onDoubleTab();
	public void onHold();
	
}

@Component
@Qualifier("13")
class Iphone13 implements Iphone{

	@Override
	public void onClickActionButton() {
		// TODO Auto-generated method stub
		System.out.println("13-Opening back camera");
	}

	@Override
	public void onDoubleTab() {
		// TODO Auto-generated method stub
		System.out.println("13-flipping the camera");
	}

	@Override
	public void onHold() {
		// TODO Auto-generated method stub
		System.out.println("13-opening music player");
	}
	
}
@Component
@Qualifier("14")
class Iphone14 implements Iphone{

	@Override
	public void onClickActionButton() {
		// TODO Auto-generated method stub
		System.out.println("14-Opening TikTok live Web Camera");
		
	}

	@Override
	public void onDoubleTab() {
		// TODO Auto-generated method stub
		System.out.println("14-Opening profile of TikTok");
	}

	@Override
	public void onHold() {
		// TODO Auto-generated method stub
		System.out.println("14-Opening reels ");
	}
	
}
@Component
@Primary
class Iphone15 implements Iphone{
	
	@Override
	public void onClickActionButton() {
		// TODO Auto-generated method stub
		System.out.println("15-Opens reels on Instagram");
	}
	
	@Override
	public void onDoubleTab() {
		// TODO Auto-generated method stub
		System.out.println("15-Opens camera for reel creation on instagram");
	}
	
	@Override
	public void onHold() {
		// TODO Auto-generated method stub
		System.out.println("15-Opens story tab for story sharing");
	}
	
}