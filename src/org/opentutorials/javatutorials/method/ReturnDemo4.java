package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {
	public static String[] getMembers() {
		String[] members = {"안길환", "김형엽", "안정민"};
		return members;
	}
	
	public static void main(String[] args) {
		String[] members = getMembers();
	}
}
