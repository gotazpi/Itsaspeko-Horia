package ItsaspekoHoria;

public abstract class Jokalaria {

	//ATRIBUTUAK
	protected Taula jokalariarenTaula;
	protected Taula etsaiarenTaula;
	protected Armamentua armamentua;
	protected Flota flota;
	protected int dirua;
	
	//ERAIKITZAILEA
	public Jokalaria() {
		this.armamentua = new Armamentua();
		this.jokalariarenTaula = new Taula();
		this.etsaiarenTaula = new Taula();
		this.flota = new Flota();
		dirua = 120;
	}

	//METODOAK
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
	
	/*public boolean ontziakDauzka() { 	//jokalariari ontziren bat gelditzen zaion suntsitu gabe begiratzen du
		if (this.flota.getOntziKop() != 0) {
			return true;
		} else {
			return false;
		}
	}*/

	public boolean armaErosi(String arma) {		//jokalariak arma hori erosi ahal duen edo ez konprobatzen du
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

	public boolean ontziaKonpondu(int pX, int pY) {		//(x,y) posizioen duen ontzia konpondu 
		Ontzia ontzia = this.jokalariarenTaula.getOntzia(pX, pY);
		if (ontzia.konpondu(this.dirua)){
			this.dirua=this.dirua - ontzia.getKonponketaKostua();
			return true;
		}else{
			return false;
		}
	}
	
	public boolean flotaUrperatuta(){		//jokalariaren flota guztia suntsituta dagoen konprobatzen du
		return flota.flotaUrperatuta();
	}

}
