package implementations;
import api.Logger;
import api.UserRepo;
import domain.User;

public class UserRepoImpl implements UserRepo{
	private Logger logger;
	public User createUser(String name) {
		logger.login("Tworzenie uzytkownika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
		
	}
	
}
