package co.edu.udistrital.controller;

import co.edu.udistrital.model.Consultor;
import co.edu.udistrital.model.Directivo;
import co.edu.udistrital.model.Programador;

public class AplMain {
    public static void main(String[] args) {
    	
        // Crear instancias de Empleado, Programador, Consultor y Directivo
    	
        Programador programador = new Programador("Programador1", 25, "67890", 60000.0, "Java", 50);
        Consultor consultor = new Consultor("Consultor1", 35, "54321", 70000.0, 10, 3);
        Directivo directivo = new Directivo("Directivo1", 40, "98765", 80000.0, 15, "Ventas");

        // Aumentar salario según las tasas específicas
        
        programador.aumentarSalario(0.15); // 15%
        consultor.aumentarSalario(0.25);   // 25%
        directivo.aumentarSalario(0.35);   // 35%

        // Imprimir información de cada instancia
        

        System.out.println("\nInformación del Programador:");
        System.out.println(programador.toString());

        System.out.println("\nInformación del Consultor:");
        System.out.println(consultor.toString());

        System.out.println("\nInformación del Directivo:");
        System.out.println(directivo.toString());
    }
}
