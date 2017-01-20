package konfiguracjaZUzyciemAdnotocji.implementations;

import org.springframework.stereotype.Service;

import konfiguracjaZUzyciemAdnotocji.api.Logger;

//@Service("loggerImpl")
public class LoggerImpl implements Logger {
	public void login(String message) {
		System.out.println(message);
	}

}
