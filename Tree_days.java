package org.java_SummerStudy;

import java.util.Arrays;
import java.util.Scanner;

public class Tree_days {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < N; i++) {
			arr[i]+=i;
			//System.out.print(arr[i] + " ");
			if(arr[i]>cnt)
				cnt=arr[i];
		}
		//System.out.println();
		System.out.print(cnt);
		//int(정수 기본자료형) integer(정수 클래스 형태) 차이
		//colection reverse order는 integer만 가능
	}
}