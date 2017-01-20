package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import api.UserRepo;
import domain.User;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		
		UserRepo userRepo = context.getBean("userRepo", UserRepo.class);
		
		User sylwek = userRepo.createUser("Sylwek");
	}
}
