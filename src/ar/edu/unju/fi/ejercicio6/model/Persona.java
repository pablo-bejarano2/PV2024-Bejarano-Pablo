package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	private Integer dni;
	private String nombre;
	private LocalDate fnacimiento;
	private String provincia;
	
	public Persona() {
		
	};
	
	
	public Persona(Integer dni, String nombre, LocalDate fnacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fnacimiento = fnacimiento;
		this.provincia = provincia;
	}
	
	public Persona(Integer dni, String nombre, LocalDate fnacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fnacimiento = fnacimiento;
		this.provincia = "Jujuy";
	}

	public Integer calcularEdad() {
		LocalDate fechaHoy = LocalDate.now();
		
		return fechaHoy.compareTo(fnacimiento);
		
	}
	
	public Boolean verificarMayorEdad() {
		return (calcularEdad() >= 18);
	}
	
	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFnacimiento() {
		return fnacimiento;
	}

	public void setFnacimiento(LocalDate fnacimiento) {
		this.fnacimiento = fnacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		if(verificarMayorEdad()) {
		return "Dni: " + dni + "\n" +
				"Nombre: " + nombre + "\n" +
				"Fecha de nacimiento: " + fnacimiento + "\n" +
				"Edad: " + calcularEdad() + "\n" +
				"Provincia: " + provincia + "\n"+
				"Es mayor de edad";
				}else {
		return "Dni: " + dni + "\n" +
				"Nombre: " + nombre + "\n" +
				"Fecha de nacimiento: " + fnacimiento + "\n" +
				"Edad: " + calcularEdad() + "\n" +
				"Provincia: " + provincia + "\n"+
				"No es mayor de edad";
				}
					
	}
	
	//public Integer getEdad() {
		
	//}
	
	
}
