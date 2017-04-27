package ItsaspekoHoria;

import java.util.Observable;

import Grafika.*;



public class Jokoa{
	
	private static Jokoa nireJokoa;

	private static Ordenagailua ordenagailua; //txanda 1
	private static Erabiltzailea erabiltzailea; //txanda 0
	private int txanda=0;
	private int zerEgin=0;
	
	private Jokoa(){
		super();
	}
	
	public static Jokoa getJokoa(){
		if (nireJokoa==null){
			nireJokoa=new Jokoa();
		}
		return nireJokoa;
	}
	
	public static void main (String[] args){
		ordenagailua = Ordenagailua.getOrdenagailua();
		erabiltzailea = Erabiltzailea.getErabiltzailea();
		jokoaHasieratu();
		Leihoa.getLeihoa().hasiera();
	}
	
	public boolean irabazi(){
		//TODO
		return false;
	}
	
	public boolean galdu(){
		//TODO
		return false;
	}
	
	public static void jokoaHasieratu(){
		//TODO armamentua hasieratu eta gauza gehiago
		ordenagailua.ontziaKokatu();
	}

/*	public void jokatu(){   //METODO NAGUSIA
		if (jokatuDaiteke()){
			if (txanda==0){
				erabiltzailea.jokatu();
				this.txandaPasa();
			}else{
				ordenagailua.jokatu();
				this.txandaPasa();
			}	
		}else{
			this.norkIrabaziDu();	
		}	
	}
*/	
	public void txandaPasa(){
		if (txanda==0){
			txanda=1;
			//this.jokatu();
		}else{
			txanda=0;
			//this.jokatu();
		}
	}
	
	public boolean jokatuDaiteke(){
		if (erabiltzailea.ontziakDauzka() && ordenagailua.ontziakDauzka()){
			return true;
		}else{
			return false;
		}
	}
	
	public void norkIrabaziDu(){
		if (erabiltzailea.ontziakDauzka()){//Grafikan nork irabazi duen erakutsi //TODO
			//erakutsi erabiltzailea grafikan
		}else{
			//erakutsi ordenagailua grafikan
		}
	}
	public void tiroEgiteko(){
		zerEgin=0;
	}
	public void radarraEgiteko(){
		zerEgin=1;
	}
	public int getZeregin(){
		return zerEgin;
	}
	
	public boolean kokatuGrafikatik(int i, int j){
		int norabidea = Erabiltzailea.getErabiltzailea().getFlota().getNorabidea();
		int zein = Erabiltzailea.getErabiltzailea().getFlota().getZein();
		if (zein<=9){
			Ontzia ontzia = Erabiltzailea.getErabiltzailea().getFlota().getOntzia(zein);
			if(Erabiltzailea.getErabiltzailea().getTaula().ontziOsoaKokatu(ontzia, i, j, norabidea)){
				Erabiltzailea.getErabiltzailea().getFlota().hurrengoa();
				return true;
			};
		}
		return false;
	}
	
	public boolean ontziaDago(int i, int j){
		if(Ordenagailua.getOrdenagailua().getTaula().ontziaDago(i,j)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public EgoeraOntzia getOntziarenEgoera(int i, int j){
		return Ordenagailua.getOrdenagailua().getTaula().getOntzia(i, j).getEgoera();
	}
	
	public boolean ontziaIkutua(int i, int j){
		return Ordenagailua.getOrdenagailua().getTaula().getOntzia(i, j).ikutua(i, j);
	}
	
	public void ontziaIkutu(int i, int j){
		Ordenagailua.getOrdenagailua().getTaula().getOntzia(i, j).ikutu(i,j);
	}
	
}

	
