package co.edu.udistrital.model;

public class sitp implements Vehiculo {

	@Override
	public String arrancar() {
		
		return "Poner en marcha el vehiculo para cerrar a alguien";
		
	}

	@Override
	public String detener() {
		
		return "Detener el vehiculo para hacer trancon";
		
	}
	
}
