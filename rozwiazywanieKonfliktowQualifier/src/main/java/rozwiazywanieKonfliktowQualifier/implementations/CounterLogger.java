package rozwiazywanieKonfliktowQualifier.implementations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import rozwiazywanieKonfliktowQualifier.api.Logger;

@Service("counterLogger") 
@Qualifier("counterLoggerAnnotationQualifier")
public class CounterLogger implements Logger {
	private int counter = 0;

	public void login(String message) {
		System.out.println(counter++ + ": " + message);

	}

}
