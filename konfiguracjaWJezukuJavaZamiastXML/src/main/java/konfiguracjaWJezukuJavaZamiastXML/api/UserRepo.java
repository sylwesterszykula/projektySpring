package konfiguracjaWJezukuJavaZamiastXML.api;

import konfiguracjaWJezukuJavaZamiastXML.domain.User;

public interface UserRepo {
	User createUser(String name);
	public void setLogger(Logger logger);
}
