package co.edu.udistrital.controller;

import co.edu.udistrital.model.Consultor;
import co.edu.udistrital.model.Directivo;
import co.edu.udistrital.model.Programador;

public class Lanzadora {
    public static void main(String[] args) {
    	
        Programador programador = new Programador("Programador1", 30, "12345", 1500000, "Java", 1000);
        Consultor consultor = new Consultor("Consultor1", 35, "54321", 3000000, 10, 6);
        Directivo directivo = new Directivo("Directivo1", 40, "98765", 5000000, 15, "Ventas");

        System.out.println("Información del Programador:");
        System.out.println(programador.toString());

        System.out.println("\nInformación del Consultor:");
        System.out.println(consultor.toString());

        System.out.println("\nInformación del Directivo:");
        System.out.println(directivo.toString());
    }
}
