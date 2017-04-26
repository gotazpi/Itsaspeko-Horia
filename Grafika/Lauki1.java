package Grafika;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import ItsaspekoHoria.Erabiltzailea;
import ItsaspekoHoria.Ontzia;
import ItsaspekoHoria.Ordenagailua;

public class Lauki1 extends JButton implements MouseListener {

private int i,j;
	
	public Lauki1(int pI, int pJ){
		this.i=pI;
		this.j=pJ;
		this.addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		
		if(!Ordenagailua.getOrdenagailua().getTaula().ontziaDago(i,j)){
			this.aldatuIrudiaUrdina();
			//txanda pasa
		};
		if(Ordenagailua.getOrdenagailua().getTaula().ontziaDago(i,j)){
			this.aldatuIrudiaGorria();
		};
}
	public void aldatuIrudiaGorria(){
		this.setBackground(java.awt.Color.red);
		//this.setIcon(new ImageIcon("Irudiak/descarga.jpg"));
		this.validate();
		this.repaint();
		Leihoa.getLeihoa().refresh();}
	
	public void aldatuIrudiaUrdina(){
		this.setBackground(java.awt.Color.blue);
		//this.setIcon(new ImageIcon("Irudiak/descarga.jpg"));
		this.validate();
		this.repaint();
		Leihoa.getLeihoa().refresh();}
	
}