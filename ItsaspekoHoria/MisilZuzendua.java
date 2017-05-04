package ItsaspekoHoria;

public class MisilZuzendua extends Arma {
	// atributuak

	// eraikitzailea
	public MisilZuzendua() {
		super(45);
	}

	// metodoak
	@Override
	public void erabili(Taula etsaiarenTaula, int pX, int pY) {
		// TODO nola jakin zenbat aliz erabili den misilZuzendua?????
		//1.aldia bada, horizontalean, 2.aldia bada bertikalean eta gainontzekoak horizontalean eta bertikalean

	}
	
	public void horizontaleanSuntsitu(Taula etsaiarenTaula, int pX, int pY){
		while(pX>=0){
			if (etsaiarenTaula.getOntzia(pX, pY)!=null){
				etsaiarenTaula.getOntzia(pX, pY).egoeraAldatu(new Suntsituta());
			}
			pX--;
		}
		while(pX<=9){
			if (etsaiarenTaula.getOntzia(pX, pY)!=null){
				etsaiarenTaula.getOntzia(pX, pY).egoeraAldatu(new Suntsituta());
			}
			pX++;
		}
	}
	
	public void bertikaleanSuntsitu(Taula etsaiarenTaula, int pX, int pY){
		while(pY>=0){
			if (etsaiarenTaula.getOntzia(pX, pY)!=null){
				etsaiarenTaula.getOntzia(pX, pY).egoeraAldatu(new Suntsituta());
			}
			pY--;
		}
		while(pY<=9){
			if (etsaiarenTaula.getOntzia(pX, pY)!=null){
				etsaiarenTaula.getOntzia(pX, pY).egoeraAldatu(new Suntsituta());
			}
			pY++;
		}
	}
}
