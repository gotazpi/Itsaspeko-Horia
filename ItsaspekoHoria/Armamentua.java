package ItsaspekoHoria;

import java.util.ArrayList;

public class Armamentua {

	// atributuak
	private int bonbaKop;
	private int radarKop;
	private int misilZuzenduKop;
	private int ezkutuaKop;
	private int misilKop;
	private ArrayList<Arma> nireArmak;

	// eraikitzailea
	public Armamentua() {
		this.bonbaKop = 3;
		this.radarKop = 3;
		this.misilZuzenduKop = 3;
		this.ezkutuaKop = 1;
		this.misilKop = 4;
		this.nireArmak = new ArrayList<Arma>();
	}

	public int getRadarKop() {
		return this.radarKop;
	}

	public void radarKopKendu() {
		this.radarKop--;
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
					misilZuzenduKop++;
					nireArmak.add((MisilZuzendua) arma);
				} else {
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
