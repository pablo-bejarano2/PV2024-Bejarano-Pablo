package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int resultado;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		num = scanner.nextInt();
		if(num%2==0) {
			resultado = num*2;
			System.out.println(resultado);
		}else {
			resultado = num*3;
			System.out.println(resultado);
		}
		scanner.close();
	}

}