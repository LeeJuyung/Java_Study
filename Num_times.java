package org.java_SummerStudy;

import java.util.Scanner;

public class Num_times {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int mul = A * B * C;

		String s = Integer.toString(mul);

		for (int i = 0; i < 10; i++) {
			int cnt = 0;
			for (int j = 0; j < s.length(); j++) {
				if ((s.charAt(j) - '0') == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}