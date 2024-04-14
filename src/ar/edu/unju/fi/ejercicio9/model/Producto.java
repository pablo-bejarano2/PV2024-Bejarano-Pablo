package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private Double precio;
	private Integer descuento;
	
	public Producto() {
		
	}
	
	public Producto(String nombre, String codigo, Double precio, Integer descuento) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.descuento = descuento;
	}

	public Double calcularDescuento() {
		double x = (precio * descuento)/100;
		return precio - x;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getDescuento() {
		return descuento;
	}
	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Nombre del producto: " + nombre + ", codigo: " + codigo + ", precio: " + precio + ", descuento: " + descuento;
	}
	
	
}
