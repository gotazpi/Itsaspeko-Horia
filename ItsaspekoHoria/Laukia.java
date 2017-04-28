package ItsaspekoHoria;

public class Laukia {
	// atributuak
	private EgoeraLaukia egoera;
	private int zutabe;
	private int lerro;
	private Ontzia ontzia;

	// eraikitzailea
	public Laukia(int pZutabe, int pLerro) {
		this.egoera = new Ura();
		this.zutabe = pZutabe;
		this.lerro = pLerro;
		this.ontzia = null;
	}

	public void egoeraAldatu(EgoeraLaukia pEgoeraBerria) {
		this.egoera = pEgoeraBerria;
	}

	/*
	 * public boolean getOntziaDago(){ return ontziaDago; } public boolean
	 * getBarkuaHurbil(){ return barkuaHurbil; }
	 * 
	 * public void setBarkuaHurbil(){ barkuaHurbil=true; }
	 * 
	 * public void setOntziaDago(){ ontziaDago=true; } public boolean
	 * ontziaDago(){ return ontziaDago; }
	 */
	public void setOntzia(Ontzia pOntzia) {
		ontzia = pOntzia;
	}

	public Ontzia getOntzia() {
		return ontzia;
	}

	public EgoeraLaukia getEgoera() {
		return this.egoera;
	}

	public void koloreAldatu() {
	}
}
