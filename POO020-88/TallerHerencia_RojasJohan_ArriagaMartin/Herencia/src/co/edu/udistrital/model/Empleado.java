package co.edu.udistrital.model;

public class Empleado extends Empleado {
    private String nombre;
    private int edad;
    private String cedula;
    private double salario;

    public Empleado(String nombre, int edad, String cedula, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.salario = salario;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", salario=" + salario + "]";
	}

}
