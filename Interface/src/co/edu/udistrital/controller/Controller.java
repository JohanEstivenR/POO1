package co.edu.udistrital.controller;

import co.edu.udistrital.model.Bicicleta;
import co.edu.udistrital.model.Tren;
import co.edu.udistrital.model.sitp;
import co.edu.udistrital.view.VistanConsola;

public class Controller {
	
	private VistanConsola vista;
	private sitp vehiculo_hermoso;
	private Bicicleta caballo_acero;
	private Tren locomotora;
	
	public void controller() {
		
		vista = new VistanConsola();
		vehiculo_hermoso = new sitp();
		caballo_acero = new Bicicleta();
		funcionar();
		
	}
	
	public void funcionar() {
	
		vista.mostrarInformacion(vehiculo_hermoso.arrancar());
		vista.mostrarInformacion(vehiculo_hermoso.detener());
		vista.mostrarInformacion(vehiculo_hermoso.echarPito());
		vista.mostrarInformacion("__________________________");
		vista.mostrarInformacion(caballo_acero.arrancar());
		vista.mostrarInformacion(caballo_acero.detener());
		vista.mostrarInformacion(caballo_acero.echarPito());
		vista.mostrarInformacion("__________________________");
		vista.mostrarInformacion(locomotora.arrancar());
		vista.mostrarInformacion(locomotora.detener());
		vista.mostrarInformacion(locomotora.echarPito());
		
	}
	
}
