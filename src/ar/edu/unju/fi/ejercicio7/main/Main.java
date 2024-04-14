package ar.edu.unju.fi.ejercicio7.main;

import ar.edu.unju.fi.ejercicio7.model.Empleado;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		Integer legajo;
		Double salario;
		
		System.out.println("Ingrese nombre del empleado.");
		nombre = scanner.next();
		System.out.println("Ingrese el legajo del empleado.");
		legajo = scanner.nextInt();
		System.out.println("Ingrese el salario del empleado.");
		salario = scanner.nextDouble();
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		System.out.println(empleado);
		empleado.aumentarSalario();
		System.out.println("Con el nuevo salario: ");
		System.out.println(empleado);
		scanner.close();
	}

}
