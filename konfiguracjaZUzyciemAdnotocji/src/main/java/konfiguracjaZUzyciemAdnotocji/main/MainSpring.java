package konfiguracjaZUzyciemAdnotocji.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import konfiguracjaZUzyciemAdnotocji.api.UserRepo;
import konfiguracjaZUzyciemAdnotocji.domain.User;
import konfiguracjaZUzyciemAdnotocji.implementations.UserRepoImpl;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		UserRepoImpl bean = context.getBean("userRepoImpl", UserRepoImpl.class);
		bean.createUser("Sylwek");
		bean.createUser("Sylwek2");
	}

}
