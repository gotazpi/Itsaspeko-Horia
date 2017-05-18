package ItsaspekoHoria;

import java.util.Random;

public class Ordenagailua extends Jokalaria {
	
	//ATRIBUTUAK
	private static Ordenagailua nireOrdenagailua = null;
	private Koordenatuak radarKoordenatua=null;
	

	//ERAIKITZAILEA
	private Ordenagailua() {
		super();
	}
	
	//METODOAK
	public static Ordenagailua getOrdenagailua() {		//ordenagailuaren instantzia lortu
		if (nireOrdenagailua == null) {
			nireOrdenagailua = new Ordenagailua();
		}
		return nireOrdenagailua;
	}

	public String armaAukeratu(){		//ausaz arma bat aukeratu
		Random random = new Random();
		String[] armaAukerak = {"Radar", "Misil", "Misil Zuzendua Gurutzatua", "Misil Zuzendua Norabidea",  "Bonba", "Ezkutua"};
		int aukeraArma = random.nextInt(6);
		return armaAukerak[aukeraArma];
	}
	
	public boolean ordenagailuaTiroEgin(){	//ausaz arma bat aukeratuko da eta arkma hori egikaritu 
		int norabidea=3;
		boolean eginda=false, badu=false;
		int pX=this.posizioaLortu();		//random bidez posizio bat aukeratu
		int pY=this.posizioaLortu();
		Random random=new Random();
		while(!eginda){
			String nahiDuzunArma=this.armaAukeratu();		//random bidez arma aukeratu
			System.out.println(nahiDuzunArma);
			badu=this.armamentua.armaDago(nahiDuzunArma);	//konprobatu aukeratutako arma bere armamentuan dagoen
			if (badu){
				Arma arma=this.armamentua.hartuArma(nahiDuzunArma);
				if (arma instanceof MisilZuzenduaNorabidea){
					norabidea=random.nextInt(2); //0=bertikal 1=horizontal
				}else{
					if (arma instanceof Radar){	
						this.radarKoordenatua=koordenatuakGorde(pX, pY);
					}else{
						if (this.radarKoordenatua!=null && !(arma instanceof Ezkutua)){
							pX=this.radarKoordenatua.getErrenkada();
							pY=this.radarKoordenatua.getZutabea();
							this.radarKoordenatua=null;
						}
					}
				}
				if (arma instanceof Ezkutua){
					Ontzia ontzia = this.flota.ikutuGabekoOntzia();
					if (ontzia!=null){
						Koordenatuak koordenatuak = ontzia.getKoordenatuak();
						pX = koordenatuak.getErrenkada();
						pY = koordenatuak.getZutabea();
						arma.erabili(this.jokalariarenTaula, pX, pY, norabidea);
						this.armamentua.armaKendu(arma);
						eginda=true;
						Jokoa.getJokoa().setMezua("Ordenagailuak bere ontzi bat ezkutatu du.");
					}	
				}else{
					arma.erabili(Erabiltzailea.getErabiltzailea().getTaula(), pX, pY, norabidea);
					this.armamentua.armaKendu(arma);
					eginda = true;
					Jokoa.getJokoa().setMezua("Ordenagailuak " + nahiDuzunArma + " erabili du (" + pX +"," + pY + ") koordenatuan.");
				}
				
			}
		}
		return eginda;
	}
	
	public void ordenagailuaZerEginNahiDu(){	//ausaz aukeratzen da ordenagailuak tiro egin nahi duen, arma 
		Random random = new Random();			//erosi nahi duen edo ontziren bat konpondu nahi duen. Ez da txanda bukatuko tiro egin arte.
		boolean  eginda=false;
		boolean  eginda2=false;
		int i=1;
		while(!eginda2){
			int aukera = random.nextInt(5); // 0,1,2=TIRO EGIN, 3=ARMA EROSI 4=ONTZIA KONPONDU
			if (aukera==0 || aukera==1 || aukera==2){
				if (this.armamentua.armakDaude()){	//bere armamentuan ia armak dauden erabili ahal izateko 
					eginda2=this.ordenagailuaTiroEgin();
					if(eginda2){
						Jokoa.getJokoa().txandaPasa();
					}
				}
			}
			if (aukera==3){   //arma erosi
				while(!eginda && i<=5){ //5 aldiz saiatuko da arma erosten, bestela beste gauza bat egiten saiatuko da
					String aukeratutakoArma=this.armaAukeratu();
					eginda=this.armaErosi(aukeratutakoArma);
					if (eginda){
						Jokoa.getJokoa().setMezua("Ordenagailuak arma bat erosi du");
					}
					i++;
				}
			}
			if (aukera==4){ //ontzia konpondu
				eginda=this.ordenagailuaOntziaKonpondu();
			}	
		}	
	}
	
	
	public boolean ordenagailuaOntziaKonpondu(){		//bere flotako suntsituta dagoen ontzi bat aukeratzen du eta konpondu egiten du
		boolean emaitza=false;
		Ontzia ontziBat = this.flota.suntsitutakoOntziaLortu();
		if (ontziBat!=null){
			Koordenatuak koordenatuak = ontziBat.getKoordenatuak();
			int pX = koordenatuak.getErrenkada();
			int pY = koordenatuak.getZutabea();
			emaitza = this.ontziaKonpondu(pX, pY);
			if (emaitza){
				Jokoa.getJokoa().setMezua("Ordenagailuak suntsituta zuen ontzi bat konpondu du.");
			}
		}
		return emaitza;
	}
	
