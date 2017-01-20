package main;

public class Application {
	private UserRepo userRepo;
	private DictionaryRepo dictionaryRepo;

	public Application(UserRepo userRepo, DictionaryRepo dictionaryRepo) {
		this.userRepo = userRepo;
		this.dictionaryRepo = dictionaryRepo;
	}

	public UserRepo getUserRepo() {
		return userRepo;
	}

	public DictionaryRepo getDictionaryRepo() {
		return dictionaryRepo;
	}

	/*
	 * public DictionaryRepo getDictionaryRepo() { return dictionaryRepo; }
	 * 
	 * public void setDictionaryRepo(DictionaryRepo dictionaryRepo) {
	 * this.dictionaryRepo = dictionaryRepo; }
	 * 
	 * public UserRepo getUserRepo() { return userRepo; }
	 * 
	 * public void setUserRepo(UserRepo userRepo) { this.userRepo = userRepo; }
	 */
}
