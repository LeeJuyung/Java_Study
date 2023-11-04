package org.java_SummerStudy;

import java.util.Arrays;
import java.util.Scanner;

public class Sum100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		// 9명 합에서 2명 값 뺀 게 100이면 출력
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					arr[i] = 0;
					arr[j] = 0;
					Arrays.sort(arr);
					for (int k = 2; k < 9; k++) {
						System.out.println(arr[k]);
					}
					return;
				}
			}
		}
	}
}
