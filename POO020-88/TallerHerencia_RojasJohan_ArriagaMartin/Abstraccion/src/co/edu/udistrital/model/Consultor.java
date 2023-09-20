package co.edu.udistrital.model;

public class Consultor extends Empleado {
    private int añosExperiencia;
    private int equiposDesarrolloLiderados;

    public Consultor(String nombre, int edad, String cedula, double salarioBase, int añosExperiencia, int equiposDesarrolloLiderados) {
        super(nombre, edad, cedula, salarioBase);
        this.añosExperiencia = añosExperiencia;
        this.equiposDesarrolloLiderados = equiposDesarrolloLiderados;
    }

    @Override
    public double calcularBonificacion() {
        if (equiposDesarrolloLiderados > 8) {
            return salarioBase * 0.5; // 50% de bonificación
        } else if (equiposDesarrolloLiderados > 5) {
            return salarioBase * 0.25; // 25% de bonificación
        }
        return 0;
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

	public void aumentarSalario(double d) {
		// TODO Auto-generated method stub
		
	}

}
