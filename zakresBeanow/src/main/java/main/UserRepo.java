package main;

public class UserRepo {
	private static int instance = 0;
	private int instanceNumber = instance++;

	public int getInstanceNumber() {
		return instanceNumber;
	}

	public void setInstanceNumber(int instanceNumber) {
		this.instanceNumber = instanceNumber;
	}
}
