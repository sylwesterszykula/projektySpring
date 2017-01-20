package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Component1 bean1 = context.getBean("component1", Component1.class);
		Component2 bean2 = context.getBean("component2", Component2.class);
		System.out.println(bean1.getUserRepo().getInstanceNumber());
		System.out.println(bean2.getUserRepo().getInstanceNumber());
		
		System.out.println(context.getBean("component1", Component1.class).getUserRepo().getInstanceNumber());
		System.out.println(context.getBean("component1", Component1.class).getUserRepo().getInstanceNumber());
		System.out.println(context.getBean("component1", Component1.class).getUserRepo().getInstanceNumber());
		System.out.println(context.getBean("component1", Component1.class).getUserRepo().getInstanceNumber());
		System.out.println(context.getBean("component1", Component1.class).getUserRepo().getInstanceNumber());
	}
}
