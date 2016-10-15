package exUri.beginner;

import java.util.Scanner;

public class Ex1049 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String classes0 = scanner.next();
		String classes1 = scanner.next();
		String classes2 = scanner.next();

		if (classes1.equals("ave")) {
			if (classes2.equals("carnivoro")) {
				System.out.println("aguia");
			} else if (classes2.equals("onivoro")) {
				System.out.println("pomba");
			}
		} else if (classes1.equals("mamifero")) {
			if (classes2.equals("onivoro")) {
				System.out.println("homem");
			} else if (classes2.equals("herbivoro")) {
				System.out.println("vaca");
			}
		} else if (classes1.equals("inseto")) {
			if (classes2.equals("hematofago")) {
				System.out.println("pulga");
			} else if (classes2.equals("herbivoro")) {
				System.out.println("lagarta");
			}
		} else if (classes1.equals("anelideo")) {
			if (classes2.equals("hematofago")) {
				System.out.println("sanguessuga");
			} else if (classes2.equals("onivoro")) {
				System.out.println("minhoca");
			}

		}
	}
}
