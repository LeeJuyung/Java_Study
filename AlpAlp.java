package org.java_SummerStudy;
import java.util.Scanner;
public class AlpAlp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			String s=sc.next();
			int max=1;
			char ch=s.charAt(0);
			int temp=1;
		
			for(int j=1;j<s.length();j++) {
				if(s.charAt(j)==ch) {
					temp++;
				}
				else {
					ch=s.charAt(j);
					temp=1;
				}
				if(temp>=max) {
					max=temp;
				}
			}
			System.out.println(max);
			
		}
	}

}
