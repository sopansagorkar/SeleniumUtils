package com.cybage.selenium.SeleniumUtils;

public class Barclays {

	public static void main(String a[]) {
		int b = 5;
		int c = 6;
		System.out.println("b= " + b + " " + "c= " + c);
		Barclays barclays = new Barclays();
		barclays.swapNumber(b, c);
	}

	public void swapNumber(int b, int c) {
		b = b + c;
		c = b - c;
		b = b - c;
		System.out.println("b= " + b + " " + "c= " + c);
	}

}
