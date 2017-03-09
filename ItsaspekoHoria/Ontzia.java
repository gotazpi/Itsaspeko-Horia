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
	
	public boolean ezkutatu(){
		if (!ezkutua){
			ezkutua=true;
			return true;
		}
		else{
			return false;
		}
	}

}
