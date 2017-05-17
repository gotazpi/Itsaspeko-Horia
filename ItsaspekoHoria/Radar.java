package ItsaspekoHoria;

public class Radar extends Arma {
	//ATRIBUTUAK
	private static int erradioa = 1;

	//ERAIKITZAILEA
	public Radar() {
		super(40);
	}

	//METODOAK
	@Override
	public void erabili(Taula etsailarenTaula, int pX, int pY, int misilZuzendua) {
		System.out.println("Radarra erabili da");
	}
}
