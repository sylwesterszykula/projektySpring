package wieleKonfiguracjiXML.api;

import wieleKonfiguracjiXML.domain.User;

public interface UserRepo {
	User createUser(String name);
	void setLogger(Logger logger);
}
