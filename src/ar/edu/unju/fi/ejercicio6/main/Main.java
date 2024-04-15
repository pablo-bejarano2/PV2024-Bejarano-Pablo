package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.model.Persona;

import java.util.Scanner;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		int dia, mes, anio;
		Scanner scanner = new Scanner(System.in);
		Persona persona1 = new Persona();
		System.out.println("Ingrese nombre de la persona");
		persona1.setNombre(scanner.next());
		System.out.println("Ingrese DNI de la persona");
		persona1.setDni(scanner.nextInt());
		do {
			System.out.println("Ingrese dia de nacimiento de la persona");
			dia = scanner.nextInt();
		}while(dia<1 || dia > 31);
		do {
			System.out.println("Ingrese mes de nacimiento de la persona");
			mes = scanner.nextInt();
		}while(mes<1 || mes > 12);
		do {
			System.out.println("Ingrese año de nacimiento de la persona");
			anio = scanner.nextInt();
		}while(anio<1900);
		LocalDate fecha = LocalDate.of(anio, mes, dia);
		persona1.setFnacimiento(fecha);
		System.out.println("Ingrese provincia de la persona");
		persona1.setProvincia(scanner.next());
		System.out.println(persona1);
		
		
		String nombre, prov;
		int dni;
		System.out.println("Ingrese nombre de la persona");
		nombre = scanner.next();
		System.out.println("Ingrese DNI de la persona");
		dni = scanner.nextInt();
		do {
			System.out.println("Ingrese dia de nacimiento de la persona");
			dia = scanner.nextInt();
		}while(dia<1 || dia > 31);
		do {
			System.out.println("Ingrese mes de nacimiento de la persona");
			mes = scanner.nextInt();
		}while(mes<1 || mes > 12);
		do {
			System.out.println("Ingrese año de nacimiento de la persona");
			anio = scanner.nextInt();
		}while(anio<1900);
		fecha = LocalDate.of(anio, mes, dia);
		System.out.println("Ingrese provincia de la persona");
		prov = scanner.next();
		Persona persona2 = new Persona(dni, nombre, fecha, prov);
		System.out.println(persona2);
		
		System.out.println("Ingrese nombre de la persona");
		nombre = scanner.next();
		System.out.println("Ingrese DNI de la persona");
		dni = scanner.nextInt();
		do {
			System.out.println("Ingrese dia de nacimiento de la persona");
			dia = scanner.nextInt();
		}while(dia<1 || dia > 31);
		do {
			System.out.println("Ingrese mes de nacimiento de la persona");
			mes = scanner.nextInt();
		}while(mes<1 || mes > 12);
		do {
			System.out.println("Ingrese año de nacimiento de la persona");
			anio = scanner.nextInt();
		}while(anio<1900);
		fecha = LocalDate.of(anio, mes, dia);
		Persona persona3 = new Persona(dni, nombre, fecha);
		System.out.println(persona3);
		
		scanner.close();
	}

}
