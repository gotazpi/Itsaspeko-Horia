package ItsaspekoHoria;

import java.util.ArrayList;
import java.util.Iterator;



public class Armamentua extends ArmaKolekzioa{

	// atributuak
	

	// eraikitzailea
	public Armamentua() {
		this.bonbaKop = 20;
		this.radarKop = 5;
		this.misilZuzenduNorabideKop = 5; //aldatzeko
		this.misilZuzenduGurutzatuaKop=3;	//aldatzeko
		this.ezkutuaKop = 3;
		this.misilKop = 10;
		this.nireArmak = new ArrayList<Arma>();
		this.armamentuaBete();
	}
	
	private void armamentuaBete(){  //balio hauek alda daitezke.		
			nireArmak.add(new Bonba());
			nireArmak.add(new Misil());
			nireArmak.add(new MisilZuzenduaGurutzatua());
			nireArmak.add(new MisilZuzenduaNorabidea());
			nireArmak.add(new Radar());
			nireArmak.add(new Ezkutua());
	}
	
	public void armaGehitu(Arma arma) {
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

	


