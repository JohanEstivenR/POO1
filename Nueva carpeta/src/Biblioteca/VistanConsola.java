package Biblioteca;

import java.util.Scanner;

public class VistanConsola {
    private Scanner scanner = new Scanner(System.in);

    public String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Introduce un número válido.");
            scanner.nextLine();
        }
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        
        return numero;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}