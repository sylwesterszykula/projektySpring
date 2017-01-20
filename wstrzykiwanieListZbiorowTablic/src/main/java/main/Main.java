package main;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("TEST");
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		SomeBean bean = context.getBean("someBean", SomeBean.class);
		System.out.println(bean.getIntegersSet());
		System.out.println(bean.getStringsList().get(2));
		System.out.println(Arrays.toString(bean.getLongArray()));
	}

}
