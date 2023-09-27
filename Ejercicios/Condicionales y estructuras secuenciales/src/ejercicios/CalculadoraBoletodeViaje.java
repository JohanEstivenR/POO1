package ejercicios;

import java.util.Scanner;

public class CalculadoraBoletodeViaje {
    public static void main(String[] args) {
    	
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de kilómetros a recorrer
        System.out.print("Ingrese la cantidad de kilómetros a recorrer: ");
        double distanciaKilometros = scanner.nextDouble();

        // Definir el precio por kilómetro
        double precioPorKilometro = 120.0;

        // Calcular el precio total del boleto
        double precioTotal = distanciaKilometros * precioPorKilometro;

        // Mostrar el precio total al usuario
        System.out.println("El precio total del boleto es: $" + precioTotal);

        // Cerrar el objeto Scanner
        scanner.close();
        
    }
}
