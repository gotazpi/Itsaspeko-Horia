package ItsaspekoHoria;

import java.util.ArrayList;
import java.util.Iterator;

public class Biltegia extends ArmaKolekzioa{

	// atributuak
	private static Biltegia nBiltegia=null;

	// eraikitzailea
	private Biltegia() {
		nireArmak = new ArrayList<Arma>();
		this.biltegiaSortu();
		this.bonbaKop = 50; // TODO kopuruak aldatu
		this.misilKop = 50;
		this.misilZuzenduNorabideKop = 50;
		this.radarKop = 50;
		this.ezkutuaKop = 50;
		this.misilZuzenduGurutzatuaKop=50;
	}

	// metodoak
	private void biltegiaSortu() {
			nireArmak.add(new Bonba());
    		nireArmak.add(new Misil());
			nireArmak.add(new MisilZuzenduaGurutzatua());		
			nireArmak.add(new MisilZuzenduaNorabidea());
			nireArmak.add(new Radar());	
			nireArmak.add(new Ezkutua());		
	}

	public static Biltegia getNireBiltegia() {
		if (nBiltegia == null) {
			nBiltegia = new Biltegia();
		}
		return nBiltegia;
	}

}
