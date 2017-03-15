package Grafika;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import Grafika.Lauki1;
import ItsaspekoHoria.*;


public class Leihoa extends JFrame {

	private JPanel contentPane;
	private Lauki1[][] matrix1;
	private Lauki2[][] matrix2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Leihoa frame = new Leihoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Leihoa() {
		
		this.matrix1=new Lauki1[10][10];
		this.matrix2=new Lauki2[10][10];
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		contentPane.add(panel1, BorderLayout.EAST);
		contentPane.add(panel2, BorderLayout.WEST);
		panel1.setLayout(new GridLayout(10, 10, 0, 0));
		panel2.setLayout(new GridLayout(10, 10, 0, 0));
		
		Lauki1 pLauki1=null;
		for(int lerro=0; lerro<10; lerro++){
			for(int zutabe=0; zutabe<10; zutabe++){
				pLauki1 = new Lauki1(lerro,zutabe);
				this.matrix1[lerro][zutabe]=pLauki1;
				panel1.add(pLauki1);
			}
		}
		
		Lauki2 pLauki2=null;
		for(int lerro=0; lerro<10; lerro++){
			for(int zutabe=0; zutabe<10; zutabe++){
				pLauki2 = new Lauki2(lerro,zutabe);
				this.matrix2[lerro][zutabe]=pLauki2;
				panel2.add(pLauki2);
			}
		}
		
	}

}
