package main;

import java.util.*;

public class SomeBean {
	private List<String> stringsList;
	private Set<Integer> integersSet;
	private Long[] longArray;

	public SomeBean(List<String> stringsList, Set<Integer> integersSet, Long[] longArray) {
		super();
		this.stringsList = stringsList;
		this.integersSet = integersSet;
		this.longArray = longArray;
	}

	public List<String> getStringsList() {
		return stringsList;
	}

	public void setStringsList(List<String> stringsList) {
		this.stringsList = stringsList;
	}

	public Set<Integer> getIntegersSet() {
		return integersSet;
	}

	public void setIntegersSet(Set<Integer> integersSet) {
		this.integersSet = integersSet;
	}

	public Long[] getLongArray() {
		return longArray;
	}

	public void setLongArray(Long[] longArray) {
		this.longArray = longArray;
	}

}
