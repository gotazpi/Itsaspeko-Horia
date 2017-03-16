package ItsaspekoHoria;

import java.util.ArrayList;

public class Taula {
	//atributuak
	private Laukia[][] taulaMatrizea; 
	private int ontziKop;
	private int kont;
	
	//eraikitzailea
	public Taula(){
		ontziKop=0;
		kont=0;
		taulaMatrizea = new Laukia[10][10];
		for (int i=0; i<10; i++){
			for (int j=0; j<10; j++){
				taulaMatrizea[i][j]= new Laukia (i,j);
			}	
		}	
	}
	
	public Ontzia getOntzia(int x, int y){
		return taulaMatrizea[x][y].getOntzia();
	}
	public boolean OntziaDago(int x, int y){
		System.out.println(taulaMatrizea!=null);
		System.out.println(kont);
		return taulaMatrizea[x][y].getOntziaDago();
	}
	
	public boolean libreDago(int x, int y){
        if (!taulaMatrizea[x][y].getOntziaDago() && !taulaMatrizea[x][y].getBarkuaHurbil()){
       	 return true;
        }else{
       	 return false;
        }       
   }
   
   public boolean lekuaDago (int luzera, int x, int y, int norabidea){//0() 1(beherantz) 2() 3()
   	boolean libre=true;
	if (norabidea==0){
		if(luzera-1>y)libre=false;
   		for(int i=0; i<luzera&&libre; i++){
   			libre=!taulaMatrizea[x][y-i].getOntziaDago()&&!taulaMatrizea[x][y-i].getBarkuaHurbil();
   		}
   	};
   	if (norabidea==1){
   		if(luzera+x>10)libre=false;
   		for(int i=0; i<luzera&&libre; i++){
   			libre=!taulaMatrizea[x+i][y].getOntziaDago()&&!taulaMatrizea[x+i][y].getBarkuaHurbil();
   		}
   	};
   	if (norabidea==2){
   		if(luzera+y>10)libre=false;
   		for(int i=0; i<luzera&&libre; i++){
   			libre=!taulaMatrizea[x][y+i].getOntziaDago()&&!taulaMatrizea[x][y+i].getBarkuaHurbil();
   		}
   	};
   	if (norabidea==3){
   		if(luzera-1>x)libre=false;
   		for(int i=0; i<luzera&&libre; i++){
   			libre=!taulaMatrizea[x-i][y].getOntziaDago()&&!taulaMatrizea[x-i][y].getBarkuaHurbil();
   		}
   	};
   	return libre;
   }

   public void inguruaAldatu(int x, int y){
	   if (x>0&&y>0)taulaMatrizea[x-1][y-1].setBarkuaHurbil();
	   if (x>0)taulaMatrizea[x-1][y].setBarkuaHurbil();	   
	   if (x>0&&y<9)taulaMatrizea[x-1][y+1].setBarkuaHurbil();
	   if (y>0)taulaMatrizea[x][y-1].setBarkuaHurbil();
	   if (y<9)taulaMatrizea[x][y+1].setBarkuaHurbil();
	   if (x<9&&y>0)taulaMatrizea[x+1][y-1].setBarkuaHurbil();
	   if (x<9)taulaMatrizea[x+1][y].setBarkuaHurbil();
	   if (x<9&&y<9)taulaMatrizea[x+1][y+1].setBarkuaHurbil();
   }
   
   public void ipiniOntzia(int x, int y, Ontzia pOntzia){
	   taulaMatrizea[x][y].setOntzia(pOntzia);
	   taulaMatrizea[x][y].setOntziaDago();
	   System.out.print(y + " ");
	   System.out.println(x);

   	}    	
   
   public void ontziaKokatu(Ontzia ontzia, int x, int y){
  			ipiniOntzia(x, y, ontzia);
  			inguruaAldatu(x, y);
   }
   
   public boolean ontziOsoaKokatu(Ontzia ontzia, int x, int y, int norabidea){
	   int luzera = ontzia.getLuzera();
	   boolean kokatua = false;
	   if (lekuaDago(luzera, x, y, norabidea)){
		   kokatua=true;
		   if (norabidea==0){
		   		for(int i=0; i<luzera; i++){
		   			ontziaKokatu(ontzia, x, y-i);
		   		}
		   	};
		   	if (norabidea==1){
		   		for(int i=0; i<luzera; i++){
		   			ontziaKokatu(ontzia, x+i, y);
		   		}
		   	};
		   	if (norabidea==2){
		   		for(int i=0; i<luzera; i++){
		   			ontziaKokatu(ontzia, x, y+i);
		   		}
		   	};
		   	if (norabidea==3){
		   		for(int i=0; i<luzera; i++){
		   			ontziaKokatu(ontzia, x-i, y);
		   		}
		   	}
	   }
	   return kokatua;
   }}
