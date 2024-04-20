package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona person = new Persona();
		Calendar aCalendar = Calendar.getInstance();
		System.out.println("Ingrese nombre");
		person.setNombre(scanner.next());
		System.out.println("Ingrese dia de nacimiento");
		aCalendar.set(Calendar.DAY_OF_MONTH, scanner.nextInt());
		System.out.println("Ingrese mes de nacimiento");
		aCalendar.set(Calendar.MONTH, scanner.nextInt());
		System.out.println("Ingrese año de nacimiento");
		aCalendar.set(Calendar.YEAR, scanner.nextInt());
		person.setFnacimiento(aCalendar);
		
		System.out.println(person); 
		System.out.println(person.calcularEdad());
		System.out.println(person.zodiac());
	}

}
