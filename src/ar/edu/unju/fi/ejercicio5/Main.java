package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n, i;
		do {
			System.out.println("Ingrese un numero");
			n = scanner.nextInt();
		}while(n<1 || n>9);
		for(i=0;i<=10;i++) {
			System.out.println(n + " * " + i + " = " + (i*n));
		}
		scanner.close();
	}

}
