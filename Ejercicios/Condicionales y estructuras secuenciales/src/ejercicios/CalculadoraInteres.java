package ejercicios;

import java.util.Scanner;

public class CalculadoraInteres {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Ingrese la cantidad del préstamo en pesos: ");
			double prestamo = input.nextDouble();

			double tasaAnual = 0.27; // Tasa de interés anual del 27%
			double tasaMensual = tasaAnual / 12; // Tasa de interés mensual

			System.out.print("Ingrese el número de meses del préstamo: ");
			int meses = input.nextInt();

			// Calcular el interés mensual
			double interesMensual = (prestamo * tasaMensual) / (1 - Math.pow(1 + tasaMensual, -meses));

			System.out.println("El interés mensual a pagar es: " + interesMensual + " pesos");
		}
    }
}