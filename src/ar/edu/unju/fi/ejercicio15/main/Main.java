package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max; 
		do {
			System.out.println("Ingrese el rango de la lista de strings (entre 5 y 10): ");
			max = scanner.nextInt();
			
		}while(max < 5 || max > 10);
		String [] array = new String[max];
		for(int i = 0; i<max; i++) {
			System.out.println("Ingresa cadena: ");
			array[i] = scanner.next();
		}
		
		System.out.println("Arreglo en orden: ");
		for(int i = 0; i<max; i++) {
			System.out.println("Posicion: "+ i + " contenido: " + array[i]);
		}
		System.out.println("Arreglo en orden: ");
		for(int i = max-1; i>=0; i--) {
			System.out.println("Posicion: "+ i + " contenido: " + array[i]);
		}
		scanner.close();
	}

}
