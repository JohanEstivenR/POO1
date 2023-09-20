package co.edu.udistrital.model;

public class Programador extends Empleado {
    private String lenguajeDominante;
    private int lineasCodigoPorHora;

    public Programador(String nombre, int edad, String cedula, double salario, String lenguajeDominante, int lineasCodigoPorHora) {
        super(nombre, edad, cedula, salario);
        this.lenguajeDominante = lenguajeDominante;
        this.lineasCodigoPorHora = lineasCodigoPorHora;
    }

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}

	public int getLineasCodigoPorHora() {
		return lineasCodigoPorHora;
	}

	public void setLineasCodigoPorHora(int lineasCodigoPorHora) {
		this.lineasCodigoPorHora = lineasCodigoPorHora;
	}

	@Override
	public String toString() {
		return "Programador [lenguajeDominante=" + lenguajeDominante + ", lineasCodigoPorHora=" + lineasCodigoPorHora
				+ "]";
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