	public Koordenatuak koordenatuakGorde(int pX, int pY){		//(x,y) koordenatuaren inguruan ontziren bat badago, bere koordenatua 
		Koordenatuak barkuKoordenatuak=null;					//gorde egiten du (radarra erabiltzean)
		boolean topatua=false;
/*1*/	Ontzia ontzia = Erabiltzailea.getErabiltzailea().getTaula().getOntzia(pX, pY);
		if (ontzia!=null){
			if (!ontzia.ikutua(pX, pY)){
				barkuKoordenatuak=new Koordenatuak(pX, pY);
				topatua=true;
			}
		}
		if (pX>0 && pY>0){
	/*2*/	ontzia = Erabiltzailea.getErabiltzailea().getTaula().getOntzia(pX-1, pY-1);
			if (!topatua && ontzia!=null){
				if (!ontzia.ikutua(pX-1, pY-1)){
					barkuKoordenatuak=new Koordenatuak(pX-1, pY-1);
					topatua=true;
				}
			}
		}
		if (pX>0){
	/*3*/	ontzia = Erabiltzailea.getErabiltzailea().getTaula().getOntzia(pX-1, pY);
			if (!topatua && ontzia!=null){
				if (!ontzia.ikutua(pX-1, pY)){
					barkuKoordenatuak=new Koordenatuak(pX-1, pY);
					topatua=true;
				}
			}
		}
		if (pX>0 && pY<9){
	/*4*/	ontzia = Erabiltzailea.getErabiltzailea().getTaula().getOntzia(pX-1, pY+1);
			if (pX>0 && pY<9 && !topatua && ontzia!=null){
				if (!ontzia.ikutua(pX-1, pY+1)){
					barkuKoordenatuak=new Koordenatuak(pX-1, pY+1);
					topatua=true;
				}
			}
		}
		if (pY>0){
	/*5*/	ontzia = Erabiltzailea.getErabiltzailea().getTaula().getOntzia(pX, pY-1);
			if (!topatua && ontzia!=null){
				if (!ontzia.ikutua(pX, pY-1)){
					barkuKoordenatuak=new Koordenatuak(pX, pY-1);
					topatua=true;
				}
			}
		}
		if (pY<9){
	/*6*/	ontzia = Erabiltzailea.getErabiltzailea().getTaula().getOntzia(pX, pY+1);
			if (pY<9 && !topatua && ontzia!=null){
				if (!ontzia.ikutua(pX, pY+1)){
					barkuKoordenatuak=new Koordenatuak(pX, pY+1);
					topatua=true;
				}
			}
		}
		if (pX<9 && pY>0){
/*7*/	ontzia = Erabiltzailea.getErabiltzailea().getTaula().getOntzia(pX+1, pY-1);
			if (!topatua && ontzia!=null){
				if (!ontzia.ikutua(pX+1, pY-1)){
					barkuKoordenatuak=new Koordenatuak(pX+1, pY-1);
					topatua=true;
				}
			}
		}
		if (pX<9){
	/*8*/	ontzia = Erabiltzailea.getErabiltzailea().getTaula().getOntzia(pX+1, pY);
			if (!topatua && ontzia!=null){
				if (!ontzia.ikutua(pX+1, pY)){
					barkuKoordenatuak=new Koordenatuak(pX+1, pY);
					topatua=true;
				}
			}
		}
		if (pX<9 && pY<9){
	/*9*/	ontzia = Erabiltzailea.getErabiltzailea().getTaula().getOntzia(pX+1, pY+1);
			if (!topatua && ontzia!=null){
				if (!ontzia.ikutua(pX+1, pY+1)){
					barkuKoordenatuak=new Koordenatuak(pX+1, pY+1);
					topatua=true;
				}
			}
		}
		return barkuKoordenatuak;
	}

	public void ontziaKokatu() {	//ordenagailuaren flota guztia taulan kokatzen du
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

	/*public void ontziaEzkutatu() {
		int x = this.posizioaLortu();
		int y = this.posizioaLortu();
		if (jokalariarenTaula.ontziaDago(x, y)) {
			jokalariarenTaula.getOntzia(x, y).ezkutatu();
		}
	}*/

	public int posizioaLortu() {		//x eta y ren balioak ausaz lortzeko 
		Random random = new Random();
		int balioa = random.nextInt(10);
		return balioa;
	}

	public int norabideaLortu() {		//ausaz norabide bat aukeratzen du
		Random random = new Random();
		int balioa = random.nextInt(4);
		return balioa;
	}

	/*public void lortuOntzia() {
		Ontzia ontziBat = this.flota.suntsitutakoOntziaLortu();
		if (ontziBat != null) {
			Koordenatuak koordenatuak = ontziBat.getKoordenatuak();
			this.ontziaKonpondu(koordenatuak.getErrenkada(), koordenatuak.getZutabea());
		
		// Bere flotan ez dago barku bat suntsituta dagoenik, beraz ez da
		// ontziaKonponduMetodoa egikarituko
	}*/

	/*public boolean radarra() {
		if (this.armamentua.getRadarKop() != 0) {
			//int x = this.posizioaLortu();
			//int y = this.posizioaLortu();
			//Erabiltzailea.getErabiltzailea().getTaula().radarKontsultatu(x, y);
			this.armamentua.radarKopKendu();
			return true;
		}
		return false;
	}*/

}
