package co.edu.udistrital.model;

public class Directivo extends Empleado {
    private int añosExperiencia;
    private String areaEncargada;

    public Directivo(String nombre, int edad, String cedula, double salarioBase, int añosExperiencia, String areaEncargada) {
        super(nombre, edad, cedula, salarioBase);
        this.añosExperiencia = añosExperiencia;
        this.areaEncargada = areaEncargada;
    }

    @Override
    public double calcularBonificacion() {
        if (añosExperiencia > 12) {
            return salarioBase * 0.5; // 50% de bonificación
        } else if (añosExperiencia > 8) {
            return salarioBase * 0.3; // 30% de bonificación
        }
        return 0;
    }

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public void setAniosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}

	public String getAreaEncargada() {
		return areaEncargada;
	}

	public void setAreaEncargada(String areaEncargada) {
		this.areaEncargada = areaEncargada;
	}

	public void aumentarSalario(double d) {
		// TODO Auto-generated method stub
		
	}
    
}
