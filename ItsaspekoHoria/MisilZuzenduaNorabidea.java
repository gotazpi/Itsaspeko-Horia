package ItsaspekoHoria;

public class MisilZuzenduaNorabidea extends MisilZuzendua{
	
	//ATRIBUTUAK

	//ERAIKITZAILEA
	public MisilZuzenduaNorabidea() {
		super();
		this.kostua=45;
	}

	//METODOAK
	@Override
	public void erabili(Taula etsaiarenTaula, int pX, int pY, int misilZuzenduNorabidea) {	//horizontalean edo bertikalean deseustatzen du
		if (misilZuzenduNorabidea==0){					//0 (bertiKal) eta 1 (horizontal)
			this.bertikaleanSuntsitu(etsaiarenTaula, pX, pY);
		}else{
			if (misilZuzenduNorabidea==1){
				this.horizontaleanSuntsitu(etsaiarenTaula, pX, pY);
			}
		}
	}
	
	

}
