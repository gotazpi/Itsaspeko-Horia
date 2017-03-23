package ItsaspekoHoria;

import java.util.Observable;

public class Jokoa{
	
	private static Jokoa nireJokoa;
	private Taula erabiltzailearenTaula;
	private Taula ordenagailuarenTaula;
	
	private Jokoa(){
		super();
	}
	
	public static Jokoa getJokoa(){
		if (nireJokoa==null){
			nireJokoa=new Jokoa();
		}
		return nireJokoa;
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
