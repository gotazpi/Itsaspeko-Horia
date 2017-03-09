package ItsaspekoHoria;

import java.util.Scanner;

public class Jokalaria {
	
	//atributuak
	private Taula jokalariFlota;
	private Taula etsaiarenFlota;
	private Armamentua armamentua;
	private Flota flota;
	
	//eraikitzailea
	public Jokalaria (){
		this.armamentua= new Armamentua();
		this.jokalariFlota = new Taula();
		this.etsaiarenFlota = new Taula();
		this.flota=new Flota();
	}
	
	//metodoak
	

	public void flotaKokatu (){
		int pLerroa=0;
		int pZutabea=0;
		for (int i=0; i==this.flota.getOntziKop();i++){
			this.ontziaKokatu(pLerroa, pZutabea, this.flota.getOntzia(i));
		}
		
	}
	
	public void ontziaKokatu(int pLerroa, int pZutabea, Ontzia pOntzia){
		
	}
	

}
