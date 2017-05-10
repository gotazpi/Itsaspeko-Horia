package ItsaspekoHoria;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class ArmaKolekzioa {
	
	//atributuak
	protected int bonbaKop;
	protected int radarKop;
	protected int misilZuzenduNorabideKop;
	protected int ezkutuaKop;
	protected int misilKop;
	protected int misilZuzenduGurutzatuaKop;
	protected ArrayList<Arma> nireArmak;
	
	//eraikitzailea
	public ArmaKolekzioa(){
		
	}
	
	
	public int getRadarKop() {
		return this.radarKop;
	}

	/*public void radarKopKendu() {
		this.radarKop--;
	}*/

	
	
	public boolean armaDago(String arma){
		if (arma.equals("Ezkutua") && this.ezkutuaKop>0){
			return true;
		}else{
			if (arma.equals("Bonba") && this.bonbaKop>0){
				return true;
			}else{
				if (arma.equals("Misil Zuzendua Gurutzea") && this.misilZuzenduGurutzatuaKop>0){
					return true;
				}else{
					if(arma.equals("Misila") && this.misilKop>0){
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
	
	public Arma hartuArma(String arma){  /*Tengo que convertir los armak?????*/
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
						if (arma.equals("Eztukua") && egungoa instanceof Ezkutua){
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
			this.nireArmak.remove(arma);
			this.bonbaKop--;
		}else{
			if (arma instanceof Misil){
				this.nireArmak.remove(arma);
				this.misilKop--;
			}else{
				if (arma instanceof MisilZuzenduaNorabidea){
					this.nireArmak.remove(arma);
					this.misilZuzenduNorabideKop--;
				}else{
					if (arma instanceof Ezkutua){
						this.nireArmak.remove(arma);
						this.ezkutuaKop--;
					}else{
						if (arma instanceof Radar){
						this.nireArmak.remove(arma);
						this.radarKop--;
						}else{
							this.misilZuzenduGurutzatuaKop--;
						}
					}
				}
			}
		}
		nireArmak.remove(arma);
	}
	

}
