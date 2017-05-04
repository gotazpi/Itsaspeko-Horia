package ItsaspekoHoria;

public abstract class Jokalaria {

	// atributuak
	protected Taula jokalariarenTaula;
	protected Taula etsaiarenTaula;
	protected Armamentua armamentua;
	protected Flota flota;
	protected int dirua;

	// eraikitzailea
	public Jokalaria() {
		this.armamentua = new Armamentua();
		this.jokalariarenTaula = new Taula();
		this.etsaiarenTaula = new Taula();
		this.flota = new Flota();
		dirua = 100;
	}

	// metodoak
	public Taula getTaula() {
		return this.jokalariarenTaula;
	}

	public Flota getFlota() {
		return this.flota;
	}

	/*
	 * public void radarraJarri(int x, int y){
	 * etsaiarenTaula.radarKontsultatu(x, y); }
	 */

	public boolean ontziakDauzka() {
		if (this.flota.getOntziKop() != 0) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * public void jokatu(){ int erantzuna=this.galdetuZerEgin(); if
	 * (erantzuna==1){ this.armaErosi(arma); //armen zerrenda bat egertuko zaizu
	 * hau klikatu ostean }else{ if(erantzuna==2){ this.ontziaKonpondu(); }else{
	 * this.tiroEgin(); } } }
	 */

	public void armaErosi(String arma) {
		Biltegia biltegia = Biltegia.getNireBiltegia();
		Arma nahiDuguna = biltegia.armaLortu(arma);
		if (nahiDuguna != null && this.dirua >= nahiDuguna.kostua) {
			biltegia.armaKendu(nahiDuguna);
			this.dirua = this.dirua - nahiDuguna.kostua;
			this.armamentua.armaGehitu(nahiDuguna);
		}
	}

	/*public void galdetuZerEgin() {
		// mirar en la grafika cual es la option que elije
	}*/

	public void ontziaKonpondu(Ontzia ontzia) {
		if (ontzia.getEgoera() instanceof Suntsituta) {
			if (ontzia.erosDezake(this.dirua)) { /* Diru nahiko du barkua konpontzeko */
				ontzia.egoeraAldatu(new IkutuGabe());
				ontzia.jasandakoBonbaKopAldatu(0);
				this.dirua = this.dirua - ontzia.getKonponketaKostua();
				System.out.println("Barkua konpondu da.");
			}
		}else{/* Aukeratu duzun barkua ez dago suntsituta beraz ezin da konpondu */
			System.out.println("Aukeratu duzun barkua ez dago suntsituta beraz ezin duzu konpondu.");
		}
	}

}
