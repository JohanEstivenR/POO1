package ejercicios;

import java.util.Scanner;

public class CalculoDistancia {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario la aceleración en m/s^2
        System.out.print("Ingrese la aceleración (m/s^2): ");
        double aceleracion = sc.nextDouble();

        // Pedir al usuario el tiempo en segundos
        System.out.print("Ingrese el tiempo (segundos): ");
        double tiempo = sc.nextDouble();

        // Calcular la distancia utilizando la fórmula: distancia = 0.5 * aceleracion * tiempo^2
        double distancia = 0.5 * aceleracion * Math.pow(tiempo, 2);

        // Mostrar el resultado
        System.out.println("La distancia recorrida por el vehículo es: " + distancia + " metros");

        sc.close();
        
    }
}