import java.util.Scanner;

public class DescuentosAuditorio {
    public static void main(String[] args) {
    	
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese la edad del cliente: ");
			int edad = scanner.nextInt();

			System.out.println("¿Es estudiante de La Universidad Distrital? (true/false): ");
			boolean esEstudianteDistrital = scanner.nextBoolean();

			System.out.println("¿En qué semestre está el estudiante? (0 si no es estudiante): ");
			int semestre = scanner.nextInt();

			System.out.println("¿Cuál es su ocupación? (VIP/Platinum/General): ");
			String ocupacion = scanner.next();

			double precioBase;

			if (ocupacion.equalsIgnoreCase("VIP")) {
			    precioBase = 200000;
			    if (edad < 12 || edad > 60) {
			        precioBase *= 0.5;
			    } else if (edad >= 12 && edad <= 60) {
			        if (esEstudianteDistrital) {
			            if (semestre == 1 || semestre > 7) {
			                precioBase *= 0.88;
			            } else if (semestre >= 2 && semestre <= 6) {
			                if (esEstudianteArtesLiteraturaMusica()) {
			                    precioBase *= 0.85;
			                } else {
			                    precioBase *= 0.88;
			                }
			            }
			        } else {
			            precioBase *= 0.9;
			        }
			    }
			} else if (ocupacion.equalsIgnoreCase("Platinum")) {
			    precioBase = 150000;
			} else if (ocupacion.equalsIgnoreCase("General")) {
			    precioBase = 100000;
			} else {
			    System.out.println("Ocupación no válida");
			    return;
			}

			System.out.println("El precio de la boleta es: $" + precioBase);
		}
    }

    private static boolean esEstudianteArtesLiteraturaMusica() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("¿Es estudiante de Artes, Literatura o Música? (true/false): ");
			return scanner.nextBoolean();
		}
    }
}