package ItsaspekoHoria;

public class Laukia {
	//ATRIBUTUAK
	private EgoeraLaukia egoera;
	private int zutabe;
	private int lerro;
	private Ontzia ontzia;

	//ERAIKITZAILEA
	public Laukia(int pZutabe, int pLerro) {
		this.egoera = new Ura();
		this.zutabe = pZutabe;
		this.lerro = pLerro;
		this.ontzia = null;
	}
	
	//METODOAK
	public void egoeraAldatu(EgoeraLaukia pEgoeraBerria) {
		this.egoera = pEgoeraBerria;
	}

	public void setOntzia(Ontzia pOntzia) {
		ontzia = pOntzia;
	}

	public Ontzia getOntzia() {
		return ontzia;
	}
 
	public EgoeraLaukia getEgoera() {
		return this.egoera;
	}

}
