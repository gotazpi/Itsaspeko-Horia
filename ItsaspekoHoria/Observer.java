package ItsaspekoHoria;

import Grafika.Denda;
import Grafika.Leihoa;

public class Observer {
	    public static void main(String args[]){
	        Denda observado = new Denda();
	        Jokoa observado2 = Jokoa.getJokoa();
	        Leihoa observador = Leihoa.getLeihoa();
	        
	        observado.addObserver(observador);
	        observado2.addObserver(observador);
	        
	       // observado.cambiarMensaje("Cambio 1");
	       // observado.cambiarMensaje("Cambio 2");
	       // observado.cambiarMensaje("Cambio 3");
	 }
	 
}
