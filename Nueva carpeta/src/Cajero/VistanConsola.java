package Cajero;

import java.util.Scanner;

public class VistanConsola {
    private static Scanner scanner = new Scanner(System.in);

    public static String leerTitular() {
        System.out.print("Ingrese el titular de la cuenta: ");
        return scanner.nextLine();
    }

    public static double leerCantidad() {
        System.out.print("Ingrese la cantidad inicial en la cuenta: ");
        return Double.parseDouble(scanner.nextLine());
    }

    public static double leerIngreso() {
        System.out.print("Ingrese la cantidad a ingresar: ");
        return Double.parseDouble(scanner.nextLine());
    }

    public static double leerRetiro() {
        System.out.print("Ingrese la cantidad a retirar: ");
        return Double.parseDouble(scanner.nextLine());
    }

    public static void mostrarCuenta(Cuenta cuenta) {
        System.out.println("Datos de la cuenta:");
        System.out.println(cuenta.toString());
    }
}
