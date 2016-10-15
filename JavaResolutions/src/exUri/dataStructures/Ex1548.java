package exUri.dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1548 {

	public static Integer[] Sort(Integer[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min =i;
			for (int j = i+1; j < array.length; j++) {
				if(array[j]<array[min]){
					min=j;
				}
			}
			if(min!=i){
				final int temp = array[i];
					array[i] = array[min];
					array[min] = temp;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			int qtPeople = scanner.nextInt();
			int count = 0;
			Integer[] fila = new Integer[qtPeople];
			Integer[] filaOrganizada = new Integer[qtPeople];
			for (int j = 0; j < qtPeople; j++) {
				int k = scanner.nextInt();
				fila[j] = k;
				filaOrganizada[j] = k;
			}
			filaOrganizada = Sort(filaOrganizada);
			for (int j = 0; j < qtPeople; j++) {
				if (fila[j] != filaOrganizada[qtPeople-j-1]) {
					count += 1;
				}
			}
			System.out.println(qtPeople-count);
		}
	}

}
