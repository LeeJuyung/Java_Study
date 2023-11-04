package org.java_SummerStudy;

public class 재귀함수2 {
	
	public static void main(String[] args) {
		boom(10);
	}
	public static void boom(int i) {
		
		if(i==0) {
			System.out.println("뻥");
			return;
		}
		System.out.println(i);
		boom(i-1);

	}
}


