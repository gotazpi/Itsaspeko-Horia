package ItsaspekoHoria;

public abstract class Arma {
	// atributuak
	protected int kostua;

	// eraikitzaila
	public Arma(int pKostua) {
		this.kostua = pKostua;

	}

	// metodoak
	
	public abstract void erabili(Taula etsaiarenTaula, int pX, int pY, int misilZuzenduNorabidea);

}
