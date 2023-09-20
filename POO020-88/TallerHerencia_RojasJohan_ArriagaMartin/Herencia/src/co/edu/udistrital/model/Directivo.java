package co.edu.udistrital.model;

public class Directivo extends Empleado {
    private int añosExperiencia;
    private String areaEncargada;

    public Directivo(String nombre, int edad, String cedula, double salario, int añosExperiencia, String areaEncargada) {
        super(nombre, edad, cedula, salario);
        this.añosExperiencia = añosExperiencia;
        this.areaEncargada = areaEncargada;
    }

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}

	public String getAreaEncargada() {
		return areaEncargada;
	}

	public void setAreaEncargada(String areaEncargada) {
		this.areaEncargada = areaEncargada;
	}

	@Override
	public String toString() {
		return "Directivo [añosExperiencia=" + añosExperiencia + ", areaEncargada=" + areaEncargada + "]";
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
