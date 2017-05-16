package ItsaspekoHoria;

public class Taula {
	
	//ATRIBUTUAK
	private Laukia[][] taulaMatrizea;

	//ERAIKITZAILEA
	public Taula() {
		taulaMatrizea = new Laukia[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				taulaMatrizea[i][j] = new Laukia(i, j);
			}
		}
	}

	//METODOAK
	public Ontzia getOntzia(int x, int y) {
		return taulaMatrizea[x][y].getOntzia();
	}

	public boolean ontziaDago(int x, int y) {
		return (taulaMatrizea[x][y].getEgoera() instanceof OntziaDago);
	}


	//ONTZI BAT TAULAN KOKATZEKO (1)
	public boolean ontziOsoaKokatu(Ontzia ontzia, int x, int y, int norabidea) {
		int luzera = ontzia.getLuzera();
		boolean kokatua = false;
		if (lekuaDago(luzera, x, y, norabidea)) {
			kokatua = true;
			if (norabidea == 0) {
				for (int i = 0; i < luzera; i++) {
					ontziaKokatu(ontzia, x, y - i);
					ontzia.koordenatuakJarri(x, y - i, i);
				}
			}
			;
			if (norabidea == 1) {
				for (int i = 0; i < luzera; i++) {
					ontziaKokatu(ontzia, x + i, y);
					ontzia.koordenatuakJarri(x + i, y, i);
				}
			}
			;
			if (norabidea == 2) {
				for (int i = 0; i < luzera; i++) {
					ontziaKokatu(ontzia, x, y + i);
					ontzia.koordenatuakJarri(x, y + i, i);
				}
			}
			;
			if (norabidea == 3) {
				for (int i = 0; i < luzera; i++) {
					ontziaKokatu(ontzia, x - i, y);
					ontzia.koordenatuakJarri(x - i, y, i);
				}
			}
		}
		return kokatua;
	}
		

	//ONTZI BAT TAULAN KOKATZEKO (2)	
	public boolean lekuaDago(int luzera, int x, int y, int norabidea) { //Konprobatzeko ia ontzia kokatu nahi den tokian barkurik ez badago
																		//eta barkurik ez badauka ingurunean
		// 0(gora) 1(behera) 2(eskuma) 3(ezkerra)
		
		boolean libre = true;
		if (norabidea == 0) {
			if (luzera - 1 > y)
				libre = false;
			for (int i = 0; i < luzera && libre; i++) {
				libre = libreDago(x, y - i);
			}
		}
		if (norabidea == 1) {
			if (luzera + x > 10)
				libre = false;
			for (int i = 0; i < luzera && libre; i++) {
				libre = libreDago(x + i, y);
			}
		}
		if (norabidea == 2) {
			if (luzera + y > 10)
				libre = false;
			for (int i = 0; i < luzera && libre; i++) {
				libre = libreDago(x, y + i);
			}
		}
		if (norabidea == 3) {
			if (luzera - 1 > x)
				libre = false;
			for (int i = 0; i < luzera && libre; i++) {
				libre = libreDago(x - i, y);
			}
		}
		return libre;
	}

	//ONTZI BAT TAULAN KOKATZEKO (3)
	public boolean libreDago(int x, int y) {		//Konprobatzen du ia laukia ura den 
		if (taulaMatrizea[x][y].getEgoera() instanceof Ura) {
			return true;
		} else {
			return false;
		}
	}
	
	//ONTZI BAT TAULAN KOKATZEKO (4)
	public void ontziaKokatu(Ontzia ontzia, int x, int y) {
		ipiniOntzia(x, y, ontzia);
		inguruaAldatu(x, y);
	}
	
	
	
	//ONTZI BAT TAULAN KOKATZEKO (5)
	public void ipiniOntzia(int x, int y, Ontzia pOntzia) {		//lauki bakoitzari ontzia esleitzen dio eta egoera aldatzen du
		taulaMatrizea[x][y].setOntzia(pOntzia);
		taulaMatrizea[x][y].egoeraAldatu(new OntziaDago());
	}
	
	//ONTZI BAT TAULAN KOKATZEKO (6)
	public void inguruaAldatu(int x, int y) {
		if (x > 0 && y > 0 && taulaMatrizea[x - 1][y - 1].getEgoera() instanceof Ura)
			taulaMatrizea[x - 1][y - 1].egoeraAldatu(new BarkuaHurbil());
		if (x > 0 && taulaMatrizea[x - 1][y].getEgoera() instanceof Ura)
			taulaMatrizea[x - 1][y].egoeraAldatu(new BarkuaHurbil());
		if (x > 0 && y < 9 && taulaMatrizea[x - 1][y + 1].getEgoera() instanceof Ura)
			taulaMatrizea[x - 1][y + 1].egoeraAldatu(new BarkuaHurbil());
		if (y > 0 && taulaMatrizea[x][y - 1].getEgoera() instanceof Ura)
			taulaMatrizea[x][y - 1].egoeraAldatu(new BarkuaHurbil());
		if (y < 9 && taulaMatrizea[x][y + 1].getEgoera() instanceof Ura)
			taulaMatrizea[x][y + 1].egoeraAldatu(new BarkuaHurbil());
		if (x < 9 && y > 0 && taulaMatrizea[x + 1][y - 1].getEgoera() instanceof Ura)
			taulaMatrizea[x + 1][y - 1].egoeraAldatu(new BarkuaHurbil());
		if (x < 9 && taulaMatrizea[x + 1][y].getEgoera() instanceof Ura)
			taulaMatrizea[x + 1][y].egoeraAldatu(new BarkuaHurbil());
		if (x < 9 && y < 9 && taulaMatrizea[x + 1][y + 1].getEgoera() instanceof Ura)
			taulaMatrizea[x + 1][y + 1].egoeraAldatu(new BarkuaHurbil());
	}

}
