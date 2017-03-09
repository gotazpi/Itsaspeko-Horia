package ItsaspekoHoria;

public class Ordenagailua {
	//ATRIBUTUAK
	private Taula jokalariFlota;
	private Taula etsaiarenFlota;
	private Armamentua armamentua;
	private Flota flota;
	
	//eraikitzailea
	public Ordenagailua (){
		this.armamentua= new Armamentua();
		this.jokalariFlota = new Taula();
		this.etsaiarenFlota = new Taula();
		this.flota=new Flota();
		}
	
	//metodoak
	public boolean OntziaEzkutatu(int pLerroa, int pZutabea){
		if jokalariFlota.OntziaDago(){
			return jokalariFlota.getOntzia(pLerroa, pZutabea).ezkutatu();
		}
	}
	
}
