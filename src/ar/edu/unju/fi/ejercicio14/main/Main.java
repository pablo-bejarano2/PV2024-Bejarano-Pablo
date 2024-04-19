package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.println("Ingrese el rango de la lista de numeros (entre 3 y el 10): ");
			n = scanner.nextInt(); 
		}while(n > 10 || n < 3);
		
		int [] nums = new int[n];
		int suma = 0;
		for(int i = 0; i<n; i++) {
			System.out.println("Ingrese un numero: ");
			nums[i] = scanner.nextInt();
			suma += nums[i];
		}
		for(int i = 0; i<n; i++) {
			System.out.println("Indice: " + i + " tiene el num: " + nums[i]);
		}
		System.out.println("La suma de los numeros es: " + suma);
		scanner.close();
	}

}
