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
	
	public void ontziaKokatu(){
		int i=0;
		while(i<10){
			int x=this.posizioaLortu();
			int y=this.posizioaLortu();
			int norabidea=this.norabideaLortu();
			Ontzia ontzia = Ordenagailua.getOrdenagailua().getFlota().getOntzia(i);
			if(Ordenagailua.getOrdenagailua().getTaula().ontziOsoaKokatu(ontzia, x, y, norabidea)){
				Ordenagailua.getOrdenagailua().getFlota().hurrengoa();
				 i++;
			}
		}
	}
	public void ontziaEzkutatu(){
		int x=this.posizioaLortu();
		int y=this.posizioaLortu();
		if (jokalariarenTaula.ontziaDago(x,y)){
			jokalariarenTaula.getOntzia(x,y).ezkutatu();
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
	
	
	public void lortuOntzia(){
		Ontzia ontziBat= this.flota.suntsitutakoOntziaLortu();
		if (ontziBat!=null){
			this.ontziaKonpondu(ontziBat);
		}
		//Bere flotan ez dago barku bat suntsituta dagoenik, beraz ez da ontziaKonponduMetodoa egikarituko
	}
	
	
	
	public void radarra(){
		if (this.armamentua.getRadarKop()!=0){
			int x = this.posizioaLortu();
			int y = this.posizioaLortu();
			etsaiarenTaula.radarKontsultatu(x, y);
		}
		this.armamentua.radarKopKendu();
	}
}
