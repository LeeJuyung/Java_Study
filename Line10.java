package org.java_SummerStudy;
import java.util.Scanner;

public class Line10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String a= s.substring(0,10);
		String b= s.substring(10,s.length());
		System.out.println(a);
		System.out.println(b);

	}

}
