package co.edu.udistrital.model;

public class Persona {
	public String nombre;
	public int edad;
	
	//constructor
	
	public Persona() {
		nombre = "";
		edad = 0;
	}
	
	public String toString() {
		return "Nombre: " + nombre + 
		       "\nEdad: " + edad ;
		
	}
	
	public boolean sonNombresIguales(Persona x) {
		if( nombre.equals(x.nombre)) {
			return true;
		} else {
			return false;
		}
	}
}
