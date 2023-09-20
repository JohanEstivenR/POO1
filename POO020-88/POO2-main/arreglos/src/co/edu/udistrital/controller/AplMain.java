package co.edu.udistrital.controller;

import co.edu.udistrital.model.Persona;

public class AplMain {
	
	public static void main(String[] args) {
		
		Persona a;
		a = new Persona();
		
		Persona b;
		b = new Persona();
		
		System.out.println("Edad A: " +a.edad);
		System.out.println("Edad B: " +b.edad);
		System.out.println();
		
		a.nombre = "Jose";
		a.edad = 21;
		
		b.nombre = "Juan";
		b.edad = 19;
		
		System.out.println(a);
		System.out.println();
		System.out.println(b);
		System.out.println();
		System.out.println("Se llaman igual? "+ a.sonNombresIguales(b));
		System.out.println(a);
			
	}

}
