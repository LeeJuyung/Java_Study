package org.java_SummerStudy;

import java.util.Scanner;

public class Apartment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] apt = new int[15][15];

		for (int i = 0; i < 15; i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}
		for (int k = 1; k < 15; k++) {
			for (int n = 2; n < 15; n++) {
				apt[k][n]= apt[0][1]+apt[0][n];
			}
		}
		for (int i = 0; i < T; i++) {
			int K = sc.nextInt();
			int N = sc.nextInt();

			System.out.println(apt[K][N]);
		}
	}

}
