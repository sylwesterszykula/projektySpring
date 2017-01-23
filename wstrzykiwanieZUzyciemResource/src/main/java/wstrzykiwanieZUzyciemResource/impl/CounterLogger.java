package wstrzykiwanieZUzyciemResource.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import wstrzykiwanieZUzyciemResource.api.Logger;

@Service("counterLogger") 
public class CounterLogger implements Logger {
	private int counter = 0;

	public void login(String message) {
		System.out.println(counter++ + ": " + message);

	}

}
