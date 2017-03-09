package ItsaspekoHoria;

import java.util.ArrayList;

public class Biltegia {
	
	//atributuak
	private ArrayList armak;
	private int bonbaKop;
	private int misilKop;
	private int misilZuzenduKop;
	private int radarKop;
	private int ezkutuKop;
	
	//eraikitzailea
	public Biltegia(){
		armak=new ArrayList<Arma>();
		this.biltegiaSortu();
		this.bonbaKop=50;				//TODO kopuruak aldatu
		this.misilKop=50;
		this.misilZuzenduKop=50;
		this.radarKop=50;
		this.ezkutuKop=50;
	}
	//metodoak
	private void biltegiaSortu(){
		for (int i=1; i==50; i++){
			armak.add(new Bonba());
		}
		for (int i=1; i==50; i++){
			armak.add(new Misil());
		}
		for (int i=1; i==50; i++){
			armak.add(new MisilZuzendua());
		}
		for (int i=1; i==50; i++){
			armak.add(new Radar());
		}
		for (int i=1; i==50; i++){
			armak.add(new Ezkutua());
		}
	}
}
