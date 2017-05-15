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

	/*public void ontziaEzkutatu(int pLerroa, int pZutabea) {
		if (jokalariarenTaula.ontziaDago(pLerroa, pZutabea)) {
			jokalariarenTaula.getOntzia(pLerroa, pZutabea).ezkutatu();
		} else
			System.out.println("Ez dago ontzirik");
	}*/

/*	public void radarra(Radar radar, int pX, int pY) {
		// etsaiarenTaula.radarKontsultatu(pX, pY);
		radar.erabili(this.etsaiarenTaula, pX, pY, 3);
	}*/
	
	public void radarraErabili(){
		armamentua.armaKendu(new Radar());
	}

	public boolean tiroEgin(String arma, int pX, int pY, int misilZuzenduNorabidea, Taula besteTaula) { 
		boolean emaitza=false;	
		if (this.armamentua.armaDago(arma)){
			Arma nireArma = this.armamentua.hartuArma(arma);
			if (nireArma instanceof Ezkutua){
				nireArma.erabili(this.jokalariarenTaula, pX, pY, misilZuzenduNorabidea);
				if(this.jokalariarenTaula.getOntzia(pX, pY)!=null){
				this.armamentua.armaKendu(nireArma);}
			}else{
				//System.out.println(pX+""+pY);
				nireArma.erabili(besteTaula, pX, pY, misilZuzenduNorabidea);
				this.armamentua.armaKendu(nireArma);
			}
			emaitza=true;
		}
		return emaitza;
	}

}
