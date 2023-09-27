package ejercicios;

public class DistribucionPresupuesto {
    public static void main(String[] args) {
    	
        // Monto total del presupuesto del hospital
        double presupuestoTotal = 100000; // Cambia este valor según tu presupuesto

        // Porcentajes asignados a cada área
        double porcentajeUrgencias = 0.37;
        double porcentajePediatria = 0.42;
        double porcentajeTraumatologia = 0.21;

        // Calcula la cantidad de dinero para cada área
        double presupuestoUrgencias = presupuestoTotal * porcentajeUrgencias;
        double presupuestoPediatria = presupuestoTotal * porcentajePediatria;
        double presupuestoTraumatologia = presupuestoTotal * porcentajeTraumatologia;

        // Muestra los resultados
        System.out.println("Presupuesto para Urgencias: $" + presupuestoUrgencias);
        System.out.println("Presupuesto para Pediatría: $" + presupuestoPediatria);
        System.out.println("Presupuesto para Traumatología: $" + presupuestoTraumatologia);
        
    }
}