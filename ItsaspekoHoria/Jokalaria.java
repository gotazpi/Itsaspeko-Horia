package ItsaspekoHoria;


public abstract class Jokalaria {
	
	//atributuak
	protected Taula jokalariFlota;
	protected Taula etsaiarenFlota;
	protected Armamentua armamentua;
	protected Flota flota;
	
	//eraikitzailea
	public Jokalaria (){
		this.armamentua= new Armamentua();
		this.jokalariFlota = new Taula();
		this.etsaiarenFlota = new Taula();
		this.flota=new Flota();
	}
	
	//metodoak

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
	
	public Taula getTaula(){
		return this.jokalariFlota;
	}
	
	public Flota getFlota(){
		return this.flota;
	}
	
	
}
