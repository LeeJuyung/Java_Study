package org.java_SummerStudy;

import java.util.Scanner;

public class Sum_delivery {

	public static void main(String[] args) {
		//%나머지, /나누기
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int sum=0;
		while(true) {
			if(N%5==0) {
				sum+=N/5;
				System.out.println(sum);
				break;
			}
			else {
				N-=3;
				sum++;
			}
			if(N<0) {
				System.out.println("-1");
				break;
			}
		}
	}}