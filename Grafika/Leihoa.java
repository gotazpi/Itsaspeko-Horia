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

import ItsaspekoHoria.*;

import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JRadioButton;
import javax.swing.JTextPane;

public class Leihoa extends JFrame {

	private static Leihoa nireLeihoa;
	private JPanel contentPane;
	private JButton[][] matrix1;
	private JButton[][] matrix2;
	private ArrayList<JButton> textFields = new ArrayList<JButton>();
	private ArrayList<JButton> textFields2 = new ArrayList<JButton>();
	private Controller controller = new Controller();
	private Controller2 controller2 = new Controller2();
	private JButton btnTiroEgin = new JButton("Tiro egin");
	private JButton btnRadarra = new JButton("Radarra");
	private JButton btnNewButton_1 = new JButton("Ezkutatu");	
	JButton button = new JButton("Gorantz");
	JButton button_1 = new JButton("Beherantz");
	JButton button_2 = new JButton("Eskumarantz");
	JButton button_3 = new JButton("Ezkerrerantz");
	JLabel lblAsd = new JLabel(Jokoa.getJokoa().getOntziarenIzena());
	JLabel lblAsd_1 = new JLabel(Jokoa.getJokoa().getOntziarenTamaina());
	JLabel lblOntzia = new JLabel("Ontzia:");
	JLabel lblTamaina = new JLabel("Tamaina:");
	
	public static Leihoa getLeihoa() {
		if (nireLeihoa == null) {
			nireLeihoa = new Leihoa();
		}
		return nireLeihoa;
	}


