package co.edu.udistrital.model;

public interface Vehiculo {
	
	String arrancar();
	String detener();
	default String echarPito() {
		return "Haciendo snoar el PIII";	
		
	}
	
}