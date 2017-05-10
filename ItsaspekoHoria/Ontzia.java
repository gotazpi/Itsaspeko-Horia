package ItsaspekoHoria;

public abstract class Ontzia {

	// atributuak
	private int luzera;
	private int konponketaKostua;
	private EgoeraOntzia egoeraOntzia;
	private Koordenatuak[] koordenatuak;
	private int jasandakoBonbaKop;

	// erabiltzailea
	public Ontzia(int pLuzera, int pKonponketaKostua) {
		this.luzera = pLuzera;
		this.konponketaKostua = pKonponketaKostua;
		this.egoeraOntzia = new IkutuGabe();
		this.jasandakoBonbaKop = 0;
	}

	public boolean ezkutatu() {
		if (!(egoeraOntzia instanceof Ezkutatuta)) {
			this.egoeraAldatu(new Ezkutatuta());
			System.out.println("Ontzia ezkutatu da!");
			return true;
		} else {
			System.out.println("Dagoeneko ezkutaturik zegoen");
			return false;
		}
	}

	public int getLuzera() {
		return luzera;
	}

	public boolean ikutua(int pX, int pY) {
		return bilatuKoordenatuak(pX, pY).ikutua();
	}

	public void ikutu(int pX, int pY) {
		bilatuKoordenatuak(pX, pY).ikutu();
	}

	private Koordenatuak bilatuKoordenatuak(int pX, int pY) {
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

	public void egoeraAldatu(EgoeraOntzia egoeraBerria) {
		this.egoeraOntzia = egoeraBerria;
	}

	public EgoeraOntzia getEgoera() {
		return this.egoeraOntzia;
	}

	public boolean jasandakoBonbaKopGainditu() {
		if (this.jasandakoBonbaKop == 1) {
			return true;
		} else {
			return false;
		}
	}

	public void jasandakoBonbaKopAldatu(int pKop) {
		this.jasandakoBonbaKop = pKop;
	}

	public void koordenatuakJarri(int pX, int pY, int i) {
		if (koordenatuak == null) {
			koordenatuak = new Koordenatuak[luzera];
		}
		koordenatuak[i] = new Koordenatuak(pX, pY);
	}

	public boolean erosDezake(int dirua) {
		if (dirua >= this.konponketaKostua) {
			return true;
		} else {
			return false;
		}
	}

	public int getKonponketaKostua() {
		return this.konponketaKostua;
	}
	
	public boolean koodenadaGuztiakIkututa(){
		boolean emaitza=true;
		int i=0;
		while(emaitza && i<=this.koordenatuak.length){
			if (!this.koordenatuak[i].ikutua()){
				emaitza=false;
			}
		}
		return emaitza;
	}
}
