package ar.edu.unju.fi.ejercicio17.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static List<Jugador> jugadores;
	public static void main(String[] args) {
		int op = 0;
		int last = -1;
		jugadores = new ArrayList<Jugador>();
		
		do {
			mostrarMenu();
			try {
				System.out.println("Ingrese una opcion");
				op = scanner.nextInt();
			switch(op) {
			case 1:
				agregarJugador();
				last += 1;
				break;
			case 2:
				mostrarDatosJugador(last);
				break;
			case 3:
				mostrarPorApellido(last);
				break;
			case 4:
				modificarDatosJugador(last);
				break;
			case 5:
				if(last==-1) {
					System.out.println("No hay jugadores.");
				}else {
					eliminarJugador(last);
					last -= 1;
				}
				break
				;
			case 6:
				mostrarCantidadTotal(last);
				break;
			case 7:
				 System.out.println("Hay " + mostrarCantidadNacional(last) + " jugadores de dicha nacionalidad");
				break;
			case 8:
				break;
				}}catch(InputMismatchException ex){
				System.out.println("Ingrese un numero valido");
				scanner.next();
				}
			
		}while(op != 8);
	}

	public static void mostrarMenu() {
		System.out.println("1- Alta de jugador");
		System.out.println("2- Mostrar datos de jugador");
		System.out.println("3- Mostrar todos los jugadores");
		System.out.println("4- Modificar datos de un jugador");
		System.out.println("5- Eliminar un jugador");
		System.out.println("6- Mostrar jugadores");
		System.out.println("7- Mostrar cantidad de jugadores por nacionalidad");
		System.out.println("8- Salir");
	}
	
	public static void agregarJugador(){
		int dia, mes, anio;
			Jugador jugador = new Jugador();
			System.out.println("Ingrese nombre");
			jugador.setNombre(scanner.next());
			System.out.println("Ingrese apellido");
			jugador.setApellido(scanner.next());
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
			jugador.setFnacimiento(fecha);
			System.out.println("Ingrese nacionalidad");
			jugador.setNacionalidad(scanner.next());
			System.out.println("Ingrese estatura");
			jugador.setEstatura(scanner.nextFloat());
			System.out.println("Ingrese peso");
			jugador.setPeso(scanner.nextFloat());
			System.out.println("Ingrese posicion");
			jugador.setPosicion(scanner.next());
			jugadores.add(jugador);
	}
	
	public static void mostrarDatosJugador(int last){
		if(last == -1) {
			System.out.println("No hay jugadores");
		}else {
			int found = -1;
			System.out.println("Ingrese apellido para buscar");
			String apellidoBusqueda = scanner.next();
			for(int i = 0; i<= last; i++) {
				if(jugadores.get(i).getApellido().equals(apellidoBusqueda)) {
					found = i;
				}
			}
			if(found == -1) {
				System.out.println("Apellido no encontrado");
			}else {
				System.out.println(jugadores.get(found));
			}
		}
		
		
	}
	
	public static void mostrarPorApellido(int last) {
		if(last == -1) {
			System.out.println("No hay jugadores");
		}else {
			List<String> ordenados = new ArrayList<String>();
			for( Jugador l: jugadores) {
				ordenados.add(l.getApellido());
			}
			Collections.sort(ordenados);
			for(int i=0; i<=last; i++) {
				System.out.println(ordenados.get(i));
			}
		}
	}
	
	public static void modificarDatosJugador(int last) {
		int found = -1;
		System.out.println("Ingrese apellido para buscar");
		String apellidoBusqueda = scanner.next();
		System.out.println("Ingrese nombre para buscar");
		String nombreBusqueda = scanner.next();
		for(int i = 0; i<= last; i++) {
			if(jugadores.get(i).getApellido().equals(apellidoBusqueda) && jugadores.get(i).getNombre().equals(nombreBusqueda)) {
				found = i;
			}
		}
		if(found == -1) {
			System.out.println("Apellido no encontrado");
		}else {
			char option;
			
			System.out.println("Modificar nombre? S/N");
			option = scanner.next().charAt(0);
			if(option == 's' || option == 'S') {
				System.out.println("Ingrese nombre");
				jugadores.get(found).setNombre(scanner.next());
			}
			
			System.out.println("Modificar apellido? S/N");
			option = scanner.next().charAt(0);
			if(option == 's' || option == 'S') {
				System.out.println("Ingrese apellido");
				jugadores.get(found).setApellido(scanner.next());
			}
			
			System.out.println("Modificar fecha de nacimiento? S/N");
			option = scanner.next().charAt(0);
			if(option == 's' || option == 'S') {
				int dia, mes, anio;
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
				jugadores.get(found).setFnacimiento(fecha);
			}
			
			System.out.println("Modificar nacionalidad? S/N");
			option = scanner.next().charAt(0);
			if(option == 's' || option == 'S') {
				System.out.println("Ingrese nacionalidad");
				jugadores.get(found).setNacionalidad(scanner.next());
			}
			
			System.out.println("Modificar estatura? S/N");
			option = scanner.next().charAt(0);
			if(option == 's' || option == 'S') {
				System.out.println("Ingrese estatura");
				jugadores.get(found).setEstatura(scanner.nextFloat());
			}
			
			System.out.println("Modificar peso? S/N");
			option = scanner.next().charAt(0);
			if(option == 's' || option == 'S') {
				System.out.println("Ingrese peso");
				jugadores.get(found).setPeso(scanner.nextFloat());
			}
			
			System.out.println("Modificar posicion? S/N");
			option = scanner.next().charAt(0);
			if(option == 's' || option == 'S') {
				System.out.println("Ingrese posicion");
				jugadores.get(found).setPosicion(scanner.next());
			}
		}
		
	}
	
	public static void eliminarJugador(int last) {
		System.out.println("Ingrese apellido para buscar");
		String apellidoBusqueda = scanner.next();
		System.out.println("Ingrese nombre para buscar");
		String nombreBusqueda = scanner.next();
		
			Iterator<Jugador> iteratorJugadores = jugadores.iterator();
			while(iteratorJugadores.hasNext()) {
				Jugador l = iteratorJugadores.next();
				if(l.getApellido().equals(apellidoBusqueda) && l.getNombre().equals(nombreBusqueda)) {
					iteratorJugadores.remove();
					System.out.println("Jugador eliminado");
				}
			}
	}
	
	public static void mostrarCantidadTotal(int last){
		System.out.println("Hay " + (last+1) + " jugadores registrados");
		for(int i = 0; i<=last; i++) {
			System.out.println(jugadores.get(i).getApellido());
		}
	}
	
	public static int mostrarCantidadNacional(int last) {
		int contador = 0;
		System.out.println("Ingrese nacionalidad");
		String nac = scanner.next();
		for(int i=0; i<=last; i++) {
			if(jugadores.get(i).getNacionalidad().equals(nac)) {
				contador += 1;
			}
		}
		return contador;
	}
	
}
