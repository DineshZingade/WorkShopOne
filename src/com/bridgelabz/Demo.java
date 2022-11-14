package com.bridgelabz;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int a[] = new int[5];
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Array");
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		max = a[0];
		for (int i = 1; i <= 4; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("Largest Number is: " + max);
		if (max % 2 == 0) {
			System.out.println("Number isEven Number ");

		} else {
			System.out.println("Number is Odd Number ");
		}

	}
}
