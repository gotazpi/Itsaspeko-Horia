package ItsaspekoHoria;

public class Flota {

	//ATRIBUTUAK

	private int zein;
	private int norabidea;
	private Ontzia[] ontziak;

	//ERAIKITZAILEA
	public Flota() {
		ontziak = new Ontzia[10];
		this.hasieratuFlota();
		zein = 0;
		norabidea = 0;
	}

	//METODOAK
	private void hasieratuFlota() {
		ontziak[0] = (new HegazkinOntzia());
		ontziak[1] = (new Itsaspekoa());
		ontziak[2] = (new Itsaspekoa());
		ontziak[3] = (new Suntsitzailea());
		ontziak[4] = (new Suntsitzailea());
		ontziak[5] = (new Suntsitzailea());
		ontziak[6] = (new Fragata());
		ontziak[7] = (new Fragata());
		ontziak[8] = (new Fragata());
		ontziak[9] = (new Fragata());
	}

	public void setNorabidea(int pNorabidea) {
		norabidea = pNorabidea;
	}

	public int getNorabidea() {
		return norabidea;
	}

	public int getOntziKop() {
		return this.ontziak.length;
	}

	public Ontzia getOntzia(int i) {	//i. posizioan dagoen ontzia bueltatzen du
		return this.ontziak[i];
	}

	public int getZein() {
		return zein;
	}

	public void hurrengoa() {
		zein++;
	}

	public Ontzia suntsitutakoOntziaLortu(){		//flotako suntsituta dagoen lehenengo ontzia itzultzen du
		int i=0;
		boolean topatua=false;
		while(i<=9 && !topatua){
			if (ontziak[i].getEgoera() instanceof Suntsituta){
				topatua=true;
			}else{
				i++;
			}
		}
		if (i == 10) {
			return null; // bere flotan ez badago barku bat ere ez suntsituta
							// dagoena null itzuliko du
		} else {
			return ontziak[i]; // Suntsituta dagoen barkua
		}
	}
	
	public void ontziaSuntsitu(int i){				//TEST-A PROBATZEKO BAKARRIK!!!
		ontziak[i].egoeraAldatu(new Suntsituta());
	}
	
	public boolean flotaUrperatuta(){	//konprobatzen du flotaren ontzi guztiak suntsituta dauden edo ez
		boolean emaitza = true;
		int i=0;
		while ((emaitza)&&(i<ontziak.length)){
			if (!ontziak[i].koodenadaGuztiakIkututa()){
				emaitza=false;
			}
			i++;
		}
		return emaitza;
	}
	
	public Ontzia ikutuGabekoOntzia(){
		int i = 0;
		Ontzia emaitza=null;
		boolean topatua=false;
		while ((i<ontziak.length) && !(topatua)){
			if (!ontziak[i].laukirenBatIkututa()){
				topatua=true;
				emaitza=ontziak[i];
			}
			i++;
		}
		return emaitza;
	}
}
