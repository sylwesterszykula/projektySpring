package api;

import domain.User;

public interface UserRepo {
	User createUser(String name);
	void setLogger (Logger logger);
}
