package ejercicios;

import java.util.Scanner;

public class CalculadoraVolumenCilindro {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el radio de la base
        System.out.print("Ingrese el radio de la base del cilindro: ");
        double radio = scanner.nextDouble();

        // Solicitar al usuario la altura del cilindro
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        // Calcular el volumen del cilindro
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        // Mostrar el resultado
        System.out.println("El volumen del cilindro es: " + volumen);

        // Cerrar el Scanner
        scanner.close();
    }
}