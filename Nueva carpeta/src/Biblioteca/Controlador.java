package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                if (libro.prestar()) {
                    System.out.println("Libro prestado: " + libro.getTitulo());
                } else {
                    System.out.println("No se pudo prestar el libro. No quedan ejemplares disponibles.");
                }
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                if (libro.devolver()) {
                    System.out.println("Libro devuelto: " + libro.getTitulo());
                } else {
                    System.out.println("No se pudo devolver el libro. No se ha prestado previamente.");
                }
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}