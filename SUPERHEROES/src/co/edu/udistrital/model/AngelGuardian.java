package co.edu.udistrital.model;

public class AngelGuardian implements Divino,Teletransportador {

	@Override
	public String teletransInsta(String ubicacion) {
		// TODO Auto-generated method stub
		return "se desvanece en humo blanco y reaparece en "+ubicacion+" con una luz angelical ";
	}

	@Override
	public String agujeroGusano() {
		// TODO Auto-generated method stub
		return "Crea un pasillo a travez de la cuarta dimension que transporta cualquier objeto de forma instantanea";
	}

	@Override
	public String AtaqueTeletrasporte() {
		// TODO Auto-generated method stub
		return "Ataca con la magia de su harpa divina que puede alcanzar caul objetivo";
	}

	@Override
	public String CastigoDivino(String objetivo) {
		// TODO Auto-generated method stub
		return "una enorme mano de luz aplasta a "+ objetivo;
	}


	@Override
	public String OracionMejora() {
		
		return "protege a un aliado de efectos negativos";
	}

	@Override
	public String Revivir() {
		// TODO Auto-generated method stub
		return "vuelve al mundo en una luz divina luego tras 3 dias de su derrota";
	}

}
