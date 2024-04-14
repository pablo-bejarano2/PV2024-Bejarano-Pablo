package ar.edu.unju.fi.ejercicio8.main;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero");
		calculadora.setN(scanner.nextInt());
		System.out.println("La sumatoria del numero " + calculadora.getN() + " es: "+ calculadora.calcularSumatoria());
		System.out.println("La sumatoria del numero " + calculadora.getN() + " es: "+ calculadora.calcularProductoria());
	}

}
