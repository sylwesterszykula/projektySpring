package wstrzykiwanieWartosciAdnotacjami.api;

import wstrzykiwanieWartosciAdnotacjami.domain.User;

public interface UserRepo {
	User createUser(String name);
}
