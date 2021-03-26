package org.opentutorials.javatutorilas.exception;

class A {
	private int[] arr = new int[3];
	
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	
	public void z(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}
	}
}

public class ExceptionDemo1 {
	public static void main(String[] args) {
		A a = new A();
		a.z(10, 0);
		a.z(1, 0);
		a.z(2, 1);
	}
}
