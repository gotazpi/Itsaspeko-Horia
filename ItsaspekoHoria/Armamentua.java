package ItsaspekoHoria;

import java.util.ArrayList;
import java.util.Iterator;



public class Armamentua {

	// atributuak
	private int bonbaKop;
	private int radarKop;
	private int misilZuzenduKop;
	private int ezkutuaKop;
	private int misilKop;
	private ArrayList<Arma> nireArmak;

	// eraikitzailea
	public Armamentua() {
		this.bonbaKop = 3;
		this.radarKop = 3;
		this.misilZuzenduKop = 3;
		this.ezkutuaKop = 1;
		this.misilKop = 4;
		this.nireArmak = new ArrayList<Arma>();
	}

	public int getRadarKop() {
		return this.radarKop;
	}

	public void radarKopKendu() {
		this.radarKop--;
	}

	public void armaGehitu(Arma arma) {
		if (arma instanceof Bonba) {
			bonbaKop++;
			nireArmak.add((Bonba) arma);
		} else {
			if (arma instanceof Misil) {
				misilKop++;
				nireArmak.add((Misil) arma);
			} else {
				if (arma instanceof MisilZuzenduaGurutzea) {
					misilZuzenduKop++;
					nireArmak.add((MisilZuzenduaGurutzea) arma);
				} else {
					if (arma instanceof Radar) {
						radarKop++;
						nireArmak.add((Radar) arma);
					} else {
						ezkutuaKop++;
						nireArmak.add((Ezkutua) arma);
					}
				}
			}
		}
	}
	
	public boolean armaDago(String arma){
		if (arma=="Eskutua" && this.ezkutuaKop>0){
			return true;
		}else{
			if (arma=="Bonba" && this.bonbaKop>0){
				return true;
			}else{
				if (arma=="Misil Zuzendua" && this.misilZuzenduKop>0){
					return true;
				}else{
					if(arma=="Misila" && this.misilKop>0){
						return true;
					}else{
						if (arma=="radar" && this.radarKop>0){
							return true;
						}else{
							return false;
						}
					}
				}
			}
		}
	}
	
	private Iterator<Arma> getIteragorea(){
		return this.nireArmak.iterator();
	}
	
	public Arma hartuArma(String arma){
		Iterator<Arma> it =this.getIteragorea();
		boolean topatua=false;
		Arma egungoa=null;
		while(it.hasNext() && !topatua){
			egungoa=it.next();
			if (arma=="Bonba" && egungoa instanceof Bonba){
				topatua=true;
			}else{
				if (arma=="Misil" && egungoa instanceof Misil){
					topatua=true;
				}else{
					if (arma=="MisilZuzendua" && egungoa instanceof MisilZuzenduaGurutzea){
						topatua=true;
					}else{
						if (arma=="Ezkutua" && egungoa instanceof Ezkutua){
							topatua=true;
						}else{
							if (arma=="Radar" && egungoa instanceof Radar){
								topatua=true;
							}
						}
					}
				}
			}
		}
		return egungoa;
	}
	
	public void armaKendu(Arma arma){
		if (arma instanceof Bonba){
			this.bonbaKop--;
			nireArmak.remove(arma);
		}else{
			if (arma instanceof Misil){
				this.misilKop--;
				nireArmak.remove(arma);
			}else{
				if (arma instanceof MisilZuzenduaGurutzea){
					this.misilZuzenduKop--;
					nireArmak.remove(arma);
				}else{
					if (arma instanceof Ezkutua){
						this.ezkutuaKop--;
						nireArmak.remove(arma);
					}else{
						this.radarKop--;
						nireArmak.remove(arma);
					}
				}
			}
		}
	}

}
