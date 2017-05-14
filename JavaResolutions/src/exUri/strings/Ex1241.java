package exUri.strings;

import java.util.Scanner;

public class Ex1241 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			String val1 = scanner.next();
			String val2 = scanner.next();
			if(val2.length()> val1.length()){
				System.out.println("nao encaixa");
			}else{
				String temp = val1.substring(val1.length()-val2.length());
				if(temp.equals(val2)){
					System.out.println("encaixa");
				}else{
					System.out.println("nao encaixa");
				}
			}
		}
	}

}
