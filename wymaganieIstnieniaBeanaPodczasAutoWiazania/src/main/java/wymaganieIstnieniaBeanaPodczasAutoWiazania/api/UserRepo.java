package wymaganieIstnieniaBeanaPodczasAutoWiazania.api;

import wymaganieIstnieniaBeanaPodczasAutoWiazania.domain.User;

public interface UserRepo {
	User createUser(String name);
}
