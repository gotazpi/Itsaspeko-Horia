package ItsaspekoHoria;

import java.util.Random;

public class Ordenagailua extends Jokalaria {
	// atributuak
	private static Ordenagailua nireOrdenagailua = null;

	// eraikitzailea
	private Ordenagailua() {
		super();
	}
	
	public String armaAukeratu(){
		Random random = new Random();
		String[] armaAukerak = {"Radar", "Misil", "Misil Zuzendua", "Bonba", "Ezkutua"};
		int aukeraArma = random.nextInt(4);
		return armaAukerak[aukeraArma];
	}
	
	public void ordenagailuaZerEginNahiDu(){
		Arma arma=null;
		Random random = new Random();
		boolean topatua=false, eginda=false;
		while(!eginda){
			int aukera = random.nextInt(3); /* 0=TIRO EGIN, 1=ARMA EROSI 2=BARKUA KONPUNDU*/
			if (aukera==0){
				if (this.armamentua.armakDaude()){
					eginda=true;
					int pX=this.posizioaLortu();
					int pY=this.posizioaLortu();
					while(!topatua){
						String nahiDuzunArma = this.armaAukeratu(); 
						boolean badu = this.armamentua.armaDago(nahiDuzunArma);
						if (badu){
							topatua=true;
							arma = this.armamentua.hartuArma(nahiDuzunArma);
							this.armamentua.armaKendu(arma);
							arma.erabili(this.etsaiarenTaula, pX, pY);
						}
					}
				}
			}else{
				if (aukera==1){
					Biltegia nBiltegia= Biltegia.getNireBiltegia();
					while(!topatua){
						if (nBiltegia.armakDaude() && this.dirua>0){
							String nahiDugunArma=this.armaAukeratu();
							if (nBiltegia.armarikDago(nahiDugunArma)){
								arma=nBiltegia.armaLortu(arma);
							}
						}
					}
				}
			}
		}
	}

	public static Ordenagailua getOrdenagailua() {
		if (nireOrdenagailua == null) {
			nireOrdenagailua = new Ordenagailua();
		}
		return nireOrdenagailua;
	}

	// metodoak

	public void ontziaKokatu() {
		int i = 0;
		while (i < 10) {
			int x = this.posizioaLortu();
			int y = this.posizioaLortu();
			int norabidea = this.norabideaLortu();
			Ontzia ontzia = Ordenagailua.getOrdenagailua().getFlota().getOntzia(i);
			if (Ordenagailua.getOrdenagailua().getTaula().ontziOsoaKokatu(ontzia, x, y, norabidea)) {
				Ordenagailua.getOrdenagailua().getFlota().hurrengoa();
				i++;
			}
		}
	}

	public void ontziaEzkutatu() {
		int x = this.posizioaLortu();
		int y = this.posizioaLortu();
		if (jokalariarenTaula.ontziaDago(x, y)) {
			jokalariarenTaula.getOntzia(x, y).ezkutatu();
		}
	}

	public int posizioaLortu() {
		Random random = new Random();
		int balioa = random.nextInt(10);
		return balioa;
	}

	public int norabideaLortu() {
		Random random = new Random();
		int balioa = random.nextInt(4);
		return balioa;
	}

	public void lortuOntzia() {
		Ontzia ontziBat = this.flota.suntsitutakoOntziaLortu();
		if (ontziBat != null) {
			this.ontziaKonpondu(ontziBat);
		}
		// Bere flotan ez dago barku bat suntsituta dagoenik, beraz ez da
		// ontziaKonponduMetodoa egikarituko
	}

	public void radarra() {
		if (this.armamentua.getRadarKop() != 0) {
			int x = this.posizioaLortu();
			int y = this.posizioaLortu();
			etsaiarenTaula.radarKontsultatu(x, y);
		}
		this.armamentua.radarKopKendu();
	}
}
