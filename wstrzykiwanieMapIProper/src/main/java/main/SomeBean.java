package main;

import java.util.*;

public class SomeBean {
	private Map<String, Locale> locales;
	private Properties properties;

	public Map<String, Locale> getLocales() {
		return locales;
	}

	public void setLocales(Map<String, Locale> locales) {
		this.locales = locales;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
