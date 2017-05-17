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
		int aukeraArma = random.nextInt(5);
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
			badu=this.armamentua.armaDago(nahiDuzunArma);	//konprobatu aukeratutako arma bere armamentuan dagoen
			if (badu){
				Arma arma=this.armamentua.hartuArma(nahiDuzunArma);
				this.armamentua.armaKendu(arma);
				if (arma instanceof MisilZuzenduaNorabidea){
					norabidea=random.nextInt(1); //0=bertikal 1=horizontal
				}else{
					if (arma instanceof Radar){	
						this.radarKoordenatua=koordenatuakGorde(pX, pY);
					}else{
						if (this.radarKoordenatua!=null && !(arma instanceof Ezkutua)){
							pX=this.radarKoordenatua.getErrenkada();
							pY=this.radarKoordenatua.getZutabea();
						}
					}
					if (arma instanceof Ezkutua){
						Ontzia ontzia = this.jokalariarenTaula.getOntzia(pX, pY);
						if (!ontzia.laukirenBatIkututa()){
							arma.erabili(this.jokalariarenTaula, pX, pY, norabidea);
							eginda=true;
						}
					}else{
						arma.erabili(etsaiarenTaula, pX, pY, norabidea);
						eginda = true;
					}
				}
			}
		}
		return eginda;
	}
	
	public void ordenagailuaZerEginNahiDu(){	//ausaz aukeratzen da ordenagailuak tiro egin nahi duen, arma 
		Random random = new Random();			//erosi nahi duen edo ontziren bat konpondu nahi duen
		boolean  eginda=false;
		int i=1;
		while(!eginda){
			int aukera = random.nextInt(3); /* 0=TIRO EGIN, 1=ARMA EROSI 2=ONTZIA KONPUNDU*/
			if (aukera==0){
				if (this.armamentua.armakDaude()){	//bere armamentuan ia armak dauden erabili ahal izateko 
					eginda=this.ordenagailuaTiroEgin();
				}
			}else{
				if (aukera==1){   //arma erosi
					while(!eginda && i<=5){ //5 aldiz saiatuko da arma erosten, bestela beste gauza bat egiten saiatuko da
						String aukeratutakoArma=this.armaAukeratu();
						eginda=this.armaErosi(aukeratutakoArma);
						i++;
					}
				}else{ //aukera=2 bada
					eginda=this.ordenagailuaOntziaKonpondu();
				}
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
		}
		return emaitza;
	}
	
	public Koordenatuak koordenatuakGorde(int pX, int pY){		//(x,y) koordenatuaren inguruan ontziren bat badago, bere koordenatua 
		Koordenatuak barkuKoordenatuak=null;					//gorde egiten du (radarra erabiltzean)
		boolean topatua=false;
		int i=0;
		while(!topatua && i<9){
			if (this.etsaiarenTaula.getOntzia(pX, pY)!=null){
				if (this.etsaiarenTaula.getOntzia(pX, pY).getEgoera() instanceof IkutuGabe){
					barkuKoordenatuak=new Koordenatuak(pX, pY);
					topatua=true;
				}
			}else{
				if (pX>0&&pY>0&&etsaiarenTaula.getOntzia(pX-1,pY-1)!=null){
					if (this.etsaiarenTaula.getOntzia(pX-1, pY-1).getEgoera() instanceof IkutuGabe){
						barkuKoordenatuak= new Koordenatuak(pX-1, pY-1);
						topatua=true;
					}
				}else{
					if (pX>0&&etsaiarenTaula.getOntzia(pX-1,pY)!=null){
						if (this.etsaiarenTaula.getOntzia(pX-1, pY).getEgoera() instanceof IkutuGabe){
							barkuKoordenatuak=new Koordenatuak(pX-1, pY);
							topatua=true;
						}
					}else{
						if (pX>0&&pY<9&&etsaiarenTaula.getOntzia(pX-1,pY+1)!=null){
							if (this.etsaiarenTaula.getOntzia(pX-1, pY+1).getEgoera() instanceof IkutuGabe){
								barkuKoordenatuak=new Koordenatuak(pX-1, pY+1);
								topatua=true;
							}
						}else{
							if (pY>0&&etsaiarenTaula.getOntzia(pX,pY-1)!=null){
								if (this.etsaiarenTaula.getOntzia(pX, pY-1).getEgoera() instanceof IkutuGabe){
									barkuKoordenatuak=new Koordenatuak(pX, pY-1);
									topatua=true;
								}
							}else{
								if (pY<9&&etsaiarenTaula.getOntzia(pX,pY+1)!=null){
									if (this.etsaiarenTaula.getOntzia(pX, pY+1).getEgoera() instanceof IkutuGabe){
										barkuKoordenatuak=new Koordenatuak(pX, pY+1);
										topatua=true;
									}
								}else{
									if(pX<9&&pY>0&&etsaiarenTaula.getOntzia(pX+1,pY-1)!=null){
										if (this.etsaiarenTaula.getOntzia(pX+1, pY-1).getEgoera() instanceof IkutuGabe){
											barkuKoordenatuak=new Koordenatuak(pX+1, pY-1);
											topatua=true;
										}
									}else{
										if (pX<9&&etsaiarenTaula.getOntzia(pX+1,pY)!=null){
											if (this.etsaiarenTaula.getOntzia(pX+1, pY).getEgoera() instanceof IkutuGabe){
												barkuKoordenatuak=new Koordenatuak(pX+1, pY);
												topatua=true;
											}
										}else{
											if (pX<9&&pY<9&&etsaiarenTaula.getOntzia(pX+1,pY+1)!=null){
												if (this.etsaiarenTaula.getOntzia(pX+1, pY+1).getEgoera() instanceof IkutuGabe){
													barkuKoordenatuak=new Koordenatuak(pX+1, pY+1);
													topatua=true;
												}
											}
										}
									}
								}
							}
						}
					}
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
			//etsaiarenTaula.radarKontsultatu(x, y);
			this.armamentua.radarKopKendu();
			return true;
		}
		return false;
	}*/

}
