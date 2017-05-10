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
		String[] armaAukerak = {"Radar", "Misil", "Misil Zuzendua Gurutzatua", "Misil Zuzendua Norabidea",  "Bonba", "Ezkutua"};
		int aukeraArma = random.nextInt(5);
		return armaAukerak[aukeraArma];
	}
	
	public void ordenagailuaZerEginNahiDu(){
		Arma arma=null;
		Random random = new Random();
		int norabidea=3; // misil zuzendu norabidea erabiltzen ez bada, 3 zenbakia joango da erabili() metodoan azken parametro bezala
		boolean topatua=false, eginda=false;
		boolean ondoErosiDa=false;
		while(!eginda){
			int aukera = random.nextInt(3); /* 0=TIRO EGIN, 1=ARMA EROSI 2=BARKUA KONPUNDU*/
			if (aukera==0){
				if (this.armamentua.armakDaude()){
					int pX=this.posizioaLortu();
					int pY=this.posizioaLortu();
					while(!topatua){
						String nahiDuzunArma = this.armaAukeratu(); 
						boolean badu = this.armamentua.armaDago(nahiDuzunArma);
						if (badu){
							topatua=true;
							eginda=true;
							arma = this.armamentua.hartuArma(nahiDuzunArma);
							this.armamentua.armaKendu(arma);
							if (arma instanceof MisilZuzenduaNorabidea){
								norabidea=random.nextInt(1); //0=bertikal 1=horizontal
							}
							arma.erabili(this.etsaiarenTaula, pX, pY, norabidea);
						}
					}
				}
			}else{
				if (aukera==1){
					Biltegia nBiltegia= Biltegia.getNireBiltegia();  //arma erosi
					if (nBiltegia.armakDaude() && this.dirua>0){
						int i=1;
						while(!topatua&& i<=5){//bost aldiz saiatuko da bestela aterako da eta beste gauza bat egiten saiatuko da
							String nahiDugunArma=this.armaAukeratu();
							ondoErosiDa=this.armaErosi(nahiDugunArma);
							if (ondoErosiDa){
								topatua=true;
								eginda=true;
							}
							i++;
						}
					}
				}else{ //aukera=2 bada
					Ontzia ontziBat=this.flota.suntsitutakoOntziaLortu(); //ontzi bat aukeratzen du
					if (ontziBat!=null){
						ondoErosiDa=this.ontziaKonpondu(ontziBat);
						if (ondoErosiDa){
							eginda=true;
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

	public boolean radarra() {
		if (this.armamentua.getRadarKop() != 0) {
			//int x = this.posizioaLortu();
			//int y = this.posizioaLortu();
			//etsaiarenTaula.radarKontsultatu(x, y);
			this.armamentua.radarKopKendu();
			return true;
		}
		return false;
	}
}
