package ItsaspekoHoria;

import java.util.Iterator;
import java.util.Scanner;

public class Jokalaria {
	
	//atributuak
	private static Jokalaria nireJokalaria;
	private Taula jokalariFlota;
	private Taula etsaiarenFlota;
	private Armamentua armamentua;
	private Flota flota;
	
	//eraikitzailea
	private Jokalaria (){
		this.armamentua= new Armamentua();
		this.jokalariFlota = new Taula();
		this.etsaiarenFlota = new Taula();
		this.flota=new Flota();
	}
	
	//metodoak
	
	public static Jokalaria getJokalaria(){
		if (nireJokalaria==null){
			nireJokalaria= new Jokalaria();
		}
		return nireJokalaria;
	}
	

/*	public void flotaKokatu (){ // el metodo esta mal, no se usa iterador
		for (int i=0; i<this.flota.getOntziKop();i++){
			this.jokalariFlota.ontziOsoaKokatu( this.flota.getOntzia(i), pLerroa, pZutabea, pNorantza);
		}
		int luzera;
		Laukia variableLaukia;
		Scanner entrada=new Scanner(System.in);
		System.out.println("HegazkinOntzia kokatu mesedez");
		variableLaukia = entrada.getClass();
		
	}
	*/
	
	public void ontziaKokatu(int pLerroa, int pZutabea,int pNorantza, Ontzia pOntzia){
		jokalariFlota.ontziOsoaKokatu(pOntzia, pLerroa, pZutabea, pNorantza);
	}
	public void OntziaEzkutatu(int pLerroa, int pZutabea){
		if (jokalariFlota.OntziaDago(pLerroa, pZutabea)){
			jokalariFlota.getOntzia(pLerroa, pZutabea).ezkutatu();
		}
		else System.out.println("Ez dago ontzirik");
	}
	
	public Taula getTaula(){
		return this.jokalariFlota;
	}
	
	public Flota getFlota(){
		return this.flota;
	}

}
