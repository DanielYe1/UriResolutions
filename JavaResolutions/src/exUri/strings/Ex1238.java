package exUri.strings;

import java.util.Scanner;

public class Ex1238 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			String s1 = scanner.next();
			String s2 = scanner.next();
			int lower = 0;
			boolean s1Higher;
			if(s1.length()>s2.length()){
				lower = s2.length();
				s1Higher = true;
			}else{
				lower = s1.length();
				s1Higher = false;
			}
			StringBuilder ans = new StringBuilder();
			for (int j = 0; j < lower; j++) {
				ans.append(s1.charAt(j));
				ans.append(s2.charAt(j));
			}
			if(s1Higher){
				ans.append(s1.substring(lower));
			}else{
				ans.append(s2.substring(lower));
			}
			System.out.println(ans);
		}
	}

}
