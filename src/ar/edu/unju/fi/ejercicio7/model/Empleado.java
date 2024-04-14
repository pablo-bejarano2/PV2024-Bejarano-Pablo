package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private Integer legajo;
	private Double salario;
	
	static final Double salarioMin = 210000.00;
	static final Double aumento = 20000.00;
	
	public Empleado() {	
	}

	public Empleado(String nombre, Integer legajo, Double salario) {
		super();
		this.nombre = nombre;
		if(salario < salarioMin) {
			this.salario = salarioMin;
		}else {
			this.salario = salario;
		}
		this.legajo = legajo;
	}
	
	public void aumentarSalario() {
		salario = salario+aumento;
	}
	
	@Override
	public String toString() {
		return "Nombre del empleado: " + nombre + "\n"
				+ "Legajo: " + legajo + "\n" +
				"Salario: " + salario + "$";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
}
