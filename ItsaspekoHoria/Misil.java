package ItsaspekoHoria;

public class Misil extends Arma {
	//ATRIBUTUAK

	//ERAIKITZAILEA
	public Misil() {
		super(40);
	}

	//METODOAK
	public void erabili(Taula etsaiarenTaula, int pX, int pY, int misilZuzenduNorabidea) {	//(x,y) koordenatuak dagoen ontzi osoa suntsitzen du
		Ontzia ontziBat = etsaiarenTaula.getOntzia(pX, pY);
		if (ontziBat != null){
			if (ontziBat.getEgoera() instanceof Ezkutatuta) {	//ezkutua badago, ezkutua apuntu egiten du
				ontziBat.egoeraAldatu(new IkutuGabe());
			} else {
				ontziBat.egoeraAldatu(new Suntsituta());
				ontziBat.ontziaIkutu();
			}
		}
	}

}
