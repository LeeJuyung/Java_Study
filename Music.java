package org.java_SummerStudy;
import java.util.Arrays;
import java.util.Scanner;
public class Music {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]as= {1,2,3,4,5,6,7,8};
		int[]ds= {8,7,6,5,4,3,2,1};
		int[] arr = new int[8];
		for(int i=0;i<8;i++){
			arr[i] = sc.nextInt();
	}
		if(Arrays.equals(arr,as)) {
			System.out.println("ascending");
		}else if(Arrays.equals(arr, ds)) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
}}