	/**
	 * Launch the application.
	 */
	public void hasiera() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Erabiltzailea j = Erabiltzailea.getErabiltzailea();
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
		setTitle("Itsaspeko Horia");
		this.matrix1 = new JButton[10][10];
		this.matrix2 = new JButton[10][10];

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 900);
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

		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokoa.getJokoa().ezkutatzeko();
			}
		});
		btnNewButton_1.setBounds(630, 86, 89, 23);
		btnNewButton_1.setVisible(false);
		contentPane.add(btnNewButton_1);

		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pasar a jokoa
				Jokoa.getJokoa().norabideaEzarri(3);
			}
		});
		button.setBounds(628, 709, 119, 38);
		contentPane.add(button);

		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pasar a jokoa
				Jokoa.getJokoa().norabideaEzarri(1);
			}
		});
		button_1.setBounds(628, 659, 119, 38);
		contentPane.add(button_1);

		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pasar a jokoa
				Jokoa.getJokoa().norabideaEzarri(2);
			}
		});
		button_2.setBounds(628, 612, 119, 38);
		contentPane.add(button_2);

		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pasar a jokoa
				Jokoa.getJokoa().norabideaEzarri(0);
			}
		});
		button_3.setBounds(628, 565, 119, 38);
		contentPane.add(button_3);

		
		btnTiroEgin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokoa.getJokoa().tiroEgiteko();
			}
		});
		btnTiroEgin.setBounds(630, 11, 89, 23);
		contentPane.add(btnTiroEgin);
		btnTiroEgin.setVisible(false);

		
		btnRadarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokoa.getJokoa().radarraEgiteko();
			}
		});
		btnRadarra.setBounds(630, 51, 89, 23);
		btnRadarra.setVisible(false);
		contentPane.add(btnRadarra);
		

		lblOntzia.setBounds(628, 517, 46, 14);
		contentPane.add(lblOntzia);
		

		lblTamaina.setBounds(628, 542, 53, 14);
		contentPane.add(lblTamaina);
		
		
		lblAsd.setBounds(691, 517, 103, 14);
		contentPane.add(lblAsd);
		
		lblAsd_1.setBounds(691, 542, 103, 14);
		contentPane.add(lblAsd_1);
		
		
		// Panel1
		for (int lerro = 0; lerro < 10; lerro++) {
			for (int zutabe = 0; zutabe < 10; zutabe++) {
				JButton newJButton = new JButton();
				panel1.add(newJButton);
				textFields.add(newJButton);
				newJButton.addActionListener(controller);
				this.matrix1[lerro][zutabe] = newJButton;
			}
		}

		// Panel2
		for (int lerro = 0; lerro < 10; lerro++) {
			for (int zutabe = 0; zutabe < 10; zutabe++) {
				JButton newJButton = new JButton();
				newJButton.setBackground(java.awt.Color.blue);
				panel2.add(newJButton);
				textFields2.add(newJButton);
				newJButton.addActionListener(controller2);
				this.matrix2[lerro][zutabe] = newJButton;
			}
		}

		// Group the buttons.
		//ButtonGroup group = new ButtonGroup();

	}

	private class Controller implements ActionListener {
		// al clicar en la matriz de arriba, se hace esto
		public void actionPerformed(ActionEvent arg0) {
			JButton textField = (JButton) arg0.getSource();
			int val = getButton(textField);
			int row = (val ) / 10;
			int col = (val % 10);
			int aux = Jokoa.getJokoa().getZeregin();
			if (aux == 0) {// tiro
				tirokatu(row, col);
				System.out.println("Bang!");
			} else if (aux == 1) {// radar
				zerDagoenRadar(row, col);
				System.out.println("pirililiii");
			}
		}

	}

	private class Controller2 implements ActionListener {
		// al clicar en la matriz de abajo, se hace esto
		public void actionPerformed(ActionEvent arg0) {
			JButton textField = (JButton) arg0.getSource();
			int val = getButton2(textField);
			int row = (val ) / 10;
			int col = (val % 10);
			int aux = Jokoa.getJokoa().getZeregin();
			if (aux==2){
			boolean aux2 = Jokoa.getJokoa().kokatuGrafikatik(row, col);
			if (aux2) {
				//hacer que se pinte en todos los que se pone el barco
				lblAsd.setText(Jokoa.getJokoa().getOntziarenIzena());
				lblAsd_1.setText(Jokoa.getJokoa().getOntziarenTamaina());
				System.out.println(row+" "+col);
			}
			if (Jokoa.getJokoa().zeinOntziKokatu()>9){
				botoiakIpini();
			}
			}
			if(aux==3){
				if(Jokoa.getJokoa().ezkutatu(row, col)){
					aldatuIrudiaHoria2(row, col);
				}
				
			}
			tablero2Eguneratu();
		}

	}

	private int getButton(JButton textField2) {
		int pos = 0;
		for (JButton b : textFields) {
			if (b == textField2) {
				return pos;
			} else
				pos++;
		}
		return -1;
	}

	private int getButton2(JButton textField2) {
		int pos = 0;
		for (JButton b : textFields2) {
			if (b == textField2) {
				return pos;
			} else
				pos++;
		}
		return -1;
	}

	
	public void tablero2Eguneratu(){
		int y, x;
		for(x=0; x<10; x++){
			for(y=0; y<10; y++){
				if(Jokoa.getJokoa().ontziaDago2(x, y)){
					if(Jokoa.getJokoa().ontziaIkutua2(x, y)){
						aldatuIrudiaGorria2(x,y);
					}
					if(!Jokoa.getJokoa().ontziaIkutua2(x, y)){
						aldatuIrudiaBerdea2(x,y);
					}
					EgoeraOntzia aux=Jokoa.getJokoa().getOntziarenEgoera2(x,y);
					if(aux instanceof Ezkutatuta){
						aldatuIrudiaHoria2(x,y);
					}
					
				}
				else if(!Jokoa.getJokoa().ontziaDago2(x, y)){
					aldatuIrudiaUrdina2(x, y);
				}
			}
			y=0;
		}
	}
	
	public void refresh() {
		contentPane.validate();
		contentPane.repaint();
		this.validate();
		this.repaint();
	}
	public void aldatuIrudiaBeltza2(int i, int j) {
		matrix2[i][j].setBackground(java.awt.Color.black);
		refresh();
	}
	public void aldatuIrudiaGorria(int i, int j) {
		matrix1[i][j].setBackground(java.awt.Color.red);
		refresh();
	}
	public void aldatuIrudiaGorria2(int i, int j) {
		matrix2[i][j].setBackground(java.awt.Color.red);
		refresh();
	}

	public void aldatuIrudiaBerdea(int i, int j) {
		matrix1[i][j].setBackground(java.awt.Color.green);
		refresh();
	}
	
	public void aldatuIrudiaBerdea2(int i, int j) {
		matrix2[i][j].setBackground(java.awt.Color.green);
		refresh();
	}

	public void aldatuIrudiaHoria(int i, int j) {
		matrix1[i][j].setBackground(java.awt.Color.yellow);
		refresh();
	}
	
	public void aldatuIrudiaHoria2(int i, int j) {
		matrix2[i][j].setBackground(java.awt.Color.yellow);
		refresh();
	}

	public void aldatuIrudiaUrdina(int i, int j) {
		matrix1[i][j].setBackground(java.awt.Color.blue);
		refresh();
	}
	public void aldatuIrudiaUrdina2(int i, int j) {
		matrix2[i][j].setBackground(java.awt.Color.blue);
		refresh();
	}

	public void zerDagoen(int i, int j) {
		if (i >= 0 && i <= 9 && j >= 0 && j <= 9) {
			if (!Jokoa.getJokoa().ontziaDago(i, j)) {
				aldatuIrudiaUrdina(i, j);
			}
			;
			if (Jokoa.getJokoa().ontziaDago(i, j)) {
				if ((Jokoa.getJokoa().getOntziarenEgoera(i, j) instanceof Ezkutatuta)) {
					this.aldatuIrudiaHoria(i,j);
				} else if (!Jokoa.getJokoa().ontziaIkutua(i, j)) {
					this.aldatuIrudiaBerdea(i,j);
				} else
					aldatuIrudiaGorria(i,j);
			}
			;
		}
	}
	public void botoiakIpini(){
		btnRadarra.setVisible(true);
		btnTiroEgin.setVisible(true);
		btnNewButton_1.setVisible(true);
		button.setVisible(false);
		button_2.setVisible(false);
		button_1.setVisible(false);
		button_3.setVisible(false);
		lblAsd.setVisible(false);
		lblAsd_1.setVisible(false);
		lblOntzia.setVisible(false);
		lblTamaina.setVisible(false);
	}
	public void zerDagoenRadar(int i, int j) {
		zerDagoen(i-1,j-1);
		zerDagoen(i-1,j);
		zerDagoen(i-1,j+1);
		zerDagoen(i,j-1);
		zerDagoen(i, j);
		zerDagoen(i,j+1);
		zerDagoen(i+1,j-1);
		zerDagoen(i+1,j);
		zerDagoen(i+1,j+1);
		Leihoa.getLeihoa().refresh();
		//eliminar un radar del que lo use y pasar turno
	}

	public void tirokatu(int i, int j) {
		if (i >= 0 && i <= 9 && j >= 0 && j <= 9) {
			if (!Jokoa.getJokoa().ontziaDago(i, j)) {
				aldatuIrudiaUrdina(i,j);
			}
			;
			if (Jokoa.getJokoa().ontziaDago(i, j)) {
				if ((Jokoa.getJokoa().getOntziarenEgoera(i, j) instanceof Ezkutatuta)) {
					aldatuIrudiaHoria(i,j);
					// txanda pasa
				} else if (!Jokoa.getJokoa().ontziaIkutua(i, j)) {
					System.out.println("Ikutua");
					aldatuIrudiaGorria(i, j);
					Jokoa.getJokoa().ontziaIkutu(i, j);
				}
			}
			;
		}
	}
}
