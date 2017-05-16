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
	
	public int getDirua(){
		return dirua;
	}
	
	public Armamentua getArmamentua(){
		return armamentua;
	}
	

   /*
	*public void radarraJarri(int x, int y){
	* etsaiarenTaula.radarKontsultatu(x, y); }
	*/

	public boolean ontziakDauzka() { //para que se usa este metodo?
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

	public boolean armaErosi(String arma) {
		Biltegia biltegia = Biltegia.getNireBiltegia();
		if (biltegia.armaDago(arma)){
			Arma nahiDuguna = biltegia.hartuArma(arma);
			if (this.dirua >= nahiDuguna.getKostua()) {
				biltegia.armaKendu(nahiDuguna);
				this.dirua = this.dirua - nahiDuguna.getKostua();
				this.armamentua.armaGehitu(nahiDuguna);
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}

	public boolean ontziaKonpondu(int pX, int pY) {
		Ontzia ontzia = this.jokalariarenTaula.getOntzia(pX, pY);
		if (ontzia.konpondu(this.dirua)){
			this.dirua=this.dirua - ontzia.getKonponketaKostua();
			return true;
		}else{
			return false;
		}
	}
	
	public boolean flotaUrperatuta(){
		return flota.flotaUrperatuta();
	}

}
