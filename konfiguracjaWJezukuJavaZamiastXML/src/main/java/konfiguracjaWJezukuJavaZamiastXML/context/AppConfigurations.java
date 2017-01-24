package konfiguracjaWJezukuJavaZamiastXML.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import konfiguracjaWJezukuJavaZamiastXML.api.Logger;
import konfiguracjaWJezukuJavaZamiastXML.api.UserRepo;
import konfiguracjaWJezukuJavaZamiastXML.domain.User;
import konfiguracjaWJezukuJavaZamiastXML.impl.LoggerImpl;
import konfiguracjaWJezukuJavaZamiastXML.impl.UserRepoImpl;

@Configuration
public class AppConfigurations {
	@Bean
	public Logger logger() {
		return new LoggerImpl();
	}
	
	@Bean
	public UserRepo userRepo() {
		UserRepoImpl userRepoImpl = new UserRepoImpl();
		userRepoImpl.setLogger(logger());
		return userRepoImpl;
	}
}
