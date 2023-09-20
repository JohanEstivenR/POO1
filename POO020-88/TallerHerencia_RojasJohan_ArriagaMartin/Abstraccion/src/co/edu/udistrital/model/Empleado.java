package co.edu.udistrital.model;

public abstract class Empleado {
    protected String nombre;
    protected int edad;
    protected String cedula;
    protected double salarioBase;

    public Empleado(String nombre, int edad, String cedula, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularBonificacion(); 

    public double calcularSalarioTotal() {
        return salarioBase + calcularBonificacion();
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

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", salarioBase=" + salarioBase
				+ "]";
	}
    
}
