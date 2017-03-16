package Grafika;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
		int norabidea = Jokalaria.getJokalaria().getFlota().getNorabidea();
		int zein = Jokalaria.getJokalaria().getFlota().getZein();
		Ontzia ontzia = Jokalaria.getJokalaria().getFlota().getOntzia(zein);
		if(Jokalaria.getJokalaria().getTaula().ontziOsoaKokatu(ontzia, i, j, norabidea)){
			Jokalaria.getJokalaria().getFlota().urrengoa();
			this.aldatuIrudia();
		};
		
		
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

