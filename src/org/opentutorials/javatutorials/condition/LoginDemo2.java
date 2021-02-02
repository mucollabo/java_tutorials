package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {
	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if (id.contentEquals("charles")) {
			if (password.contentEquals("111111")) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		} else {
			System.out.println("wrong");
		}
	}
}
