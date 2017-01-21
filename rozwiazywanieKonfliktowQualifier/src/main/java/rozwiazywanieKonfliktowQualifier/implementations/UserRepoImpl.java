package rozwiazywanieKonfliktowQualifier.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import rozwiazywanieKonfliktowQualifier.api.Logger;
import rozwiazywanieKonfliktowQualifier.api.UserRepo;
import rozwiazywanieKonfliktowQualifier.domain.User;

@Service("userRepoImpl")
public class UserRepoImpl implements UserRepo {
	@Autowired // automatyczne wiazanie
	@Qualifier("counterLoggerXmlQualifier") // dziedziczenie podwojne z
											// interfejsu nie wie gdzie
											// ma wstrzyknac logger
	private Logger logger;

	public User createUser(String name) {
		logger.login("Tworzenie uzytkownika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;

	}

}
