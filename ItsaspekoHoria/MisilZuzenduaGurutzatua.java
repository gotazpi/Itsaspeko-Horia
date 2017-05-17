package ItsaspekoHoria;

public class MisilZuzenduaGurutzatua extends MisilZuzendua {
	
	//ATRIBUTUAK

	//ERAIKITZAILEA
	public MisilZuzenduaGurutzatua() {
		super();
		this.kostua=60;
	}

	//METODOAK
	@Override
	public void erabili(Taula etsaiarenTaula, int pX, int pY, int misilZuzenduNorabidea) {	//Bertikaean eta horizontalean deseustatzen du
		this.bertikaleanSuntsitu(etsaiarenTaula, pX, pY);
		this.horizontaleanSuntsitu(etsaiarenTaula, pX, pY);
	}
	
	
}
