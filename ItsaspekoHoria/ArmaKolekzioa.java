package ItsaspekoHoria;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class ArmaKolekzioa {
	
	//ATRIBUTUAK
	protected int bonbaKop;
	protected int radarKop;
	protected int misilZuzenduNorabideKop;
	protected int ezkutuaKop;
	protected int misilKop;
	protected int misilZuzenduGurutzatuaKop;
	protected ArrayList<Arma> nireArmak;
	
	//ERAIKITZAILEA
	public ArmaKolekzioa(){
		
	}
	
	//METODOAK
	public int getRadarKop(){
		return radarKop;
	}
	
	public int bonbaKop(){
		return bonbaKop;
	}
	
	public int misilKop(){
		return misilKop;
	}
	
	public int ezkutuaKop(){
		return ezkutuaKop;
	}
	
	public int misilZuzenduNorabideKop(){
		return misilZuzenduNorabideKop;
	}
	
	public int misilZuzenduGurutzatuaKop(){
		return misilZuzenduGurutzatuaKop;
	}
	
	public boolean armaDago(String arma){
		if (arma.equals("Ezkutua") && this.ezkutuaKop>0){
			return true;
		}else{
			if (arma.equals("Bonba") && this.bonbaKop>0){
				return true;
			}else{
				if (arma.equals("Misil Zuzendua Gurutzatua") && this.misilZuzenduGurutzatuaKop>0){
					return true;
				}else{
					if(arma.equals("Misil") && this.misilKop>0){
						return true;
					}else{
						if (arma.equals("Radar") && this.radarKop>0){
							return true;
						}else{
							if (arma.equals("Misil Zuzendua Norabidea") && this.misilZuzenduNorabideKop>0){
								return true;
							}else{
							return false;
							}
						}
					}
				}
			}
		}
	}
	
	protected Iterator<Arma> getIterator(){
		return this.nireArmak.iterator();
	}
	
	public Arma hartuArma(String arma){ 
		Iterator<Arma> it =this.getIterator();
		boolean topatua=false;
		Arma egungoa=null;
		while(it.hasNext() && !topatua){
			egungoa=it.next();
			if (arma.equals("Bonba") && egungoa instanceof Bonba){
				topatua=true;
			}else{
				if (arma.equals("Misil") && egungoa instanceof Misil){
					topatua=true;
				}else{
					if (arma.equals("Misil Zuzendua Gurutzatua") &&  egungoa instanceof MisilZuzenduaGurutzatua ){
						topatua=true;
					}else{
						if (arma.equals("Ezkutua") && egungoa instanceof Ezkutua){
							topatua=true;
						}else{
							if (arma.equals("Radar") && egungoa instanceof Radar){
								topatua=true;
							}else{
								if (arma.equals("Misil Zuzendua Norabidea") && egungoa instanceof MisilZuzenduaNorabidea){
									topatua=true;
								}
							}
						}
					}
				}
			}
		}
		return egungoa;
	}
	
	public boolean armakDaude(){
		if (bonbaKop==0 && misilKop==0 && radarKop==0 && ezkutuaKop==0 && misilZuzenduGurutzatuaKop==0 && misilZuzenduNorabideKop==0){
			return false;
		}else{
			return true;
		}
	}
	
	public void armaKendu(Arma arma){
		if (arma instanceof Bonba){
			this.bonbaKop--;
		}
		else if (arma instanceof Misil){
			this.misilKop--;
		}
		else if (arma instanceof MisilZuzenduaNorabidea){
			this.misilZuzenduNorabideKop--;
		}
		else if (arma instanceof Ezkutua){				
			this.ezkutuaKop--;
		}
		else if (arma instanceof Radar){
			this.radarKop--;
		}
		else{this.misilZuzenduGurutzatuaKop--;}				
	}
	

}
