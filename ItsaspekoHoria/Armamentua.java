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
		for (int i = 1; i == 20; i++) {
			nireArmak.add(new Bonba());
		}
		for (int i = 1; i == 10; i++) {
			nireArmak.add(new Misil());
		}
		for (int i = 1; i == 2; i++) {
			nireArmak.add(new MisilZuzenduaGurutzatua());
		}
		for (int i = 1; i==5; i++){
			nireArmak.add(new MisilZuzenduaNorabidea());
		}
		for (int i = 1; i == 5; i++) {
			nireArmak.add(new Radar());
		}
		for (int i = 1; i == 3; i++) {
			nireArmak.add(new Ezkutua());
		}
	}
	
	public void armaGehitu(Arma arma) {
		if (arma instanceof Bonba) {
			bonbaKop++;
			nireArmak.add((Bonba) arma);
		} else {
			if (arma instanceof Misil) {
				misilKop++;
				nireArmak.add((Misil) arma);
			} else {
				if (arma instanceof MisilZuzendua) {
					MisilZuzendua misilZuzendua = (MisilZuzendua) arma;
					if (misilZuzendua instanceof MisilZuzenduaGurutzatua){
						misilZuzenduGurutzatuaKop++;
						nireArmak.add((MisilZuzenduaGurutzatua) arma);
					}else{
						misilZuzenduNorabideKop++;
						nireArmak.add((MisilZuzenduaNorabidea) arma);
					}
				}else {
					if (arma instanceof Radar) {
						radarKop++;
						nireArmak.add((Radar) arma);
					} else {
						ezkutuaKop++;
						nireArmak.add((Ezkutua) arma);
					}
				}
			}
		}
	}

	

}
