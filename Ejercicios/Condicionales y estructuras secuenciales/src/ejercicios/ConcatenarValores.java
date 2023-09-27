package ejercicios;

import java.util.Scanner;

public class ConcatenarValores {
	
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			// Leer tres números enteros de un solo dígito
			System.out.print("Ingrese el primer número (0-9): ");
			int a = sc.nextInt();

			System.out.print("Ingrese el segundo número (0-9): ");
			int b = sc.nextInt();

			System.out.print("Ingrese el tercer número (0-9): ");
			int c = sc.nextInt();

			// Concatenar los tres números en una sola variable
			int x = a * 100 + b * 10 + c;

			// Mostrar el resultado
			System.out.println("El número resultante es: " + x);
		}
        
    }
}
