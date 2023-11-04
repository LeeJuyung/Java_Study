package org.java_SummerStudy;
import java.util.Scanner;
public class Remove_alp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		System.out.println(a.replaceAll("[CAMBRIDGE]", ""));

	}

}
