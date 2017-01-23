package wstrzykiwanieZUzyciemResource.api;

import wstrzykiwanieZUzyciemResource.domain.User;

public interface UserRepo {
	User createUser(String name);
	void setLogger (Logger logger);
}
