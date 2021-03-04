package org.opentutorials.javatutorials.interfaces.example2;

class CalculatorConsumer implements Calculatable {
	public void setOperands(int first, int second, int third) {
		
	}
	
	public int sum() {
		return 60;
	}
	
	public int avg() {
		return 20;
	}
}

public class CalculatorConsumer {
	public static void main(String[] args) {
		CalculatorConsumer c = new CalculatorConsumer();
		c.setOperands(10, 20, 30);
		System.out.println(c.sum() + c.avg());
	}
}
