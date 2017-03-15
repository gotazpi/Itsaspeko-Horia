package ItsaspekoHoria;

import java.util.ArrayList;
import java.util.Iterator;

public class Flota {
	
	//atributuak

	private float dirua;
	private Ontzia[] ontziak;
	
	//eraikitzailea
	public Flota (){
		this.dirua=130;
		ontziak=new Ontzia[10];
		this.hasieratuFlota();
	}
	
	//metodoak
	private void hasieratuFlota(){
		ontziak[0]=(new HegazkinOntzia());
		ontziak[1]=(new Itsaspekoa());
		ontziak[2]=(new Itsaspekoa());
		ontziak[3]=(new Suntsitzailea());
		ontziak[4]=(new Suntsitzailea());
		ontziak[5]=(new Suntsitzailea());
		ontziak[6]=(new Fragata());
		ontziak[7]=(new Fragata());
		ontziak[8]=(new Fragata());
		ontziak[9]=(new Fragata());	
	}
	
	public int getOntziKop(){
		return this.ontziak.length;
	}
	public Ontzia getOntzia(int i){
		return this.ontziak[i];
	}
}
