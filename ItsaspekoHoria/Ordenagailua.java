package ItsaspekoHoria;

import java.util.Random;

public class Ordenagailua extends Jokalaria{
	//atributuak
	private static Ordenagailua nireOrdenagailua = null;
	
	//eraikitzailea
	private Ordenagailua (){
		super();
	}
	
	public static Ordenagailua getOrdenagailua(){
		if (nireOrdenagailua==null){
			nireOrdenagailua = new Ordenagailua();
		}
		return nireOrdenagailua;
	}
	
	//metodoak
	
	public void ontziaKokatu(Ontzia pOntzia){
		int zein=0;
		while(zein<10){
			int x=this.posizioaLortu();
			int y=this.posizioaLortu();
			int norabidea=this.norabideaLortu();
			Ontzia ontzia = Ordenagailua.getOrdenagailua().getFlota().getOntzia(zein);
			if(Ordenagailua.getOrdenagailua().getTaula().ontziOsoaKokatu(ontzia, x, y, norabidea)){
				Erabiltzailea.getErabiltzailea().getFlota().hurrengoa();
			}
		}
	}
	public void ontziaEzkutatu(){
		int x=this.posizioaLortu();
		int y=this.posizioaLortu();
		if (jokalariFlota.ontziaDago(x,y)){
			jokalariFlota.getOntzia(x,y).ezkutatu();
		}
	}
	
	public int posizioaLortu(){
		Random random = new Random() ;
		int balioa = random.nextInt(10);
		return balioa;
	}
	
	public int norabideaLortu(){
		Random random = new Random() ;
		int balioa = random.nextInt(4);
		return balioa;
	}	
	
	public void radarra(){
		if (this.armamentua.getRadarKop()!=0){
			int x = this.posizioaLortu();
			int y = this.posizioaLortu();
			etsaiarenFlota.radarKontsultatu(x, y);
		}
		this.armamentua.radarKopKendu();
	}
}
