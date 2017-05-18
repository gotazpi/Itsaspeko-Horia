package ItsaspekoHoria;

import java.util.Observable;

public abstract class Ontzia {

	//ATRIBUTUAK
	private int luzera;
	private int konponketaKostua;
	private EgoeraOntzia egoeraOntzia;
	private Koordenatuak[] koordenatuak;
	private int jasandakoBonbaKop;

	//ERAIKITZAILEA
	public Ontzia(int pLuzera, int pKonponketaKostua) {
		this.luzera = pLuzera;
		this.konponketaKostua = pKonponketaKostua;
		this.egoeraOntzia = new IkutuGabe();
		this.jasandakoBonbaKop = 0;
	}

	//METODOAK
	public boolean ezkutatu() {		//ontziak ezkutua bere gainean jartzen du
		if (!(egoeraOntzia instanceof Ezkutatuta)&& !(egoeraOntzia instanceof Suntsituta)) {
			this.egoeraAldatu(new Ezkutatuta());
			System.out.println("Ontzia ezkutatu da!");
			return true;
		} else {
			System.out.println("Dagoeneko ezkutaturik edo suntsiturik zegoen ");
			return false;
		}
	}

	public int getLuzera() {
		return luzera;
	}

	public boolean ikutua(int pX, int pY) {		//ontziaren (x,y) koordenatua ikutua dagoen edo ez konprobatzen du
		return bilatuKoordenatuak(pX, pY).ikutua();
	}

	public void ikutu(int pX, int pY) {			//ontziaren (x,y) koordenatua ikutzen du
		bilatuKoordenatuak(pX, pY).ikutu(true);
	}

	private Koordenatuak bilatuKoordenatuak(int pX, int pY) {	//ontziaren (x,y) koordenatua itzultzen du
		Koordenatuak aux = null;
		int i = 0;
		while (i != koordenatuak.length) {
			if (koordenatuak[i].koordenatuaDa(pX, pY)) {
				aux = koordenatuak[i];
			}
			i++;
		}
		return aux;
	}
	
	public void ontziaIkutu(){		//ontziaren koordenatu guztiak ikutzen ditu
		int i =0;
		while (i<this.koordenatuak.length){
			this.koordenatuak[i].ikutu(true);
			i++;
		}
	}

	public void egoeraAldatu(EgoeraOntzia egoeraBerria) {
		this.egoeraOntzia = egoeraBerria;
	}

	public EgoeraOntzia getEgoera() {
		return this.egoeraOntzia;
	}

	public boolean jasandakoBonbaKopGainditu() {		//bonba bat jada jaso badu hurrengoarekin gainditu egingo da jasan ahal dituen 
		if (this.jasandakoBonbaKop == 1) {				//bonba kopurua, beraz emaitza true izango da (ezkutua aputzeko)
			return true;
		} else {
			return false;
		}
	}

	public void jasandakoBonbaKopAldatu(int pKop) {
		this.jasandakoBonbaKop = pKop;
	}

	public void koordenatuakJarri(int pX, int pY, int i) {		//ontziari koordenatuak esleitzen zaizkio
		if (koordenatuak == null) {
			koordenatuak = new Koordenatuak[luzera];
		}
		koordenatuak[i] = new Koordenatuak(pX, pY);
	}

	public boolean erosDezake(int dirua) {		//jokalariak ontzi hori konpodu dezakeen konprobatzen du
		if (dirua >= this.konponketaKostua) {
			return true;
		} else {
			return false;
		}
	}

	public int getKonponketaKostua() {
		return this.konponketaKostua;
	}
	
	public boolean koodenadaGuztiakIkututa(){		//ontzi horren koordenada guztiak ikututa dauden edo ez konprobatzen du
		boolean emaitza=true;
		int i=0;
		while(emaitza && i<this.koordenatuak.length){
			if (!this.koordenatuak[i].ikutua()){
				emaitza=false;
			}
			i++;
		}
		return emaitza;
	}
	
	public boolean konpondu(int dirua){		//ontzia konpondu egiten da
		boolean emaitza=false;
		if (this.egoeraOntzia instanceof Suntsituta){
			if (this.erosDezake(dirua)){
				this.egoeraAldatu(new IkutuGabe());
				for (int i=0; i<this.luzera; i++){
					this.koordenatuak[i].ikutu(false);
				}
				this.jasandakoBonbaKop=0;
				emaitza=true;
				System.out.println("Ontzi bat konpondu da");
			}
		}else{
			System.out.println("Aukeratu duzun barkua ez dago suntsituta beraz ezin duzu konpondu.");
		}
		return emaitza;
	}
	
	public Koordenatuak getKoordenatuak(){	//ontziaren lehenego koordenatua itzultzen du
		return this.koordenatuak[0];
	}
	
	public boolean laukirenBatIkututa(){	//koordenaturen bt ikututa dagoen konprobatzen du
		int i = 0;
		boolean topatua = false;
		while (i<luzera && topatua==false){
			if (this.koordenatuak[i].ikutua()){
				topatua=true;
			}
			i++;
		}
		if (topatua){
			return true;
		}else{
			return false;
		}
		/*for(int i=0; i<luzera; i++){
			if(this.koordenatuak[i].ikutua()){
				return true;
			}
		}
		return false;*/
	}
	
	
	
}
