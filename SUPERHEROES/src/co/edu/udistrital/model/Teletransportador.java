package co.edu.udistrital.model;

public interface Teletransportador {
	String teletransInsta(String ubicacion);
	String agujeroGusano();
	String AtaqueTeletrasporte();
	default String AtravesarObstaculo(){
		return "salta a traves de la materia esquivando el obstaculo";
	}
}
