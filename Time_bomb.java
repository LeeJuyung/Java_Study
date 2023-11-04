package org.java_SummerStudy;

import java.util.Scanner;

public class Time_bomb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt(); // 시작한사람
		int N = sc.nextInt(); // 질문수
		String[] arr = { "1", "2", "3", "4", "5", "6", "7", "8" };
		int sum = 0;
		//.split(" ") 함수 = 띄어쓰기로 구분자. 
		//String을 int로 parese int?
		for (int i = 0; i < N; i++) {
			int T = sc.nextInt();
			String Z = sc.next();
			sum += T;
			if (sum >= 210) {
				break;
			}
			if (K == 8)
				K = 0;
			if (Z.equals("T"))
				//정답만 말해야 넘어감, N P 안됨
				K++;
		}

		System.out.println(arr[K - 1]);
	}

}
