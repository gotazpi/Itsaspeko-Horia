package ItsaspekoHoria;

public class Misil extends Arma {
	// atributuak

	// eraikitzailea
	public Misil() {
		super(30);
	}

	// metodoak
	public void erabili(Taula etsaiarenTaula, int pX, int pY, int misilZuzenduNorabidea) {
		Ontzia ontziBat = etsaiarenTaula.getOntzia(pX, pY);
		if (ontziBat.getEgoera() instanceof Ezkutatuta) {
			ontziBat.egoeraAldatu(new IkutuGabe());
		} else {
			ontziBat.egoeraAldatu(new Suntsituta());
		}
	}

}
