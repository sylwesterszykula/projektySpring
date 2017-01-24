package wieleKonfiguracjiXML.impl;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wieleKonfiguracjiXML.api.Logger;
import wieleKonfiguracjiXML.api.UserRepo;
import wieleKonfiguracjiXML.domain.User;

public class UserRepoImpl implements UserRepo {
	private Logger logger;

	public User createUser(String name) {
		if (logger != null) {
			logger.login("Tworzenie uzytkownika " + name);
		}
		return new User(name);

	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}
