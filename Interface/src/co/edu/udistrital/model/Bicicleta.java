package co.edu.udistrital.model;

public class Bicicleta implements Vehiculo {

	@Override
	public String arrancar() {
	
		return "Dar pedal hasta el cansancio";
	}

	@Override
	public String detener() {
		
		return "Aprener a respetar los semaforos";
		
	}

}
