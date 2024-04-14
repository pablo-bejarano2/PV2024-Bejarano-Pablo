package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private Double diametro;
	private Double precio;
	private Double area;
	private Boolean ingredientes;
	
	private static final Double especiales20 = 500.0;
	private static final Double especiales30 = 750.0;
	private static final Double especiales40 = 1000.0;
	
	public Pizza() {
		
	}
	public void calcularArea() {
		this.area = ((diametro/2) * (diametro/2)) * 3.14159265;
	}
	
	public Double getDiametro() {
		return diametro;
	}

	public void setDiametro(Double diametro) {
		this.diametro = diametro;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Boolean getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Boolean ingredientes) {
		this.ingredientes = ingredientes;
	}

	public static Double getEspeciales20() {
		return especiales20;
	}

	public static Double getEspeciales30() {
		return especiales30;
	}

	public static Double getEspeciales40() {
		return especiales40;
	}
	@Override
	public String toString() {
		return "Diametro de la pizza:" + diametro + "\n" +
				"Precio total: " + precio + "\n" +
				"Area de la pizza: " + area + "\n" +
				"Tiene ingredientes especiales? " + ingredientes + "\n";
	}
	
	
}
