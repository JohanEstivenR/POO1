package Biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    public Libro() {
      
    }

    public Libro(String titulo, String autor, int numEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
    }

    // Métodos Setters/getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

  
    public boolean prestar() {
        if (numEjemplares > 0) {
            numEjemplares--;
            numEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

   
    public boolean devolver() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            numEjemplares++;
            return true;
        } else {
            return false;
        }
    }

   
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", numEjemplares=" + numEjemplares
                + ", numEjemplaresPrestados=" + numEjemplaresPrestados + "]";
    }
}