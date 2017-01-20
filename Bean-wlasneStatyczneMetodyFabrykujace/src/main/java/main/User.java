package main;

public class User {
	private String name;
	private int age;
	private User() {}; // nie da sie utworzyc urzytkownia poprzez konstruktor
					   // poniewaz jest prywatny
	public User(String name, int age){
		this.name = name;
		this.age = age;
	}
	public static User getInstance(String name, int age){ //public static bo nie podpowie mi w beanie
		User user = new User();
		user.name = name;
		user.age = age;
		return user;
	}

	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
