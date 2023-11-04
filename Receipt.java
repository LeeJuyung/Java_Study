package org.java_SummerStudy;

import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = sc.nextInt();
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += a * b;

		}

		if (sum == tot) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
