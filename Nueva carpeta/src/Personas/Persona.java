package Personas;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private final static char SEXO_DEFECTO = 'H';
    private String dni;

  
    public Persona() {
        this("", 0, SEXO_DEFECTO, 0, 0);
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        generaDNI();
    }

   
    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEFECTO;
        } else {
            this.sexo = sexo;
        }
    }

    private void generaDNI() {
      
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

  
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nSexo: " + sexo + "\nPeso: " + peso + "\nAltura: " + altura + "\nDNI: " + dni;
    }
}