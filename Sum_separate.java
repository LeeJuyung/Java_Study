package org.java_SummerStudy;

import java.util.Scanner;

public class Sum_separate {

	public static void main(String[] args) {
		//256입력 245출력(245+2+4+5)
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int jari = String.valueOf(N).length();
		int start = N-(9*jari);
		int ans=0;
		
		for(int i=start;i<N;i++) {
			int sum=i;
			int k=i;
			while(k>0) {
				sum+=k%10;
				k/=10;
			}
			if(sum==N) {
				ans=i;
				break;
			}
		}
		System.out.println(ans);
	}

}
