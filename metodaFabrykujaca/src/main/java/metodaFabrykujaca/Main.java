package metodaFabrykujaca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("Context.xml");

		User user = applicationContext.getBean("someUser", User.class);
		System.out.println(user);
	}

}
