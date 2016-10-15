package exUri.math;

import java.util.Scanner;

public class Ex1380 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		long n1;
		long n2;
		for (int i = 0; i < times; i++) {
			n1 = scanner.nextInt();
			double fibN1 = (Math.pow((1 + Math.sqrt(5)) / 2, n1) - Math.pow((1 - Math.sqrt(5)) / 2, n1)) / Math.sqrt(5);
			n2 = (long) fibN1%1000;
			if(n2<10){
				System.out.println("00"+n2);
			}else if(n2<100){
				System.out.println("0"+n2);
			}else{
				System.out.println(n2);
			}
		}
	}

}
