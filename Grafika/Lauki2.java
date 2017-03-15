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
		System.out.println(i);
		System.out.println(j);
		if (Jokalaria.getJokalaria().getTaula().libreDago(i, j)){
			this.aldatuIrudia();
			Jokalaria.getJokalaria().getTaula().ipiniOntzia(i, j, Jokalaria.getJokalaria().getFlota().getOntzia(Jokalaria.getJokalaria().getTaula().ontziKop()));
		}
	}
}
