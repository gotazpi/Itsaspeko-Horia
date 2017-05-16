package ItsaspekoHoria;

public abstract class MisilZuzendua extends Arma{

	public MisilZuzendua() {
		super(0);
	}

	public void horizontaleanSuntsitu(Taula etsaiarenTaula, int pX, int pY){
		pY=0;
		while(pY<=9){
			if (etsaiarenTaula.getOntzia(pX, pY)!=null){
				if (etsaiarenTaula.getOntzia(pX, pY).getEgoera() instanceof Ezkutatuta){
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
	
	public void bertikaleanSuntsitu(Taula etsaiarenTaula, int pX, int pY){
		pX=0;
		while(pX<=9){
			if (etsaiarenTaula.getOntzia(pX, pY)!=null){
				if (etsaiarenTaula.getOntzia(pX, pY).getEgoera() instanceof Ezkutatuta){
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
