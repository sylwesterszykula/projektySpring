package main;

import api.Logger;
import api.UserRepo;
import domain.User;
import implementations.LoggerImpl;
import implementations.UserRepoImpl;

public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UserRepo userRepo = new UserRepoImpl();
		userRepo.setLogger(logger);
		
		User user = userRepo.createUser("Sylwek");

	}

}
