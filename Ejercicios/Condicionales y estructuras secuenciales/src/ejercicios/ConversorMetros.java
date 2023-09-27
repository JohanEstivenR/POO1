package ejercicios;

import java.util.Scanner;

public class ConversorMetros {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar al usuario la distancia en metros
        System.out.print("Ingresa la distancia en metros: ");
        double metros = input.nextDouble();

        // Convertir metros a pies y pulgadas
        double pies = metros * 3.28084; // 1 metro = 3.28084 pies
        double pulgadas = pies * 12;    // 1 pie = 12 pulgadas

        // Mostrar el resultado
        System.out.println("La distancia es equivalente a " + pies + " pies o " + pulgadas + " pulgadas.");
        
        // Cerrar el Scanner
        input.close();
        
    }
}
