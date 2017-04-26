package Grafika;

import java.awt.BorderLayout;
import java.awt.Button;
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
import javax.swing.ButtonGroup;
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

import java.util.Observable;
import java.util.Observer;
import javax.swing.JRadioButton;

public class Leihoa extends JFrame {

	private static Leihoa nireLeihoa;
	private JPanel contentPane;
	private Lauki1[][] matrix1;
	private Lauki2[][] matrix2;
	private JTextField textField;
	private JTextField textField_1;
	

	public static Leihoa getLeihoa() {
		if (nireLeihoa == null) {
			nireLeihoa = new Leihoa();
		}
		return nireLeihoa;
	}

	public Lauki2 getLaukia2(int i, int j) {
		return matrix2[i][j];
	}

	/**
	 * Launch the application.
	 */
	public void hasiera() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Erabiltzailea j = Erabiltzailea.getErabiltzailea();
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
		this.matrix1 = new Lauki1[10][10];
		this.matrix2 = new Lauki2[10][10];

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 900);
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
				Erabiltzailea.getErabiltzailea().getTaula().getOntzia(Integer.parseInt(textField.getText().trim()) - 1,
						Integer.parseInt(textField_1.getText().trim()) - 1).ezkutatu();
			}
		});
		btnNewButton_1.setBounds(628, 758, 119, 38);
		contentPane.add(btnNewButton_1);

		JButton button = new JButton("Gorantz");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Erabiltzailea.getErabiltzailea().getFlota().setNorabidea(3);
			}
		});
		button.setBounds(628, 709, 119, 38);
		contentPane.add(button);

		JButton button_1 = new JButton("Beherantz");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Erabiltzailea.getErabiltzailea().getFlota().setNorabidea(1);
			}
		});
		button_1.setBounds(628, 659, 119, 38);
		contentPane.add(button_1);

		JButton button_2 = new JButton("Eskumarantz");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Erabiltzailea.getErabiltzailea().getFlota().setNorabidea(2);
			}
		});
		button_2.setBounds(628, 612, 119, 38);
		contentPane.add(button_2);

		JButton button_3 = new JButton("Ezkerrerantz");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Erabiltzailea.getErabiltzailea().getFlota().setNorabidea(0);
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
		
		JButton btnTiroEgin = new JButton("Tiro egin");
		btnTiroEgin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokoa.getJokoa().tiroEgiteko();
			}
		});
		btnTiroEgin.setBounds(648, 11, 89, 23);
		contentPane.add(btnTiroEgin);
		
		JButton btnRadarra = new JButton("Radarra");
		btnRadarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokoa.getJokoa().radarraEgiteko();
			}
		});
		btnRadarra.setBounds(648, 45, 89, 23);
		contentPane.add(btnRadarra);

		Lauki1 pLauki1 = null;
		for (int lerro = 0; lerro < 10; lerro++) {
			for (int zutabe = 0; zutabe < 10; zutabe++) {
				pLauki1 = new Lauki1(lerro, zutabe);
				this.matrix1[lerro][zutabe] = pLauki1;
				panel1.add(pLauki1);
			}
		}

		Lauki2 pLauki2 = null;
		for (int lerro = 0; lerro < 10; lerro++) {
			for (int zutabe = 0; zutabe < 10; zutabe++) {
				pLauki2 = new Lauki2(lerro, zutabe);
				this.matrix2[lerro][zutabe] = pLauki2;
				panel2.add(pLauki2);
			}
		}

		// Group the radio buttons.
		ButtonGroup group = new ButtonGroup();

	}
	
	
	public int getNorabidea() {
		return Erabiltzailea.getErabiltzailea().getFlota().getNorabidea();
	}

	public void refresh() {
		contentPane.validate();
		contentPane.repaint();
		this.validate();
		this.repaint();
	}

}
