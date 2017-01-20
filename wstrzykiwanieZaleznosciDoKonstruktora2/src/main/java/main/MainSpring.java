package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import impl.SomeBean;


public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		
//		alt + shift + l
		SomeBean bean = context.getBean("someBean", SomeBean.class);
	}
}
