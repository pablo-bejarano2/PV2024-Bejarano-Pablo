package ar.edu.unju.fi.ejercicio18.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static List<Pais> paises;
	private static List<DestinoTuristico> destinos;
	public static void main(String[] args) {
		paises = new ArrayList<Pais>(Arrays.asList(new Pais(100, "Francia"), new Pais(101, "España"), new Pais(102, "Austria"), new Pais(103, "Grecia")));
		destinos = new ArrayList<DestinoTuristico>();
		int op = 0;
		do {
			mostrarMenu();
			try {
				System.out.println("Ingrese una opcion");
				op = scanner.nextInt();
				switch(op) {
				case 1:
					crearDestino();
					break;
				case 2:
					mostrarDestinos();
					break;
				case 3:
					modificarDestino();
					break;
				case 4:
					limpiarDestinos();
					break;
				case 5:
					eliminarDestino();
					break;
				case 6:
					mostrarDestinosPorNombre();
					break;
				case 7:
					mostrarPaises();
					break;
				case 8:
					destinosDeUnPais();
					break;
				case 9:
					break;
				}
			}catch(InputMismatchException ex) {
				System.out.println("Ingrese una opcion valida");
				scanner.next();
			}
		}while(op != 9);
	}
	
	public static void mostrarMenu(){
		System.out.println("1- Alta de destino turistico");  //usar codigo del pais
		System.out.println("2- Mostrar todos destinos turisticos");
		System.out.println("3- Modificar el pais de destino turistico");
		System.out.println("4- Limpiar todos los destinos turisticos");
		System.out.println("5- Eliminar un destino turistico"); //usar codigo, usar iterador
		System.out.println("6- Mostrar los destinos ordenados por su nombre");
		System.out.println("7- Mostrar todos los paises");
		System.out.println("8- Mostrar los destinos que pertenecen a un pais");
		System.out.println("9- Salir");
	}
	public static void crearDestino() {
		DestinoTuristico destino = new DestinoTuristico();
		System.out.println("Ingrese codigo del destino");
		destino.setCodigo(scanner.nextInt());
		System.out.println("Ingrese nombre del destino");
		destino.setNombre(scanner.next());
		System.out.println("Ingrese el precio");
		destino.setPrecio(scanner.nextFloat());
		
		int aux;
		boolean flag=false;
		do {
			System.out.println("Ingrese codigo del pais");
			aux = scanner.nextInt();
			if(existePais(aux)) {
				destino.setPais(buscarPais(aux));
				flag=true;
			}
		}while(flag==false);
		
		System.out.println("Ingrese numero de dias");
		destino.setDias(scanner.nextInt());
		destinos.add(destino);
	}
	
	public static Boolean existePais(int codBuscado) {
		Boolean flag = false;
			for(Pais l: paises) {
				if(l.getCodigo() == codBuscado) {
					flag = true;
				}
			}
		return flag;
	}
	public static Pais buscarPais(int codBuscado) {
		int j = -1;
		for(int i=0; i < paises.size(); i++) {
			if(paises.get(i).getCodigo() == codBuscado) {
				j = i;
			}
		}
		return paises.get(j);
	}
	
	public static int buscarIndexDestino(int codBuscado) {
		int j = -1;
		for(int i=0; i < destinos.size(); i++) {
			if(destinos.get(i).getCodigo() == codBuscado) {
				j = i;
			}
		}
		return j;
		
	}
	
	public static void mostrarDestinos() {
		
		for(DestinoTuristico l: destinos) {
			System.out.println(l);
		}
	}
	
	public static void modificarDestino() {
		int found = -1;
		System.out.println("Ingrese codigo de destino");
		found = buscarIndexDestino(scanner.nextInt());
		if(found == -1) {
			System.out.println("No existe ese codigo");
		}else {
			char option;
			
			System.out.println("Modificar codigo? S/N");
			option = scanner.next().charAt(0);
			if(option == 's' || option == 'S') {
				System.out.println("Ingrese nuevo codigo");
				destinos.get(found).setCodigo(scanner.nextInt());
			}
			
			System.out.println("Modificar nombre? S/N");
			option = scanner.next().charAt(0);
			if(option == 's' || option == 'S') {
				System.out.println("Ingrese nuevo nombre");
				destinos.get(found).setNombre(scanner.next());
			}
			
			System.out.println("Modificar precio? S/N");
			option = scanner.next().charAt(0);
			if(option == 's' || option == 'S') {
				System.out.println("Ingrese nuevo precio");
				destinos.get(found).setPrecio(scanner.nextFloat());
			}
			
			
			System.out.println("Modificar pais de destino? S/N");
			option = scanner.next().charAt(0);
			if(option == 's' || option == 'S') {
				int aux;
				boolean flag=false;
				do {
					System.out.println("Ingrese codigo del pais");
					aux = scanner.nextInt();
					if(existePais(aux)) {
						destinos.get(found).setPais(buscarPais(aux));
						flag=true;
					}
				}while(flag==false);
			}
			
			System.out.println("Modificar numero de dias? S/N");
			option = scanner.next().charAt(0);
			if(option == 's' || option == 'S') {
				System.out.println("Ingrese nueva cantidad de dias");
				destinos.get(found).setDias(scanner.nextInt());
			}
		}
	}
	
	public static void limpiarDestinos() {
		Iterator<DestinoTuristico> iteratorDestinos = destinos.iterator();
		while(iteratorDestinos.hasNext()) {
			DestinoTuristico l = iteratorDestinos.next();
			iteratorDestinos.remove();
		}
		System.out.println("Destinos eliminados");
	}
	
	public static void eliminarDestino() {
		System.out.println("Ingrese codigo de destino");
		int codBusqueda = scanner.nextInt();
		Iterator<DestinoTuristico> iteratorDestinos = destinos.iterator();
		while(iteratorDestinos.hasNext()) {
			DestinoTuristico l = iteratorDestinos.next();
			if(l.getCodigo() == codBusqueda) {
				iteratorDestinos.remove();
				System.out.println("Destino eliminado");
			}
		}
	}
	
	public static void mostrarDestinosPorNombre() {
		List<String> ordenados = new ArrayList<String>();
		for(DestinoTuristico l: destinos) {
			ordenados.add(l.getNombre());
		}
		Collections.sort(ordenados);
		for(int i=0; i< ordenados.size(); i++) {
			System.out.println(ordenados.get(i));
		}
	}
	
	public static void mostrarPaises() {
		
		for(Pais l: paises) {
			System.out.println(l);
		}
	}

	public static void destinosDeUnPais() {
		Integer paisBusc;
		System.out.println("Ingrese pais para buscar");
		paisBusc = scanner.nextInt();
		for(DestinoTuristico l: destinos) {
			if(l.getPais().getCodigo() == paisBusc) {
				System.out.println(l);
			}
		}
	}
	
}
