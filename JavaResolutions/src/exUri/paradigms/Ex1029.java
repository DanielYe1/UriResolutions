package exUri.paradigms;

import java.util.Scanner;

public class Ex1029 {
	
	static int k = 0;
	static int fib(int x){
		if(x==0){
			k++;
			return 0;
		}else if(x == 1){
			k++;
			return 1;
		}else{
			k++;
			return fib(x-1) + fib(x-2);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
		int num = scanner.nextInt();
		int x = fib(num);
		System.out.println(String.format("fib(%d) = %d calls = %d", num, k-1, x));
		k = 0;
		}
	}

}
