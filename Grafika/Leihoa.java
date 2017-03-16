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
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Leihoa extends JFrame {
	
	private static Leihoa nireLeihoa;
	private JPanel contentPane;
	private Lauki1[][] matrix1;
	private Lauki2[][] matrix2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public static Leihoa getLeihoa(){
		if (nireLeihoa==null){
			nireLeihoa = new Leihoa();
		}
		return nireLeihoa;
	}
	
	public Lauki2 getLaukia2(int i, int j){
		return matrix2[i][j];
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jokalaria j = Jokalaria.getJokalaria();
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
	private Leihoa() {
		this.matrix1=new Lauki1[10][10];
		this.matrix2=new Lauki2[10][10];
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(98, 11, 520, 387);
		JPanel panel2 = new JPanel();
		panel2.setBounds(98, 409, 520, 387);
		contentPane.setLayout(null);
		contentPane.add(panel1);
		contentPane.add(panel2);
		panel1.setLayout(new GridLayout(10, 10, 0, 0));
		panel2.setLayout(new GridLayout(10, 10, 0, 0));
		
		JButton btnNewButton_1 = new JButton("Ezkutatu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokalaria.getJokalaria().getTaula().getOntzia(Integer.parseInt(textField.getText().trim())-1, Integer.parseInt(textField_1.getText().trim())-1).ezkutatu();
			}
		});
		btnNewButton_1.setBounds(628, 758, 119, 38);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("Gorantz");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokalaria.getJokalaria().getFlota().setNorabidea(3);
			}
		});
		button.setBounds(628, 709, 119, 38);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Beherantz");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokalaria.getJokalaria().getFlota().setNorabidea(1);
			}
		});
		button_1.setBounds(628, 659, 119, 38);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Eskumarantz");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokalaria.getJokalaria().getFlota().setNorabidea(2);
			}
		});
		button_2.setBounds(628, 612, 119, 38);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Ezkerrerantz");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokalaria.getJokalaria().getFlota().setNorabidea(0);
			}
		});
		button_3.setBounds(628, 565, 119, 38);
		contentPane.add(button_3);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(801, 758, 34, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(757, 758, 34, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(757, 807, 34, 14);
		contentPane.add(lblX);
		
		JLabel lblY = new JLabel("Y");
		lblY.setHorizontalAlignment(SwingConstants.CENTER);
		lblY.setBounds(801, 807, 34, 14);
		contentPane.add(lblY);
		
		JLabel lblNorabidea = new JLabel("Norabidea: 0(gorantz) 1(eskumarantz) 2(beherantz) 3(ezkerrerantz)");
		lblNorabidea.setEnabled(false);
		lblNorabidea.setBounds(628, 409, 336, 14);
		contentPane.add(lblNorabidea);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setEnabled(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(638, 434, 326, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
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
	public int getNorabidea(){
		return Jokalaria.getJokalaria().getFlota().getNorabidea();
	}
	public void setKoloreakMatrix2(int x,int y, int luzera){//0(gorantz) 1(eskumarantz) 2(beherantz) 3(ezkerrerantz)
		if (getNorabidea()==0){for(int i=0; i<=luzera; i++){
			
			System.out.print(y-i+1);
			System.out.println(x+1);
			}
		}
		if (getNorabidea()==1){for(int i=0; i<=luzera; i++){
			System.out.print(y+1);
			System.out.println(x+i+1);
			matrix2[x+1][y].aldatuIrudia();}
		}
		if (getNorabidea()==2){for(int i=0; i<=luzera; i++){
			System.out.print(y+i+1);
			System.out.println(x+1);
			matrix2[x][y+1].aldatuIrudia();}
		}
		if (getNorabidea()==3){for(int i=0; i<=luzera; i++){
			System.out.print(y+1);
			System.out.println(x-i+1);
			matrix2[x-1][y].aldatuIrudia();}
		}
	}
}
