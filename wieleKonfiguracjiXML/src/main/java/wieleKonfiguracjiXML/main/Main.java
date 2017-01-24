package wieleKonfiguracjiXML.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import wieleKonfiguracjiXML.impl.UserRepoImpl;

public class Main {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("repositories.xml", "loggers.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		context.getBean("usersRepository", UserRepoImpl.class).createUser("Sylwester");
	}

}
