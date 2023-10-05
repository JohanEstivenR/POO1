package co.edu.udistrital.model;

public interface Divino {
	String CastigoDivino(String objetivo);
	default String OracionCurativa() {
		return "una luz divina lo envuelve y sana sus heridas";
	}
	String OracionMejora();
	String Revivir();

}
