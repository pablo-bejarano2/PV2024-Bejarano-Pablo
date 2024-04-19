package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] nums = new int[8];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<8; i++) {
			System.out.println("Ingrese un numero: ");
			nums[i] = scanner.nextInt();
		}
		for(int i = 0; i<8; i++) {
			System.out.println("Indice: " + i + " tiene el num: " + nums[i]);
		}
		scanner.close();
	}

}
