package ItsaspekoHoria;

public class Erabiltzailea extends Jokalaria {
	// atributuak
	private static Erabiltzailea nireErabiltzailea;

	// eraikitzailea
	private Erabiltzailea() {
		super();
	}

	// metodoak

	public static Erabiltzailea getErabiltzailea() {
		if (nireErabiltzailea == null) {
			nireErabiltzailea = new Erabiltzailea();
		}
		return nireErabiltzailea;
	}

	public void ontziaKokatu(int pLerroa, int pZutabea, int pNorantza, Ontzia pOntzia) {
		jokalariarenTaula.ontziOsoaKokatu(pOntzia, pLerroa, pZutabea, pNorantza);
	}

	public void ontziaEzkutatu(int pLerroa, int pZutabea) {
		if (jokalariarenTaula.ontziaDago(pLerroa, pZutabea)) {
			jokalariarenTaula.getOntzia(pLerroa, pZutabea).ezkutatu();
		} else
			System.out.println("Ez dago ontzirik");
	}

	public void radarra(Radar radar, int pX, int pY) {
		// etsaiarenTaula.radarKontsultatu(pX, pY);
		radar.erabili(this.etsaiarenTaula, pX, pY, 3);
	}

	public void /*boolean*/ tiroEgin(String arma, int pX, int pY) { //ESTA FATAL!!!!!
		/*PRIMERO TIENES QUE ELEGIR EL ARMA CON LA QUE QUIERES TIRAR Y LUEGO ELIGES A QUE BARKO, POR LO TANTO, EL ARMA 
		 * ES LA QUE DAÑA.*/
		boolean badago = this.armamentua.armaDago(arma);
		if (badago){
			Arma nireArma = armamentua.hartuArma(arma);
			armamentua.armaKendu(nireArma);
			nireArma.erabili(this.etsaiarenTaula, pX, pY);
		} //TODO EZ BADAGO NAHI DUZUN ARMA ZURE ARMAMENTUA, BESTE BAT AUKERATU.
		/*if (etsaiarenTaula.ontziaDago(pX, pY) && !(etsaiarenTaula.getOntzia(pX, pY).ikutua(pX, pY))) {
			etsaiarenTaula.tiroEgin(pX, pY);
			return true;
		} else {
			return false;
		}*/
	}

}
