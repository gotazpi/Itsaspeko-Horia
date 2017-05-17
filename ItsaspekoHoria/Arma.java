package ItsaspekoHoria;

public abstract class Arma {
	
	//ATRIBUTUAK
	protected int kostua;

	//ERAIKITZAILEA
	public Arma(int pKostua) {
		this.kostua = pKostua;

	}

	//METODOAK
	public abstract void erabili(Taula etsaiarenTaula, int pX, int pY, int misilZuzenduNorabidea);	//arma bakoitza implementatuko du bere 
																									//modura, bakoitzaren kaltearen arabera

	public int getKostua(){
		return this.kostua;
	}
}
