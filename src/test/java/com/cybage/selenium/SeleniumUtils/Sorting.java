package com.cybage.selenium.SeleniumUtils;

public class Sorting {
	public static void main(String a[]) {
		int array[] = { 19, 14, 21, 31, 84, 9 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}
		System.out.print("Ascending Order: ");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
