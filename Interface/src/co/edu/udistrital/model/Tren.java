package co.edu.udistrital.model;

public class Tren implements Vehiculo {

	@Override
	public String arrancar() {
		
		return "Quemar el carbon para mover el tren";
	}

	@Override
	public String detener() {
	
		return "Accionar el freno para detener el tren";
		
	}

}
