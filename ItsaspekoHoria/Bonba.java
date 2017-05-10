package ItsaspekoHoria;

public class Bonba extends Arma {
	// atributuak

	// eraikitzailea
	public Bonba() {
		super(10);
	}

	// metodoak
	public void erabili(Taula etsaiarenTaula, int pX, int pY, int misilZuzenduNorabidea) {
		Ontzia ontziBat = etsaiarenTaula.getOntzia(pX, pY);
		if (ontziBat != null) {  //ontzia badago
			if (ontziBat.getEgoera() instanceof Ezkutatuta) {
				if (ontziBat.jasandakoBonbaKopGainditu()) {
					ontziBat.egoeraAldatu(new IkutuGabe());
					ontziBat.jasandakoBonbaKopAldatu(0);
				} 
				else {
					ontziBat.jasandakoBonbaKopAldatu(1);
				}
			} 
			else {
				if (ontziBat.getEgoera() instanceof IkutuGabe && !ontziBat.ikutua(pX, pY)) {
					ontziBat.ikutu(pX, pY);
					
				}
			}
		}
	}
	
	

}
