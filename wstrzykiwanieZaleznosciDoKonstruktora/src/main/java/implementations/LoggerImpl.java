package implementations;

import java.util.Date;

import api.Logger;

public class LoggerImpl implements Logger {
	private String name;
	private int version;
	
	public void login(String message) {
		System.out.println(new Date() + " [" + name + " v." + version + "]: " + message);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
