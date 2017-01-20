package main;

import java.util.Locale;

public class User {
	private String name;
	private int age;
	private Locale locale;
	public User(String name, int age, Locale locale) {
		this.name = name;
		this.age = age;
		this.locale = locale;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", locale=" + locale + "]";
	}
	
}
