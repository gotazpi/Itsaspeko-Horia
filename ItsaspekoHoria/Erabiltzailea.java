package ItsaspekoHoria;

public class Erabiltzailea extends Jokalaria {
	
	//ATRIBUTUAK
	private static Erabiltzailea nireErabiltzailea;

	//ERAIKITZAILEA
	private Erabiltzailea() {
		super();
	}

	//METODOAK
	public static Erabiltzailea getErabiltzailea() {	//erabiltzailearen instantzia bueltatuko du
		if (nireErabiltzailea == null) {
			nireErabiltzailea = new Erabiltzailea();
		}
		return nireErabiltzailea;
	}

	public void ontziaKokatu(int pLerroa, int pZutabea, int pNorantza, Ontzia pOntzia) {	//erabiltzailearen ontzi bat kokatuko du
		jokalariarenTaula.ontziOsoaKokatu(pOntzia, pLerroa, pZutabea, pNorantza);
	}
	
	public void radarraErabili(){
		armamentua.armaKendu(new Radar());
	}

	public boolean tiroEgin(String arma, int pX, int pY, int misilZuzenduNorabidea, Taula besteTaula) { //erabiltzaileak aukeratzen duen posizioan, 
		boolean emaitza=false;																			//aukeratutako arma egikarituko da
		if (this.armamentua.armaDago(arma)){
			Arma nireArma = this.armamentua.hartuArma(arma);
			if (nireArma instanceof Ezkutua){
				if(this.jokalariarenTaula.getOntzia(pX, pY)!=null){
					if (!this.jokalariarenTaula.getOntzia(pX, pY).laukirenBatIkututa()){
						nireArma.erabili(this.jokalariarenTaula, pX, pY, misilZuzenduNorabidea);
						this.armamentua.armaKendu(nireArma);
						//Jokoa.getJokoa().txandaPasa();
					}
				}
			}else{
				nireArma.erabili(besteTaula, pX, pY, misilZuzenduNorabidea);
				this.armamentua.armaKendu(nireArma);
				//Jokoa.getJokoa().txandaPasa();
			}
			emaitza=true;
		}
		return emaitza;
	}

}
