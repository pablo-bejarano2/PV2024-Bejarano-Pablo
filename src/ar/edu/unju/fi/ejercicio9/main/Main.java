package ar.edu.unju.fi.ejercicio9.main;

import ar.edu.unju.fi.ejercicio9.model.Producto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Producto [] productos = new Producto[3];
		int x;
		for (int i = 0; i < 3; i++) {
			productos[i] = new Producto();
			System.out.println("Ingrese nombre del producto: ");
			productos[i].setNombre(scanner.next());
			System.out.println("Ingrese codigo del producto: ");
			productos[i].setCodigo(scanner.next());
			System.out.println("Ingrese precio del producto: ");
			productos[i].setPrecio(scanner.nextDouble());
			do{
				System.out.println("Ingrese descuento del producto: ");
				x = scanner.nextInt();
			}while(x < 0 || x > 50);
			productos[i].setDescuento(x);
		}
		for(int i=0; i < 3; i++) {
			System.out.println(productos[i]);
			System.out.println("Aplicando el descuento, el precio final del producto es: " + productos[i].calcularDescuento());
		}
	}

}
