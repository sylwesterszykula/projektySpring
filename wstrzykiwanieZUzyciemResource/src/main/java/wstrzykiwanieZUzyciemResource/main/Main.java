package wstrzykiwanieZUzyciemResource.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import wstrzykiwanieZUzyciemResource.impl.UserRepoImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		UserRepoImpl bean = context.getBean("userRepoImpl", UserRepoImpl.class);
		bean.createUser("Sylwek");
	}

}
