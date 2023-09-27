import java.util.Scanner;

public class VerificadorNumeroSerie {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número de serie del vehículo: ");
        int numeroSerie = scanner.nextInt();
        
        if ((numeroSerie >= 14681 && numeroSerie <= 15681) ||
            (numeroSerie >= 70001 && numeroSerie <= 79999) ||
            (numeroSerie >= 88888 && numeroSerie <= 111111)) {
            System.out.println("El número de serie es defectuoso.");
        } else {
            System.out.println("El número de serie no es defectuoso.");
        }
        
        scanner.close();
        
    }
}