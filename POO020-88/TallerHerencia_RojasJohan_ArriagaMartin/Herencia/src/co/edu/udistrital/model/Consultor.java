package co.edu.udistrital.model;

public class Consultor extends Empleado {
    private int añosExperiencia;
    private int equiposDesarrolloLiderados;

    public Consultor(String nombre, int edad, String cedula, double salario, int añosExperiencia, int equiposDesarrolloLiderados) {
        super(nombre, edad, cedula, salario);
        this.añosExperiencia = añosExperiencia;
        this.equiposDesarrolloLiderados = equiposDesarrolloLiderados;
    }

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}

	public int getEquiposDesarrolloLiderados() {
		return equiposDesarrolloLiderados;
	}

	public void setEquiposDesarrolloLiderados(int equiposDesarrolloLiderados) {
		this.equiposDesarrolloLiderados = equiposDesarrolloLiderados;
	}

	@Override
	public String toString() {
		return "Consultor [añosExperiencia=" + añosExperiencia + ", equiposDesarrolloLiderados="
				+ equiposDesarrolloLiderados + "]";
	}

	public void aumentarSalario(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
