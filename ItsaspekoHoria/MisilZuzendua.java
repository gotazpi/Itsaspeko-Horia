package ItsaspekoHoria;

public abstract class MisilZuzendua extends Arma{
	
	//ATRIBUTUAK

	//ERAIKITZAILEA
	public MisilZuzendua() {
		super(0);
	}

	//METODOAK
	public void horizontaleanSuntsitu(Taula etsaiarenTaula, int pX, int pY){	//horizontalean errenkada guztia deseustatzen du
		pY=0;
		while(pY<=9){
			if (etsaiarenTaula.getOntzia(pX, pY)!=null){
				if (etsaiarenTaula.getOntzia(pX, pY).getEgoera() instanceof Ezkutatuta){	//ezkutua badago, apurtu egiten du
					etsaiarenTaula.getOntzia(pX, pY).egoeraAldatu(new IkutuGabe());
				}else{
					etsaiarenTaula.getOntzia(pX, pY).ikutu(pX, pY);
					if (etsaiarenTaula.getOntzia(pX, pY).koodenadaGuztiakIkututa()){
						etsaiarenTaula.getOntzia(pX, pY).egoeraAldatu(new Suntsituta());
					}
				}
			}
			
			pY++;
		}
	}
		
		public void bertikaleanSuntsitu(Taula etsaiarenTaula, int pX, int pY){	//bertikalean zutabe guztia deseustatzen du
		pX=0;
		while(pX<=9){
			if (etsaiarenTaula.getOntzia(pX, pY)!=null){
				if (etsaiarenTaula.getOntzia(pX, pY).getEgoera() instanceof Ezkutatuta){	//ezkutua badago, apurtu egiten du
					etsaiarenTaula.getOntzia(pX, pY).egoeraAldatu(new IkutuGabe());
				}else{
					etsaiarenTaula.getOntzia(pX, pY).ikutu(pX, pY);
					if (etsaiarenTaula.getOntzia(pX, pY).koodenadaGuztiakIkututa()){
						etsaiarenTaula.getOntzia(pX, pY).egoeraAldatu(new Suntsituta());
					}
				}
				
			}
			pX++;
		}
	}
}
