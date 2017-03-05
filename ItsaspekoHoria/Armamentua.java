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
	public Armamentua(int pBonbaKop, int pRadarKop, int pMisilZuzenduKop, int pEzkutuaKop, int pMisilKop){
		this.bonbaKop=pBonbaKop;
		this.radarKop=pRadarKop;
		this.misilZuzenduKop=pMisilZuzenduKop;
		this.ezkutuaKop=pEzkutuaKop;
		this.misilKop=pMisilKop;
		this.nireArmak=new ArrayList<Arma>();
	}

}
