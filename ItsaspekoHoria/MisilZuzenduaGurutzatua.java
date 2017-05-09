package ItsaspekoHoria;

public class MisilZuzenduaGurutzatua extends MisilZuzendua {
	// atributuak

	// eraikitzailea
	public MisilZuzenduaGurutzatua() {
		super();
		this.kostua=45;
	}

	// metodoak
	@Override
	public void erabili(Taula etsaiarenTaula, int pX, int pY, int misilZuzenduNorabidea) {
		this.bertikaleanSuntsitu(etsaiarenTaula, pX, pY);
		this.horizontaleanSuntsitu(etsaiarenTaula, pX, pY);
	}
	
	
}
