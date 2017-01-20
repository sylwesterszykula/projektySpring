package main;

import org.springframework.beans.factory.InitializingBean;

public class SomeBeam implements InitializingBean {

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inicjalizacja");

	}

}
