package metodaFabrykujaca;

import java.util.logging.Logger;

public class UserCreator {
	Logger logger = Logger.getLogger(this.getClass().getName());
	
	public User createUser(String userName, int userAge){
		logger.info("Create user " + userName + " " + userAge);
		User user = new User();
		user.setName(userName);
		user.setAge(userAge);
		return user;
	}
}
