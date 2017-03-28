package ItsaspekoHoria;

public class Erabiltzailea extends Jokalaria{
	//atributuak
	private static Erabiltzailea nireErabiltzailea;
	//eraikitzailea
	private Erabiltzailea(){
		super();
	}
	
	//metodoak

	public static Erabiltzailea getErabiltzailea(){
		if (nireErabiltzailea==null){
			nireErabiltzailea = new Erabiltzailea();
		}
		return nireErabiltzailea;
	}
	
	public void ontziaKokatu(int pLerroa, int pZutabea,int pNorantza, Ontzia pOntzia){
		jokalariFlota.ontziOsoaKokatu(pOntzia, pLerroa, pZutabea, pNorantza);
	}
	
	public void ontziaEzkutatu(int pLerroa, int pZutabea){
		if (jokalariFlota.ontziaDago(pLerroa, pZutabea)){
			jokalariFlota.getOntzia(pLerroa, pZutabea).ezkutatu();
		}
		else System.out.println("Ez dago ontzirik");
	}

}
