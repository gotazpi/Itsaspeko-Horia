package ItsaspekoHoria;

public class Bonba extends Arma {
	//ATRIBUTUAK

	//ERAIKITZAILEA
	public Bonba() {
		super(15);
	}

	//METODOAK
	public void erabili(Taula etsaiarenTaula, int pX, int pY, int misilZuzenduNorabidea) {	//aukeratutako laukia ikutuko du. 
		Ontzia ontziBat = etsaiarenTaula.getOntzia(pX, pY);
		if (ontziBat != null) {  //ontzia badago
			if (ontziBat.getEgoera() instanceof Ezkutatuta) {		//ontzi horretan ezkutua badago, bi bonba erori behar dira ezkutua kentzeko
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
					if (ontziBat.koodenadaGuztiakIkututa()){
						ontziBat.egoeraAldatu(new Suntsituta());
					}
					
					
				}
			}
		}
	}
	
	

}
