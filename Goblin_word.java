package org.java_SummerStudy;

import java.util.Scanner;

public class Goblin_word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = { 'a', 'e', 'i', 'o', 'u' };

		while (true) {
			String word = sc.next();
			boolean b = false;

			if (word.equals("#")) {
				break;
			}
			for (int i = 0; i < word.length(); i++) {
				for (int j = 0; j < word.length(); j++) {
					if (b)
						break;
					else if (word.charAt(i) == a[j]) {
						word = word.substring(i) + word.substring(0, i);
						System.out.println(word + "ay");
						b = true;
					}
				}
			}
		}
	}
}
