package org.opentutorials.javatutorilas.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

class B {
	void run() throws FileNotFoundException, IOException {
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
}

class C {
	void run() throws FileNotFoundException, IOException {
		B b = new B();
		b.run();
	}
}

public class ThrowExceptionDemo {
	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt 파일은 설정 파일입니다. 이 파일이 프로젝트 루트 디렉터리에 존재해야 합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
