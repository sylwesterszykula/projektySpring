package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Application bean = context.getBean("someApplication", Application.class);
		
		System.out.println(bean.getUserRepo().avalibleUser("lol"));
		System.out.println(bean.getDictionaryRepo().getMapValues());
	}

}
