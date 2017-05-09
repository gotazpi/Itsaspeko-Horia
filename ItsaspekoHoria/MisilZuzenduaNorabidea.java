package ItsaspekoHoria;

public class MisilZuzenduaNorabidea extends MisilZuzendua{

	public MisilZuzenduaNorabidea() {
		super();
		this.kostua=35;
	}

	@Override
	public void erabili(Taula etsaiarenTaula, int pX, int pY, int misilZuzenduNorabidea) {
		if (misilZuzenduNorabidea==0){								//0 en bertical y 1 en horizontal
			this.bertikaleanSuntsitu(etsaiarenTaula, pX, pY);
		}else{
			if (misilZuzenduNorabidea==1){
				this.horizontaleanSuntsitu(etsaiarenTaula, pX, pY);
			}
		}
	}
	
	

}
