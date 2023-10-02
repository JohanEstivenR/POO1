package Biblioteca;

public class AplMain {
    public static void main(String[] args) {
        VistanConsola vista = new VistanConsola();

        String titulo = vista.leerString("Introduce el título del libro: ");
        String autor = vista.leerString("Introduce el autor del libro: ");
        int numEjemplares = vista.leerEntero("Introduce el número de ejemplares disponibles: ");

        Libro libro = new Libro(titulo, autor, numEjemplares);

        vista.mostrarMensaje("Libro creado: " + libro);

        if (libro.prestar()) {
            vista.mostrarMensaje("Libro prestado.");
        } else {
            vista.mostrarMensaje("No se pudo prestar el libro. No quedan ejemplares disponibles.");
        }

        if (libro.devolver()) {
            vista.mostrarMensaje("Libro devuelto.");
        } else {
            vista.mostrarMensaje("No se pudo devolver el libro. No se ha prestado previamente.");
        }
    }
}