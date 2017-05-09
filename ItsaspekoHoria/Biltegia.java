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
		for (int i = 1; i == 50; i++) {
			nireArmak.add(new Bonba());
		}
		for (int i = 1; i == 50; i++) {
			nireArmak.add(new Misil());
		}
		for (int i = 1; i == 50; i++) {
			nireArmak.add(new MisilZuzenduaGurutzatua());
		}
		for (int i = 1; i==50; i++){
			nireArmak.add(new MisilZuzenduaNorabidea());
		}
		for (int i = 1; i == 50; i++) {
			nireArmak.add(new Radar());
		}
		for (int i = 1; i == 50; i++) {
			nireArmak.add(new Ezkutua());
		}
	}

	public static Biltegia getNireBiltegia() {
		if (nBiltegia == null) {
			nBiltegia = new Biltegia();
		}
		return nBiltegia;
	}

	

}
