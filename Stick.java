package org.java_SummerStudy;
import java.util.Scanner;
public class Stick {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Stick=64;
		int cnt=0;
		
		while(X>0) {
			if(Stick>X) {
				Stick/=2;
			}
			else {
				X-=Stick;
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
