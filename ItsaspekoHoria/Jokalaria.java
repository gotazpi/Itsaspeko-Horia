package ItsaspekoHoria;


public abstract class Jokalaria {
	
	//atributuak
	protected Taula jokalariarenTaula;
	protected Taula etsaiarenTaula;
	protected Armamentua armamentua;
	protected Flota flota;
	protected int dirua;
	
	//eraikitzailea
	public Jokalaria (){
		this.armamentua= new Armamentua();
		this.jokalariarenTaula = new Taula();
		this.etsaiarenTaula = new Taula();
		this.flota=new Flota();
		dirua=100;
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
		return this.jokalariarenTaula;
	}
	
	public Flota getFlota(){
		return this.flota;
	}
	
	
	
	public void radarraJarri(int x, int y){
		etsaiarenTaula.radarKontsultatu(x, y);
	}
}
