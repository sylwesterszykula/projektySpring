package rozwiazywanieKonfliktowQualifier.implementations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import rozwiazywanieKonfliktowQualifier.api.Logger;

@Service("loggerImpl")
@Qualifier("loggerImplAnnotationQualifier")
public class LoggerImpl implements Logger {
	public void login(String message) {
		System.out.println(message);
	}

}
