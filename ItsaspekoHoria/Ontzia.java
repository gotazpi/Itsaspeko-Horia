package ItsaspekoHoria;

public abstract class Ontzia {
	
	//atributuak
	private int luzera;
	private float konponketaKostua;
	private boolean ezkutua;
	private Koordenatuak[] koordenatuak;
	
	//erabiltzailea
	public Ontzia (int pLuzera, float pKonponketaKostua){
		this.luzera=pLuzera;
		this.konponketaKostua=pKonponketaKostua;
		this.ezkutua=false;
	}
	
	public void ezkutatu(){
		if (!ezkutua){
			ezkutua=true;
			System.out.println("Ontzia ezkutatu da!");
		}
		else{
			System.out.println("Dagoeneko ezkutaturik zegoen");
		}
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

}
