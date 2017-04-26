package ItsaspekoHoria;

import java.util.Observable;

import Grafika.*;



public class Jokoa{
	
	private static Jokoa nireJokoa;
	private static Taula erabiltzailearenTaula;
	private static Taula ordenagailuarenTaula;
	private static Ordenagailua ordenagailua; //txanda 1
	private static Erabiltzailea erabiltzailea; //txanda 0
	private int txanda=0;
	
	private Jokoa(){
		super();
		this.jokoaHasieratu();
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
		erabiltzailearenTaula = erabiltzailea.getTaula();
		ordenagailuarenTaula = ordenagailua.getTaula();
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
	
	public void jokoaHasieratu(){
		//TODO armamentua hasieratu eta gauza gehiago
		this.ordenagailua.ontziaKokatu();
	}

	public void jokatu(){   //METODO NAGUSIA
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
	
	public void txandaPasa(){
		if (txanda==0){
			txanda=1;
			this.jokatu();
		}else{
			txanda=0;
			this.jokatu();
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
	
	

}
