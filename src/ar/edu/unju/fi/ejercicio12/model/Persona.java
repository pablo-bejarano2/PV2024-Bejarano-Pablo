package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	
	private String nombre;
	private Calendar fnacimiento;
	
	public long calcularEdad() {
		Calendar calendarToday = Calendar.getInstance();
		long milisec = calendarToday.getTimeInMillis() - fnacimiento.getTimeInMillis();
		long years = milisec / 1000 / 60 / 60 / 24 / 30 / 12;
		return years;
	}
	
	public String zodiac() {
		int mes = fnacimiento.get(Calendar.MONTH);
		int dia = fnacimiento.get(Calendar.DAY_OF_MONTH);
		if((mes==0 && dia >= 21) || (mes == 1 && dia <= 19)) {
			return "Acuario";
		}
		if((mes==1 && dia >= 20) || (mes == 2 && dia <= 20)) {
			return "Piscis";
		}
		if((mes==2 && dia >= 21) || (mes == 3 && dia <= 19)) {
			return "Aries";
		}
		if((mes==3 && dia >= 20) || (mes == 4 && dia <= 20)) {
			return "Tauro";
		}
		if((mes==4 && dia >= 21) || (mes == 5 && dia <= 19)) {
			return "Geminis";
		}
		if((mes==5 && dia >= 20) || (mes == 6 && dia <= 20)) {
			return "Cancer";
		}
		if((mes==6 && dia >= 21) || (mes == 7 && dia <= 19)) {
			return "Leo";
		}
		if((mes==7 && dia >= 20) || (mes == 8 && dia <= 20)) {
			return "Virgo";
		}
		if((mes==8 && dia >= 21) || (mes == 9 && dia <= 19)) {
			return "Libra";
		}
		if((mes==9 && dia >= 20) || (mes == 10 && dia <= 20)) {
			return "Escorpio";
		}
		if((mes==10 && dia >= 21) || (mes == 11 && dia <= 19)) {
			return "Sagitario";
		}
		if((mes==11 && dia >= 20) || (mes == 0 && dia <= 20)) {
			return "Capricornio";
		}else {
			return "";
		}
	}
	
	public String estacion() {
		int mes = fnacimiento.get(Calendar.MONTH);
		int dia = fnacimiento.get(Calendar.DAY_OF_MONTH);
		if((mes>=11 && dia>=21)||(mes == 2 && dia <= 20)) {
			return "Verano";
		}
		if((mes>=2 && dia>=21)||(mes <= 6 && dia <= 20)) {
			return "Otoño";
		}
		if((mes>=6 && dia>=21)||(mes <= 8 && dia <= 20)) {
			return "Invierno";
		}
		if((mes>=8 && dia>=21)||(mes <= 11 && dia <= 20)) {
			return "Primavera";
		}else {
			return "";
		}
	}
	public Persona() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFnacimiento() {
		return fnacimiento;
	}

	public void setFnacimiento(Calendar fnacimiento) {
		this.fnacimiento = fnacimiento;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " \n" + 
	"Fecha de nacimiento: " + fnacimiento.get(Calendar.DAY_OF_MONTH) + "/" + fnacimiento.get(Calendar.MONTH) + "/"+ fnacimiento.get(Calendar.YEAR) + " \n" +
	"Edad: " + calcularEdad() + " \n"+
	"Signo zodiacal: " + zodiac() + "\n" +
	"Estacion: " + estacion();
	}
	
	
}
