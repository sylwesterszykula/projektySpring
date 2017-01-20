package main;

public class SomeBean {
	private String test;

	public void init() {
		System.out.println("Create bean");
		test = "Dawaj Flaszke";
	}

	public void isWorkingThisBean() {
		System.out.println(test);
	}
}
