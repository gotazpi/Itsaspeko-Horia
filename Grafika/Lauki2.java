package Grafika;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import ItsaspekoHoria.*;

public class Lauki2 extends JButton implements MouseListener {

private int i,j;
	
	public Lauki2(int pI, int pJ){
		this.i=pI;
		this.j=pJ;
		this.addMouseListener(this);
	}
	
	public void aldatuIrudia(){
		this.setBackground(java.awt.Color.black);
		//this.setIcon(new ImageIcon("Irudiak/descarga.jpg"));
		this.validate();
		this.repaint();
		Leihoa.getLeihoa().refresh();
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
		int norabidea = Erabiltzailea.getErabiltzailea().getFlota().getNorabidea();
		int zein = Erabiltzailea.getErabiltzailea().getFlota().getZein();
		if (zein<=9){
			Ontzia ontzia = Erabiltzailea.getErabiltzailea().getFlota().getOntzia(zein);
			if(Erabiltzailea.getErabiltzailea().getTaula().ontziOsoaKokatu(ontzia, i, j, norabidea)){
				Erabiltzailea.getErabiltzailea().getFlota().hurrengoa();
				this.aldatuIrudia();
			};
		}
		
		}
		/*if (Jokalaria.getJokalaria().getTaula().lekuaDago(Jokalaria.getJokalaria().getFlota().getOntzia(Jokalaria.getJokalaria().getTaula().ontziKop()).getLuzera(), i, j, 1)){
			this.aldatuIrudia();
			if (Jokalaria.getJokalaria().getFlota().getOntzia(Jokalaria.getJokalaria().getTaula().ontziKop()).getLuzera()==2){
				Leihoa.getLeihoa().getLaukia2(i+1, j).aldatuIrudia();
			}
			if (Jokalaria.getJokalaria().getFlota().getOntzia(Jokalaria.getJokalaria().getTaula().ontziKop()).getLuzera()==3){
				Leihoa.getLeihoa().getLaukia2(i+1, j).aldatuIrudia();
				Leihoa.getLeihoa().getLaukia2(i+2, j).aldatuIrudia();
			}
			if (Jokalaria.getJokalaria().getFlota().getOntzia(Jokalaria.getJokalaria().getTaula().ontziKop()).getLuzera()==4){
				Leihoa.getLeihoa().getLaukia2(i+1, j).aldatuIrudia();
				Leihoa.getLeihoa().getLaukia2(i+2, j).aldatuIrudia();
				Leihoa.getLeihoa().getLaukia2(i+3, j).aldatuIrudia();
			}
			Jokalaria.getJokalaria().getTaula().ontziOsoaKokatu(Jokalaria.getJokalaria().getFlota().getOntzia(Jokalaria.getJokalaria().getTaula().ontziKop()), i, j, 1);
		}*/
	}

