package org.java_SummerStudy;

import java.util.Scanner;

public class Int_triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][];

		for (int i = 0; i < N; i++) {
			arr[i] = new int[i + 1];

			for (int j = 0; j <= i; j++)
				arr[i][j] = sc.nextInt();
		}

		for (int i = N - 1; i > 0; i--) {
			for (int j = 0; j < i; j++)
				arr[i - 1][j] += Math.max(arr[i][j], arr[i][j + 1]);
		}

		System.out.println(arr[0][0]);

	}
}