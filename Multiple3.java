package org.java_SummerStudy;

import java.util.Scanner;

public class Multiple3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		String B = sc.next();
        
		sc.close();
 
		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
 
	}
}

//String char로바꾸는 게 charAt임. 캐릭터타입으로