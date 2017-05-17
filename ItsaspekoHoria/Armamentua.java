package ItsaspekoHoria;

import java.util.ArrayList;

public class Armamentua extends ArmaKolekzioa{

	//ATRIBUTUAK
	

	//ERAIKITZAILEA
	public Armamentua() {
		this.bonbaKop = 20;
		this.radarKop = 5;
		this.misilZuzenduNorabideKop = 5;
		this.misilZuzenduGurutzatuaKop=3;
		this.ezkutuaKop = 3;
		this.misilKop = 10;
		this.nireArmak = new ArrayList<Arma>();
		this.armamentuaBete();
	}
	
	//METODOAK
	private void armamentuaBete(){ 		
			nireArmak.add(new Bonba());
			nireArmak.add(new Misil());
			nireArmak.add(new MisilZuzenduaGurutzatua());
			nireArmak.add(new MisilZuzenduaNorabidea());
			nireArmak.add(new Radar());
			nireArmak.add(new Ezkutua());
	}
	
	public void armaGehitu(Arma arma) {		//arma bat kolekzioan gehitzen du, bere kopurua handituz
		if (arma instanceof Bonba) {
			bonbaKop++;
		} 
		else if (arma instanceof Misil) {
			misilKop++;
		} 
		
		else if (arma instanceof MisilZuzenduaGurutzatua){
			misilZuzenduGurutzatuaKop++;
		}
		else if (arma instanceof MisilZuzenduaNorabidea){
		    misilZuzenduNorabideKop++;
		}
		else if (arma instanceof Radar) {
		    radarKop++;
		} 
		else if(arma instanceof Ezkutua){
			ezkutuaKop++;
		}			
		}
	}

	


