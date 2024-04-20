package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	Integer codigo;
	String nombre;
	Float precio;
	Pais pais;
	Integer dias;
	
	public DestinoTuristico() {
	}

	public DestinoTuristico(Integer codigo, String nombre, Float precio, Pais pais, Integer dias) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.dias = dias;
	}

	@Override
	public String toString() {
		return "DestinoTuristico [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", pais=" + pais
				+ ", dias=" + dias + "]";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
	
}
