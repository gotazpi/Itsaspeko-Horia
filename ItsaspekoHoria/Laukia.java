package ItsaspekoHoria;

public class Laukia {
	//atributuak
	private boolean ontziaDago;
	private int zutabe;
	private int lerro;
	
	//eraikitzailea
	public Laukia (int pZutabe, int pLerro){
		this.ontziaDago=false;
		this.zutabe=pZutabe;
		this.lerro=pLerro;
	}
	public boolean OntziaDago(){
		return ontziaDago;
	}
}
