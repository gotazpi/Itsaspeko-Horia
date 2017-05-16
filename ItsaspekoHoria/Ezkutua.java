package ItsaspekoHoria;

public class Ezkutua extends Arma {
	// atribituak

	// eraikitzailea
	public Ezkutua() {
		super(50);
	}

	// metodoak
	public void erabili(Taula jokalariarenTaula, int pX, int pY, int misilZuzenduNorabidea) {
		Ontzia ontziBat = jokalariarenTaula.getOntzia(pX, pY);
		if (ontziBat != null ) {
				ontziBat.egoeraAldatu(new Ezkutatuta());
		}
	}
}
