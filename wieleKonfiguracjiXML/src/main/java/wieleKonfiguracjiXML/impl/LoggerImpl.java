package wieleKonfiguracjiXML.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import wieleKonfiguracjiXML.api.Logger;

public class LoggerImpl implements Logger {
	public void login(String message) {
		System.out.println(message);
	}

}
