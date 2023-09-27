package ejercicios;

import java.util.Scanner;

public class CalculoCostoProceso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese las horas: ");
        int horas = input.nextInt();
        
        System.out.println("Ingrese los minutos: ");
        int minutos = input.nextInt();
        
        System.out.println("Ingrese los segundos: ");
        int segundos = input.nextInt();
        
        // Calcular el tiempo total en segundos
        int tiempoTotalEnSegundos = (horas * 3600) + (minutos * 60) + segundos;
        
        // Calcular el costo total
        double costoPorSegundo = 3.25;
        double costoTotal = tiempoTotalEnSegundos * costoPorSegundo;
        
        System.out.println("El costo total del proceso es: " + costoTotal + " pesos colombianos");
        
        input.close();
    }
}