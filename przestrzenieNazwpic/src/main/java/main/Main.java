package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean bean = context.getBean("someBeam", SomeBean.class);
		
		System.out.println(bean.getUser().toString());
		System.out.println(bean.toString());
	}

}
