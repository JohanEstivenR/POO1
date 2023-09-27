import java.util.Scanner;

	public class CalculadoraAlquilerVehiculo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Ingrese la cantidad de kilómetros recorridos: ");
	        int kilometros = scanner.nextInt();
	        
	        double montoTotal = calcularMontoAlquiler(kilometros);
	        
	        System.out.println("El monto a pagar es: $" + montoTotal);
	        
	        scanner.close();
	    }
	    
	    public static double calcularMontoAlquiler(int kilometros) {
	        double monto = 0;
	        
	        if (kilometros <= 300) {
	            monto = 30;
	        } else if (kilometros <= 1000) {
	            monto = 30 + (kilometros - 300) * 2;
	        } else {
	            monto = 30 + 700 * 2 + (kilometros - 1000);
	        }
	        
	        return monto;
	        
	  
	}
}