package Personas;

import java.util.Scanner;

public class EjecutablePersona {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nombre: ");
			String nombre = scanner.nextLine();

			System.out.print("Edad: ");
			int edad = scanner.nextInt();

			System.out.print("Sexo (H/M): ");
			char sexo = scanner.next().charAt(0);

			System.out.print("Peso (kg): ");
			double peso = scanner.nextDouble();

			System.out.print("Altura (m): ");
			double altura = scanner.nextDouble();

      
			Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
			Persona persona2 = new Persona(nombre, edad, sexo); 
			Persona persona3 = new Persona();

    
			int imcPersona1 = persona1.calcularIMC();
			int imcPersona2 = persona2.calcularIMC();
			int imcPersona3 = persona3.calcularIMC();

			System.out.println("Persona 1 - IMC: " + imcPersona1);
			System.out.println("Persona 2 - IMC: " + imcPersona2);
			System.out.println("Persona 3 - IMC: " + imcPersona3);

      
			boolean mayorEdadPersona1 = persona1.esMayorDeEdad();
			boolean mayorEdadPersona2 = persona2.esMayorDeEdad();
			boolean mayorEdadPersona3 = persona3.esMayorDeEdad();

			System.out.println("Persona 1 - Mayor de edad: " + mayorEdadPersona1);
			System.out.println("Persona 2 - Mayor de edad: " + mayorEdadPersona2);
			System.out.println("Persona 3 - Mayor de edad: " + mayorEdadPersona3);

   
			System.out.println("Información Persona 1:\n" + persona1.toString());
			System.out.println("Información Persona 2:\n" + persona2.toString());
			System.out.println("Información Persona 3:\n" + persona3.toString());
		}
    }
}