package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String dni;
	private String nombre;
	private LocalDate fechadenac;
	private String prov;
	
	public Persona() {
		
	}

	public Persona(String dni, String nombre, LocalDate fechadenac, String prov) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechadenac = fechadenac;
		this.prov = prov;
	}

	public Persona(String dni, String nombre, LocalDate fechadenac) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechadenac = fechadenac;
		this.prov = "Jujuy";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getfechadenac() {
		return fechadenac;
	}

	public void setfechadenac(LocalDate fechadenac) {
		this.fechadenac = fechadenac;
	}

	public String getprov() {
		return prov;
	}

	public void setprov(String prov) {
		this.prov = prov;
	}
	
	public int calcularEdad() {
		
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(this.fechadenac, hoy);
		return periodo.getYears();
		
	}
	
	public boolean verificarEdad() {
		
		return calcularEdad() >= 18;
		
	}
	
	public void mostrarDatos() {
		
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de nacimiento: " + fechadenac);
		System.out.println("Provincia: " + prov);
		System.out.println("Edad: " + calcularEdad());
		if(verificarEdad()) {
			
			System.out.println("La persona es mayor de edad");
			
		}else {
			
			System.out.println("La persona es menor de edad");
			
		}
		
	}
	
}
