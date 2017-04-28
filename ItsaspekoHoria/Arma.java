package ItsaspekoHoria;

public abstract class Arma {
	// atributuak
	protected int kostua;

	// eraikitzaila
	public Arma(int pKostua) {
		this.kostua = pKostua;

	}

	// metodoak
	public abstract void erabili(Taula etsailarenTaula, int pX, int pY);

}
