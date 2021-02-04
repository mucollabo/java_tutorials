package org.opentutorials.javatutorials.array;

public class ForeachDemo {
	public static void main(String[] args) {
		String[] members = {"안길환", "김형엽", "안정민"};
		for (String e : members) {
			System.out.println(e + "이 상담을 받았습니다.");
		}
	}
}
