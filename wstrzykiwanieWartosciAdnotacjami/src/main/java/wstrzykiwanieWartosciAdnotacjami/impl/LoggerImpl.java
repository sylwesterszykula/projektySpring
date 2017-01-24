package wstrzykiwanieWartosciAdnotacjami.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import wstrzykiwanieWartosciAdnotacjami.api.Logger;

@Service("loggerImpl")
public class LoggerImpl implements Logger {
	public void login(String message) {
		System.out.println(message);
	}

}
