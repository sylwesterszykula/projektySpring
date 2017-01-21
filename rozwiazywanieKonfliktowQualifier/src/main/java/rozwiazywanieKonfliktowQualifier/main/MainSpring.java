package rozwiazywanieKonfliktowQualifier.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import rozwiazywanieKonfliktowQualifier.api.UserRepo;
import rozwiazywanieKonfliktowQualifier.domain.User;
import rozwiazywanieKonfliktowQualifier.implementations.UserRepoImpl;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		UserRepoImpl bean = context.getBean("userRepoImpl", UserRepoImpl.class);
		bean.createUser("Sylwek");
	}

}
