package ItsaspekoHoria;

public class Laukia {
	//atributuak
	private boolean ontziaDago;
	private boolean barkuaHurbil;
	private int zutabe;
	private int lerro;
	private Ontzia ontzia;

	//eraikitzailea
	public Laukia (int pZutabe, int pLerro){
		this.ontziaDago=false;
		this.zutabe=pZutabe;
		this.lerro=pLerro;
		this.barkuaHurbil=false;
		this.ontzia=null;
	}

	public boolean getOntziaDago(){
		return ontziaDago;
	}
	public boolean getBarkuaHurbil(){
		return barkuaHurbil;
	}
	
	public void setBarkuaHurbil(){
		barkuaHurbil=true;
	}
	
	public void setOntziaDago(){
		ontziaDago=true;
	}
	public boolean ontziaDago(){
		return ontziaDago;
	}
	public void setOntzia(Ontzia pOntzia){
		ontzia=pOntzia;
	}
	public Ontzia getOntzia(){
		return ontzia;
	}
}
