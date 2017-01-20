package main;

public class SomeBean {
	private String stringValue;
	private int intValue;
	private User user;
	
	public String getStringValue() {
		return stringValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "SomeBean [stringValue=" + stringValue + ", intValue=" + intValue + ", user=" + user + "]";
	}
	
}
