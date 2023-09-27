package ejercicios;

import java.util.Scanner;

public class CambioMonedas {
    public static void main(String[] args) {
    	
        // Definir el tipo de cambio
        double tipoCambioDolares = 2950.0;
        double tipoCambioEuros = 3450.0;

        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la cantidad en pesos colombianos
        System.out.print("Ingresa la cantidad en pesos colombianos: ");
        double pesosColombianos = scanner.nextDouble();

        // Calcular el cambio a dólares y euros
        double dolares = pesosColombianos / tipoCambioDolares;
        double euros = pesosColombianos / tipoCambioEuros;

        // Mostrar el resultado
        System.out.println("Cantidad en dólares: $" + dolares);
        System.out.println("Cantidad en euros: €" + euros);

        // Cerrar el objeto Scanner
        scanner.close();
        
    }
}
