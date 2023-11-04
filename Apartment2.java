package org.java_SummerStudy;

import java.util.Scanner;

public class Apartment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int K=sc.nextInt();
			int N=sc.nextInt();
			System.out.println(apt(K,N));
			}
		}

	public static int apt(int k, int n) {
		if (n == 1)
			return 1;
		if (k == 0)
			return n;
		return apt(k, n - 1) + apt(k - 1, n);
	}
}