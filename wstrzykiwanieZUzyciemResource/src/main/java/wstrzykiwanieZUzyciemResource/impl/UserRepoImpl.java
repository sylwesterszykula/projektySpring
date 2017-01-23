package wstrzykiwanieZUzyciemResource.impl;

import javax.annotation.*;
import org.springframework.stereotype.Service;

import wstrzykiwanieZUzyciemResource.api.Logger;
import wstrzykiwanieZUzyciemResource.api.UserRepo;
import wstrzykiwanieZUzyciemResource.domain.User;

@Service("userRepoImpl")
public class UserRepoImpl implements UserRepo {
	//@Resource(name = "loggerImpl")
	private Logger logger;

	public User createUser(String name) {
		logger.login("Tworzenie uzytkownika " + name);
		return new User(name);
	}
	@Resource(name = "loggerImpl")
	public void setLogger(Logger logger) {
		this.logger = logger;

	}

}
