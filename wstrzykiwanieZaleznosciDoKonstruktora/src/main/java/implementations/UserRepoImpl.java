package implementations;
import api.Logger;
import api.UserRepo;
import domain.User;

public class UserRepoImpl implements UserRepo{
	private Logger logger;
	
	public UserRepoImpl(Logger logger, String localizationRepo, String localizationDisc) {
		this.logger = logger;
		logger.login("Lokalizacja Repozytorium: " + localizationRepo + "-" + localizationDisc);
	}

	public User createUser(String name) {
		logger.login("Tworzenie uzytkownika " + name);
		return new User(name);
	}	
}
