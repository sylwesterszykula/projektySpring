package konfiguracjaWJezukuJavaZamiastXML.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import konfiguracjaWJezukuJavaZamiastXML.context.AppConfigurations;
import konfiguracjaWJezukuJavaZamiastXML.domain.User;
import konfiguracjaWJezukuJavaZamiastXML.impl.UserRepoImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigurations.class);
		UserRepoImpl bean = context.getBean("userRepo", UserRepoImpl.class);
		User createUser = bean.createUser("Sylwester");
		System.out.println(createUser.getName());
	}

}
