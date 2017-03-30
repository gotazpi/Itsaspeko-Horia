package ItsaspekoHoria;

import java.util.Observable;

import Grafika.*;



public class Jokoa{
	
	private static Jokoa nireJokoa;
	private static Taula erabiltzailearenTaula;
	private static Taula ordenagailuarenTaula;
	private static Ordenagailua ordenagailua;
	private static Erabiltzailea erabiltzailea;
	
	private Jokoa(){
		super();
	}
	
	public static Jokoa getJokoa(){
		if (nireJokoa==null){
			nireJokoa=new Jokoa();
		}
		return nireJokoa;
	}
	
	public static void main (String[] args){
		ordenagailua = Ordenagailua.getOrdenagailua();
		erabiltzailea = Erabiltzailea.getErabiltzailea();
		erabiltzailearenTaula = erabiltzailea.getTaula();
		ordenagailuarenTaula = ordenagailua.getTaula();
		Leihoa.getLeihoa().hasiera();
	}
	
	public boolean irabazi(){
		//TODO
		return false;
	}
	
	public boolean galdu(){
		//TODO
		return false;
	}

}
