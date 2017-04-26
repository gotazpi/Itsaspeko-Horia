package ItsaspekoHoria;

public abstract class Ontzia {
	
	//atributuak
	private int luzera;
	private float konponketaKostua;
	private EgoeraOntzia egoeraOntzia;
	private Koordenatuak[] koordenatuak;
	private int jasandakoBonbaKop;
	
	//erabiltzailea
	public Ontzia (int pLuzera, float pKonponketaKostua){
		this.luzera=pLuzera;
		this.konponketaKostua=pKonponketaKostua;
		this.egoeraOntzia= new IkutuGabe();
		this.jasandakoBonbaKop=0;
	}
	
	public void ezkutatu(){
		if (!(egoeraOntzia instanceof Ezkutatuta)){
			this.egoeraAldatu(new Ezkutatuta());
			System.out.println("Ontzia ezkutatu da!");
		}
		else{
			System.out.println("Dagoeneko ezkutaturik zegoen");}
		}
	
	public int getLuzera(){
		return luzera;
	}
	
	public boolean ikutua(int pX, int pY){
		return bilatuKoordenatuak(pX, pY).ikutua();
	}
	
	public void ikutu(int pX, int pY){
		bilatuKoordenatuak(pX, pY).ikutu();
	}
	
	private Koordenatuak bilatuKoordenatuak(int pX, int pY){
		Koordenatuak aux=null;
		for(int i=0;i==koordenatuak.length;i++){
			if (koordenatuak[i].koordenatuaDa(pX,pY)){
				aux=koordenatuak[i];
			}
		}
		return aux;
	}
	
	public void egoeraAldatu(EgoeraOntzia egoeraBerria){
		this.egoeraOntzia=egoeraBerria;
	}
	
	public EgoeraOntzia getEgoera(){
		return this.egoeraOntzia;
	}
	
	public boolean jasandakoBonbaKopGainditu(){
		if (this.jasandakoBonbaKop==1){
			return true;
		}else{
			return false;
		}
	}
	public void jasandakoBonbaKopAldatu(int pKop){
		this.jasandakoBonbaKop=pKop;
	}
}
