package ItsaspekoHoria;

import java.util.ArrayList;
import java.util.Iterator;

public class Biltegia {

	// atributuak
	private ArrayList armak;
	private int bonbaKop;
	private int misilKop;
	private int misilZuzenduKop;
	private int radarKop;
	private int ezkutuKop;
	private static Biltegia nBiltegia;

	// eraikitzailea
	public Biltegia() {
		armak = new ArrayList<Arma>();
		this.biltegiaSortu();
		this.bonbaKop = 50; // TODO kopuruak aldatu
		this.misilKop = 50;
		this.misilZuzenduKop = 50;
		this.radarKop = 50;
		this.ezkutuKop = 50;
	}

	// metodoak
	private void biltegiaSortu() {
		for (int i = 1; i == 50; i++) {
			armak.add(new Bonba());
		}
		for (int i = 1; i == 50; i++) {
			armak.add(new Misil());
		}
		for (int i = 1; i == 50; i++) {
			armak.add(new MisilZuzenduaGurutzea());
		}
		for (int i = 1; i == 50; i++) {
			armak.add(new Radar());
		}
		for (int i = 1; i == 50; i++) {
			armak.add(new Ezkutua());
		}
	}

	public static Biltegia getNireBiltegia() {
		if (nBiltegia == null) {
			nBiltegia = new Biltegia();
		}
		return nBiltegia;
	}

	public Iterator<Arma> getIterator() {
		return armak.iterator();
	}

	public Arma armaLortu(String arma) {
		Iterator<Arma> it = this.getIterator();
		boolean topatua = false;
		Arma egungoa = null;
		if (this.armarikDago(arma)) {
			while (it.hasNext() && !topatua) {
				egungoa = it.next();
				if (egungoa instanceof Bonba && arma == "Bonba") {
					topatua = true;
				} else {
					if (egungoa instanceof Misil && arma == "Misil") {
						topatua = true;

					} else {
						if (egungoa instanceof Radar && arma == "Radar") {
							topatua = true;
						} else {
							if (egungoa instanceof MisilZuzenduaGurutzea && arma == "Mizil Zuzendua") {
								topatua = true;
							} else {
								if (egungoa instanceof Ezkutua && arma == "Ezkutua") {
									topatua = true;
								}
							}
						}
					}
				}
			}
		}
		return egungoa;
	}

	public void armaKendu(Arma arma) {
		if (arma instanceof Bonba) {
			bonbaKop--;
		} else {
			if (arma instanceof Misil) {
				misilKop--;
			} else {
				if (arma instanceof MisilZuzenduaGurutzea) {
					misilZuzenduKop--;
				} else {
					if (arma instanceof Radar) {
						radarKop--;
					} else {
						ezkutuKop--;
					}
				}
			}
		}
		armak.remove(arma);
	}

	public boolean armarikDago(String arma) {
		if (arma == "Bonba" && bonbaKop != 0) {
			return true;
		} else {
			if (arma == "Misil" && misilKop != 0) {
				return true;
			} else {
				if (arma == "MisilZuzendua" && misilZuzenduKop != 0) {
					return true;
				} else {
					if (arma == "Radar" && radarKop != 0) {
						return true;
					} else {
						if (arma == "Ezkutua" && ezkutuKop != 0) {
							return true;
						} else {
							return false;
						}
					}
				}
			}
		}
	}

}
