package ItsaspekoHoria;

public class Koordenatuak {
	//atributuak
	private int errenkada;
	private int zutabea;
	
	//eraikitzailea
	public Koordenatuak(int pErrenkada, int pZutabea){
		this.errenkada=pErrenkada;
		this.zutabea=pZutabea;
	}
	
	//metodoak
	public int getErrenkada(){
		return this.errenkada;
	}
	
	public int getZutabea(){
		return this.zutabea;
	}
	
	public void setErrenkada(int pErrenkada){
		this.errenkada=pErrenkada;
	}
	public void setZutabea(int pZutabea){
		this.zutabea=pZutabea;
	}
}
