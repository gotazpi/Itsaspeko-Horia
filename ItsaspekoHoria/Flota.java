package ItsaspekoHoria;

import java.util.ArrayList;

public class Flota {
	
	//atributuak

	private float dirua=130;
	private ArrayList<Ontzia> flota;
	
	//eraikitzailea
	public Flota (float pDirua){
		this.dirua=pDirua;
		flota=new ArrayList<Ontzia>();
		this.hasieratuFlota();
	}
	
	//metodoak
	private void hasieratuFlota(){
		flota.add(new HegazkinOntzia());
		flota.add(new Itsaspekoa());
		flota.add(new Itsaspekoa());
		flota.add(new Suntsitzailea());
		flota.add(new Suntsitzailea());
		flota.add(new Suntsitzailea());
		flota.add(new Fragata());
		flota.add(new Fragata());
		flota.add(new Fragata());
		flota.add(new Fragata());	
	}
	

}
