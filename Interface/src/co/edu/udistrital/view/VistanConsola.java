package co.edu.udistrital.view;

import java.util.Scanner;

public class VistanConsola {
	
	private Scanner sc;

	public VistanConsola() {
		
		sc = new Scanner(System.in);
		
	}
	
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
		
	}
	
}

