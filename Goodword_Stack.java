package org.java_SummerStudy;

import java.util.Stack;
import java.util.Scanner;

public class Goodword_Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int N = sc.nextInt();
		// AA, BB가 나오면 스택에서 제거. 남은 스택 수 출력
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			Stack<Character> stack = new Stack<>();
			
			for (int j = 0; j < s.length(); j++) {
				if (stack.size() > 0 && stack.peek() == s.charAt(j)) {
					//이전문자, 현재문자 같다면 pop 값 빼기
					stack.pop();
				} else {
					//push 값 추가
					stack.push(s.charAt(j));
				}
			}
			if (stack.size() == 0)
				//스택에 아무것도 없으면 좋은문자 = cnt++
				cnt++;
		}
		System.out.println(cnt);
	}
}