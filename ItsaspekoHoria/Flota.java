package ItsaspekoHoria;

public class Flota {

	// atributuak

	private int zein;
	private int norabidea;
	private Ontzia[] ontziak;

	// eraikitzailea
	public Flota() {
		ontziak = new Ontzia[10];
		this.hasieratuFlota();
		zein = 0;
		norabidea = 0;
	}

	// metodoak
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

	public Ontzia getOntzia(int i) {
		return this.ontziak[i];
	}

	public int getZein() {
		return zein;
	}

	public void hurrengoa() {
		zein++;
	}

	public Ontzia suntsitutakoOntziaLortu(){
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
}
