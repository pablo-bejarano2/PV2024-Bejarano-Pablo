package ar.edu.unju.fi.ejercicio10.main;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Pizza [] pizza = new Pizza[3];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			pizza[i] = new Pizza();
			Double diametro;
			boolean flag = true;
			do {
				System.out.println("Ingrese el tamaño de la pizza, 20 para una pizza pequeña, 30 mediana y 40 una pizza grande");
				diametro = scanner.nextDouble();
				if(diametro == 20 || diametro == 30 || diametro == 40) {
					flag = false;
				}
			}while(flag);
			
			pizza[i].setDiametro(diametro);
			
			char ing = 's';
			flag = true;
			do {
				System.out.println("Quieres ingredientes especiales? Responde S/N");
				ing = scanner.next().charAt(0);
				if(ing == 's' || ing == 'S' || ing == 'N' || ing == 'n') {
					flag = false;
				}
			}while(false);
			if(ing == 's' || ing == 'S') {
				pizza[i].setIngredientes(true);
			}
			if(ing == 'n' || ing == 'N') {
				pizza[i].setIngredientes(false);
			}
			pizza[i].calcularArea();
			
			if(pizza[i].getDiametro() == 20) {
				pizza[i].setPrecio(4500.0);
				if(pizza[i].getIngredientes() == true) {
					pizza[i].setPrecio(pizza[i].getPrecio() + pizza[i].getEspeciales20());
				}
			}
			if(pizza[i].getDiametro() == 30) {
				pizza[i].setPrecio(4800.0);
				if(pizza[i].getIngredientes() == true) {
					pizza[i].setPrecio(pizza[i].getPrecio() + pizza[i].getEspeciales30());
				}
			}
			if(pizza[i].getDiametro() == 40) {
				pizza[i].setPrecio(5500.0);
				if(pizza[i].getIngredientes() == true) {
					pizza[i].setPrecio(pizza[i].getPrecio() + pizza[i].getEspeciales40());
				}
			}
			System.out.println(pizza[i]);
		}
		scanner.close();
		
	}

}
