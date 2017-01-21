package rozwiazywanieKonfliktowQualifier.api;

import rozwiazywanieKonfliktowQualifier.domain.User;

public interface UserRepo {
	User createUser(String name);
	void setLogger (Logger logger);
}
