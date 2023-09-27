package ejercicios;

import java.util.Scanner;

public class Ganado {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese la cantidad total de patas: ");
			int totalPatas = scanner.nextInt();

			System.out.print("Ingrese la cantidad de pollos: ");
			int cantidadPollos = scanner.nextInt();

			// Calcula la cantidad de patas de las vacas (4 patas por vaca)
			int patasVacas = totalPatas - (cantidadPollos * 2);

			// Calcula la cantidad de vacas
			int cantidadVacas = patasVacas / 4;

			System.out.println("El campesino tenía " + cantidadPollos + " pollos y " + cantidadVacas + " vacas en su finca.");
		}
    }
}
