package ar.edu.unju.fi.ejercicio16.main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int max = 5;
		int ocup;
		Scanner scanner = new Scanner(System.in);
		String cadenas[] = new String[max];
		
		for(ocup = 0; ocup < max; ocup++) {
			System.out.println("Ingrese nombre");
			cadenas[ocup] = scanner.next();
		}
		
		
		
		System.out.print(Arrays.toString(cadenas));
		System.out.println("\n");
		for(int i = 0; i<ocup; i++) {
			System.out.print(" "+ i + " | ");
		}
		System.out.println("\n");
		
		
		System.out.println("Tamaño del arreglo: " + cadenas.length);
		byte remInd;
		do {
			System.out.println("Ingrese un valor entre 0 y 4");
			remInd = scanner.nextByte();
		}while(remInd < 0 | remInd > 4);
		
		for(int i = remInd; i < cadenas.length - 1; i++) {
			cadenas[i] = cadenas[i + 1];
		}
		cadenas[ocup-1] = "";
			
		System.out.print(Arrays.toString(cadenas));
		System.out.println("\n");
		for(int i = 0; i<ocup; i++) {
			System.out.print(" "+ i + " | ");
		}
		System.out.println("\n");
		
		
		scanner.close();
	}

	
}
