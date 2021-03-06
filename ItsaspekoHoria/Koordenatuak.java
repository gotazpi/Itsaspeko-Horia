package ItsaspekoHoria;

public class Koordenatuak {
	
	//ATRIBUTUAK
	private int errenkada;
	private int zutabea;
	private boolean ikutua;
	
	//ERAIKITZAILEA
	public Koordenatuak(int pErrenkada, int pZutabea){
		this.errenkada=pErrenkada;
		this.zutabea=pZutabea;
		this.ikutua=false;
	}
	
	//METODOAK
	public int getErrenkada(){
		return this.errenkada;
	}

	public int getZutabea() {
		return this.zutabea;
	}

	/*public void setErrenkada(int pErrenkada) {
		this.errenkada = pErrenkada;
	}

	public void setZutabea(int pZutabea) {
		this.zutabea = pZutabea;
	}*/

	public boolean koordenatuaDa(int pX, int pY) {		//konprobatzen du ia (x,y) ontziaren koordenatua den 
		if ((errenkada == pX) && (zutabea == pY)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ikutua() {	//bueltatzen du ia koordenatu hori ikutua dagoen edo ez
		return ikutua;
	}

	public void ikutu(boolean ikutu) {	//ontziaren koordenatu hori ikutu egiten du
		ikutua = ikutu;
	}

}
