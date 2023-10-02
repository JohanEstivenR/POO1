package Cajero;

public class AplMain {
    public static void main(String[] args) {
        
    	
        String titular = VistanConsola.leerTitular();
        double cantidadInicial = VistanConsola.leerCantidad();
        Cuenta cuenta = new Cuenta(titular, cantidadInicial);

       
        VistanConsola.mostrarCuenta(cuenta);

     
        double ingreso = VistanConsola.leerIngreso();
        cuenta.ingresar(ingreso);
        double retiro = VistanConsola.leerRetiro();
        cuenta.retirar(retiro);

      
        VistanConsola.mostrarCuenta(cuenta);
    }
}