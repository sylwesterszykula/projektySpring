package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context1.xml");
		SomeBean bean = context.getBean("someBean", SomeBean.class);
		System.out.println(bean.getLocales());
		System.out.println(bean.getProperties());
	}

}
