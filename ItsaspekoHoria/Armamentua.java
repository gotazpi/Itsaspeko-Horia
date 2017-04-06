package ItsaspekoHoria;

import java.util.ArrayList;

public class Armamentua {
	
	//atributuak
	private int bonbaKop;
	private int radarKop;
	private int misilZuzenduKop;
	private int ezkutuaKop;
	private int misilKop ;
	private ArrayList<Arma> nireArmak;
	
	//eraikitzailea
	public Armamentua(){
		this.bonbaKop=3;
		this.radarKop=3;
		this.misilZuzenduKop=3;
		this.ezkutuaKop=1;
		this.misilKop=4;
		this.nireArmak=new ArrayList<Arma>();
	}
	
	public int getRadarKop(){
		return this.radarKop;
	}

	public void radarKopKendu(){
		this.radarKop--;
	}
}
