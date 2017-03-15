package ItsaspekoHoria;

public abstract class Ontzia {
	
	//atributuak
	private int luzera;
	private float konponketaKostua;
	private boolean ezkutua;
	
	//erabiltzailea
	public Ontzia (int pLuzera, float pKonponketaKostua){
		this.luzera=pLuzera;
		this.konponketaKostua=pKonponketaKostua;
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

}
