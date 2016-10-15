package exUri.dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class Ex1069 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack stack = new Stack();
		int times = scanner.nextInt();
		int count = 0;
		String words;
		for (int i = 0; i < times; i++) {
			words = scanner.next();
			for (int j = 0; j < words.length(); j++) {
				if (words.charAt(j) == '<') {
					stack.add('<');
				} else if (words.charAt(j) == '>') {
					if (!stack.isEmpty()) {
						stack.pop();
						count++;
					}
				}
			}
			stack.clear();
			System.out.println(count);
			count = 0;
		}
	}

}
