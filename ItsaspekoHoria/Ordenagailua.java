package ItsaspekoHoria;

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
	
	/*public void ontziaEzkutatu(int pLerroa, int pZutabea){
		if (jokalariFlota.OntziaDago(pLerroa, pZutabea)){
			jokalariFlota.getOntzia(pLerroa, pZutabea).ezkutatu();
		}
		else System.out.println("Ez dago ontzirik");
	}*/
	
	public void ontziaKokatu(){
		//TODO
	}
	public void ontziaEzkutatu(){
		//TODO
	}
}
