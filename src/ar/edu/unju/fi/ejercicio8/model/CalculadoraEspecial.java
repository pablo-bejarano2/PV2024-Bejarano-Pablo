package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {

	private Integer n;

	
	public CalculadoraEspecial() {
	}
	
	
	public CalculadoraEspecial(Integer n) {
		super();
		this.n = n;
	}

	public Integer calcularSumatoria() {
		int k, aux;
		int result = 0;
		for(k=1; k<=n; k++) {
			aux = k + 1;
			aux = (k*aux)/2;
			aux = aux * aux;
			result = result+aux;
		}
		return result;
	}
	
	public Integer calcularProductoria() {
		int k, aux;
		int result = 1;
		for(k=1; k<=n; k++) {
			aux = k + 4;
			aux = k * aux;
			result = result*aux;
		}
		return result;
	}
	
	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}
	
}
