package ejercicios;

import java.util.Scanner;

public class DistanciaEntrePuntos {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa las coordenadas del primer punto (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Ingresa las coordenadas del segundo punto (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calcula la distancia utilizando el teorema de Pitágoras
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("La distancia entre los dos puntos es: " + distancia);

        sc.close();
        
    }
}
