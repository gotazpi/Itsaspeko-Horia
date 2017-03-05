package ItsaspekoHoria;

import java.util.ArrayList;

public class Taula {
	//atributuak
	private Laukia taulaMatrizea[][]; 
	
	//eraikitzailea
	public Taula(){
		Laukia taulaMatrizea[][] = new Laukia[10][10];
		for (int i=0; i<10; i++){
			for (int j=0; j<10; j++){
				taulaMatrizea[i][j]= new Laukia (false);
			}	
		}	
	}
	
	//metodoak
}
