package implementations;

import api.Logger;

public class LoggerImpl implements Logger {

	public void login(String message) {
		System.out.println(message);
	}

}
