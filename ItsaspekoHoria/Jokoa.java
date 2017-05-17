package ItsaspekoHoria;

import java.util.Observable;


import Grafika.*;

public class Jokoa  extends Observable {

	private static Jokoa nireJokoa;

	private static Ordenagailua ordenagailua; // txanda 1
	private static Erabiltzailea erabiltzailea; // txanda 0
	private int txanda = 0;
	private int zerEgin = 2;
	private String mezua = "Lehenik ontziak kokatu eta ondoren jolasten hasiko zara";

	private Jokoa() {
		super();
	}

	public static Jokoa getJokoa() {
		if (nireJokoa == null) {
			nireJokoa = new Jokoa();
		}
		return nireJokoa;
	}

	public static void main(String[] args) {
		ordenagailua = Ordenagailua.getOrdenagailua();
		erabiltzailea = Erabiltzailea.getErabiltzailea();
		Denda observado = Denda.getDenda();
        Jokoa observado2 = Jokoa.getJokoa();
        Leihoa observador = Leihoa.getLeihoa();
        
        observado.addObserver(observador);
        observado2.addObserver(observador);
		jokoaHasieratu();
		Leihoa.getLeihoa().hasiera();
	}

	public boolean irabazi() {
		return Ordenagailua.getOrdenagailua().flotaUrperatuta();
	}

	public boolean galdu() {
		return Erabiltzailea.getErabiltzailea().flotaUrperatuta();
	}

	public static void jokoaHasieratu() {
		// TODO armamentua hasieratu eta gauza gehiago
		
		ordenagailua.ontziaKokatu();
	}

	public void txandaPasa() {
		setChanged();
		notifyObservers();
		if (txanda == 0) {
			txanda = 1;
			Ordenagailua.getOrdenagailua().ordenagailuaZerEginNahiDu();
		} else {
			txanda = 0;
			// this.jokatu();
		}
	}

	public boolean jokatuDaiteke() {
		if (!erabiltzailea.flotaUrperatuta() && !ordenagailua.flotaUrperatuta()){
		//if (erabiltzailea.ontziakDauzka() && ordenagailua.ontziakDauzka()) {
			return true;
		} else {
			return false;
		}
	}

	public void norkIrabaziDu() {
		if (!erabiltzailea.flotaUrperatuta()){
		//if (erabiltzailea.ontziakDauzka()) {// Grafikan nork irabazi duen
											// erakutsi //TODO
			// erakutsi erabiltzailea grafikan
		} else {
			// erakutsi ordenagailua grafikan
		}
	}

	//El jugador lo usa en la grafica
	//0Dispara, 1UsasRadar, 2ColocaBarcos, 3PoneEscudos
	/*public void tiroEgiteko() {
		zerEgin = 0;
	}

	public void radarraEgiteko() {
		zerEgin = 1;
	}
	
	public void ezkutatzeko(){
		zerEgin = 3;
	}
	*/
	public int getZeregin() {
		return zerEgin;
	}
	
	public boolean ezkutatu(int i , int j){
		if(Erabiltzailea.getErabiltzailea().getTaula().getOntzia(i,j)!=null){
			return Erabiltzailea.getErabiltzailea().getTaula().getOntzia(i,j).ezkutatu();
			
		}
		else return false;
	}
	public String getOntziarenIzena(){ //el nombre del barco que esta por colocar
		int zein = Erabiltzailea.getErabiltzailea().getFlota().getZein();
		if (zein <= 9) {
		Ontzia ontzia = Erabiltzailea.getErabiltzailea().getFlota().getOntzia(zein);
		return ontzia.getClass().getSimpleName();
		}
		else return "Ez dago";
	}
	public String getOntziarenTamaina(){//el tama�o del barco que esta por colocar
		int zein = Erabiltzailea.getErabiltzailea().getFlota().getZein();
		if (zein <= 9) {
		Ontzia ontzia = Erabiltzailea.getErabiltzailea().getFlota().getOntzia(zein);
		return Integer.toString(ontzia.getLuzera());
		}
		else return "Ez dago";
	}
	public boolean kokatuGrafikatik(int i, int j) {
		int norabidea = Erabiltzailea.getErabiltzailea().getFlota().getNorabidea();
		int zein = Erabiltzailea.getErabiltzailea().getFlota().getZein();
		if (zein <= 9) {
			Ontzia ontzia = Erabiltzailea.getErabiltzailea().getFlota().getOntzia(zein);
			if (Erabiltzailea.getErabiltzailea().getTaula().ontziOsoaKokatu(ontzia, i, j, norabidea)) {
				Erabiltzailea.getErabiltzailea().getFlota().hurrengoa();
				return true;
			}
			;
		}
		return false;
	}
	public int zeinOntziKokatu(){
		return Erabiltzailea.getErabiltzailea().getFlota().getZein();
	}
	public boolean ontziaDago(int i, int j) {
		if (Ordenagailua.getOrdenagailua().getTaula().ontziaDago(i, j)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean ontziaDago2(int i, int j) {		
		if (Erabiltzailea.getErabiltzailea().getTaula().ontziaDago(i, j)) {
			return true;
		} else {
			return false;
		}
	}

	public EgoeraOntzia getOntziarenEgoera(int i, int j) {
		return Ordenagailua.getOrdenagailua().getTaula().getOntzia(i, j).getEgoera();
	}
	public EgoeraOntzia getOntziarenEgoera2(int i, int j) {
		return Erabiltzailea.getErabiltzailea().getTaula().getOntzia(i, j).getEgoera();
	}

	public boolean ontziaIkutua(int i, int j) {
		return Ordenagailua.getOrdenagailua().getTaula().getOntzia(i, j).ikutua(i, j);
	}
	public boolean ontziaIkutua2(int i, int j) {
		return Erabiltzailea.getErabiltzailea().getTaula().getOntzia(i, j).ikutua(i, j);
	}

	public void ontziaIkutu(int i, int j) {
		Ordenagailua.getOrdenagailua().getTaula().getOntzia(i, j).ikutu(i, j);
	}
	public int getNorabidea() {
		return Erabiltzailea.getErabiltzailea().getFlota().getNorabidea();
	}
	public void norabideaEzarri(int i){
		Erabiltzailea.getErabiltzailea().getFlota().setNorabidea(i);
	}
	public boolean jokalariakTiroEgin(String arma, int pX, int pY, int misilZuzenduNorabidea){
		Taula besteTaula=null;
		if (txanda==0){besteTaula=Ordenagailua.getOrdenagailua().getTaula();}
		if (txanda==1){besteTaula=Erabiltzailea.getErabiltzailea().getTaula();}
		return Erabiltzailea.getErabiltzailea().tiroEgin(arma, pX, pY,misilZuzenduNorabidea, besteTaula);
	}
	
	public Erabiltzailea getErabiltzailea(){
		return Erabiltzailea.getErabiltzailea();
	}
	public Biltegia getBiltegia(){
		return Biltegia.getNireBiltegia();
	}
	public String mezua(){
		return mezua;	
	}
	public void setMezua(String pMezua){
		mezua=pMezua;
		new warning().main(null);
	}

}
