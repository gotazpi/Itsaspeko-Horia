package ItsaspekoHoria;

public class Radar extends Arma {
	// atribituak
	private static int erradioa = 1;

	// eraikitzailea
	public Radar() {
		super(25);
	}

	/*
	 * <<<<<<< HEAD
	 * 
	 * @Override public void erabili(Taula etsaiarenTaula, int pX, int pY){ if
	 * (etsaiarenTaula.getOntzia(pX-1,pY-1).getEgoera() instanceof OntziaDago)etsaiarenTaula[pX][pY].koloreAldatu(); 
	 * if (pX>0&&pY>0&&etsaiarenTaula.getOntzia(pX-1,pY-1).getEgoera() instanceof OntziaDago)etsaiarenTaula[pX-1][pY-1].koloreAldatu(); 
	 * if (pX>0&&etsaiarenTaula[pX-1][pY].getEgoera() instanceof OntziaDago)etsaiarenTaula[pX-1][pY].koloreAldatu();
	 * 
	 * //metodoak public void erabili(Taula etsaiarenTaula, int pX, int pY){ if
	 * (etsaiarenTaula.getOntzia(pX-1,pY-1).getEgoera() instanceof
	 * OntziaDago)etsaiarenTaula.[pX][pY].koloreAldatu(); if
	 * (pX>0&&pY>0&&etsaiarenTaula.getOntzia(pX-1,pY-1).getEgoera() instanceof
	 * OntziaDago)etsaiarenTaula[pX-1][pY-1].koloreAldatu(); if
	 * (pX>0&&etsaiarenTaula.getOntzia(pX-1,pY).getEgoera() instanceof
	 * OntziaDago)etsaiarenTaula[pX-1][pY].koloreAldatu(); >>>>>>>
	 * 39ebbdb3f66b42881315827cbe27f0e7231915d3 if
	 * (pX>0&&pY<9&&etsaiarenTaula.getOntzia(pX-1,pY+1).getEgoera() instanceof
	 * OntziaDago)etsaiarenTaula[pX-1][pY+1].koloreAldatu(); if
	 * (pY>0&&etsaiarenTaula.getOntzia(pX,pY-1).getEgoera() instanceof
	 * OntziaDago)etsaiarenTaula[pX][pY-1].koloreAldatu(); if
	 * (pY<9&&etsaiarenTaula.getOntzia(pX,pY+1).getEgoera() instanceof
	 * OntziaDago)etsaiarenTaula[pX][pY+1].koloreAldatu(); if
	 * (pX<9&&pY>0&&etsaiarenTaula.getOntzia(pX+1,pY-1).getEgoera() instanceof
	 * OntziaDago)etsaiarenTaula[pX+1][pY-1].koloreAldatu(); if
	 * (pX<9&&etsaiarenTaula.getOntzia(pX+1,pY).getEgoera() instanceof
	 * OntziaDago)etsaiarenTaula[pX+1][pY].koloreAldatu(); if
	 * (pX<9&&pY<9&&etsaiarenTaula.getOntzia(pX+1,pY+1).getEgoera() instanceof
	 * OntziaDago)etsaiarenTaula[pX+1][pY+1].koloreAldatu();
	 */
	@Override
	public void erabili(Taula etsailarenTaula, int pX, int pY, int misilZuzendua) {
		// TODO Auto-generated method stub
	}
}
