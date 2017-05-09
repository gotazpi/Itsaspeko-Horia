package ItsaspekoHoria;

public abstract class MisilZuzendua extends Arma{

	public MisilZuzendua() {
		super(0);
	}

	public void horizontaleanSuntsitu(Taula etsaiarenTaula, int pX, int pY){
		pY=0;
		while(pY<=9){
			if (etsaiarenTaula.getOntzia(pX, pY)!=null){
				etsaiarenTaula.getOntzia(pX, pY).ikutu(pX, pY);
			}
			pY++;
		}
	}
	
	public void bertikaleanSuntsitu(Taula etsaiarenTaula, int pX, int pY){
		pX=0;
		while(pX<=9){
			if (etsaiarenTaula.getOntzia(pX, pY)!=null){
				etsaiarenTaula.getOntzia(pX, pY).ikutu(pX, pY);
			}
			pX++;
		}
	}
}
