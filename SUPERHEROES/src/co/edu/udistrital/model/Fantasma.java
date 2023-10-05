package co.edu.udistrital.model;

public class Fantasma implements Necrofago,Teletransportador   {

	@Override
	public String teletransInsta(String ubicacion ) {
		return "aparece en la habitacion "+ ubicacion +" de la casa embrujada";
	}

	@Override
	public String agujeroGusano() {
		
		return "intercambia la posciocion de dos objetos de la casa";
	}

	@Override
	public String AtaqueTeletrasporte() {
		// TODO Auto-generated method stub
		return "hace aparecer aparece una ilusion terrorifica en cualquier lugar de su alcance";
	}

	@Override
	public String LevantarMuertos() {
		// TODO Auto-generated method stub
		return "toma las almas de los caidos y las convierte en fastasmas";
	}

	@Override
	public String ControlarOrda() {
		// TODO Auto-generated method stub
		return "Reune varias almas en una mente colmena";
	}

	@Override
	public String InvocarDemonio() {
		return " trae de inframundo a un demonio ";
	}

	@Override
	public String Revivir() {
		// TODO Auto-generated method stub
		return "puede regresar a su cuerpo fisico reencarnando en un cadaver semipodrido (duele bastante)";
	}
	

}
