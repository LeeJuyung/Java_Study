package org.java_SummerStudy;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		int[] aa = new int[26];
        int[] bb = new int[26];

        for (int i = 0; i < a.length(); i++) aa[a.charAt(i) - 'a']++;
        for (int i = 0; i < b.length(); i++) bb[b.charAt(i) - 'a']++;

        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            cnt += Math.abs(aa[i] - bb[i]);
        }
        System.out.println(cnt);
    }
}