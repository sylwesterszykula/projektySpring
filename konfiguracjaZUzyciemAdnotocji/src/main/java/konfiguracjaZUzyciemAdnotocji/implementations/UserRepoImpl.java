package konfiguracjaZUzyciemAdnotocji.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import konfiguracjaZUzyciemAdnotocji.api.Logger;
import konfiguracjaZUzyciemAdnotocji.api.UserRepo;
import konfiguracjaZUzyciemAdnotocji.domain.User;

//@Service("userRepoImpl")
public class UserRepoImpl implements UserRepo {
	@Autowired // automatyczne wiazanie
	private Logger logger;

	public User createUser(String name) {
		logger.login("Tworzenie uzytkownika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;

	}

}
