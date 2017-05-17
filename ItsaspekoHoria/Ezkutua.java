package ItsaspekoHoria;

public class Ezkutua extends Arma {
	//ATRIBUTUAK

	//ERAIKITZAILEA
	public Ezkutua() {
		super(50);
	}

	//METODOAK
	public void erabili(Taula jokalariarenTaula, int pX, int pY, int misilZuzenduNorabidea) {	//Ontzi baten gainean ezkutua jarriko da
		Ontzia ontziBat = jokalariarenTaula.getOntzia(pX, pY);
		if (ontziBat != null ) {
				ontziBat.egoeraAldatu(new Ezkutatuta());
		}
	}
}
