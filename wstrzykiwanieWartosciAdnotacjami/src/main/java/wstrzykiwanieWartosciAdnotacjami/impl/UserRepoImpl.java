package wstrzykiwanieWartosciAdnotacjami.impl;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wstrzykiwanieWartosciAdnotacjami.api.Logger;
import wstrzykiwanieWartosciAdnotacjami.api.UserRepo;
import wstrzykiwanieWartosciAdnotacjami.domain.User;

@Service("userRepoImpl")
public class UserRepoImpl implements UserRepo {
	@Autowired(required = false) // kiedy dany bean nie istnieje, ustawienie na
									// false spowoduje ze porgarm nam nie nie
									// wywali
									// i nic nie zrobi z beanem ktorego nie ma
									// (ale pozniej
									// moze byc)
	private Logger logger;

	public User createUser(String name) {
		if (logger != null) {
			logger.login("Tworzenie uzytkownika " + name);
		}
		return new User(name);

	}

}
