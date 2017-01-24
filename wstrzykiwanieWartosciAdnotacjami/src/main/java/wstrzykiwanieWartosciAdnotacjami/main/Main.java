package wstrzykiwanieWartosciAdnotacjami.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import wstrzykiwanieWartosciAdnotacjami.domain.User;
import wstrzykiwanieWartosciAdnotacjami.impl.UserRepoImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		UserRepoImpl bean = context.getBean("userRepoImpl", UserRepoImpl.class);
		User sylwester = bean.createUser("Sylwester");
		System.out.println("Uzytkownik " + sylwester.getName() + " zostal utworzony");
		
	}

}
