package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("TEST");
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		User bean = context.getBean("someUser", User.class);
		User bean2 = context.getBean("someUserNULL",User.class);
		System.out.println(bean.toString());
		System.out.println(bean2.toString());
	}

}
