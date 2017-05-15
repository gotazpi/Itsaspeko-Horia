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
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Leihoa extends JFrame {
	
	private static Leihoa nireLeihoa;
	private JPanel contentPane;
	private JButton[][] matrix1;
	private JButton[][] matrix2;
	private ArrayList<JButton> textFields = new ArrayList<JButton>();
	private ArrayList<JButton> textFields2 = new ArrayList<JButton>();
	private Controller controller = new Controller();
	private Controller2 controller2 = new Controller2();
	JButton button = new JButton("Gorantz");
	JButton button_1 = new JButton("Beherantz");
	JButton button_2 = new JButton("Eskumarantz");
	JButton button_3 = new JButton("Ezkerrerantz");
	JLabel lblAsd = new JLabel(Jokoa.getJokoa().getOntziarenIzena());
	JLabel lblAsd_1 = new JLabel(Jokoa.getJokoa().getOntziarenTamaina());
	JLabel lblOntzia = new JLabel("Ontzia:");
	JLabel lblTamaina = new JLabel("Tamaina:");
	private ButtonGroup armak = new ButtonGroup();
	private ButtonGroup armaNorabidea = new ButtonGroup();
	private ButtonGroup armakonponketak = new ButtonGroup();
	private final JRadioButton rdbtnMisilZuzenduaGurutzatua = new JRadioButton("Misil Zuzendua Gurutzatua");
	private final JRadioButton rdbtnRadarra = new JRadioButton("Radarra");
	JRadioButton rdbtnEzkutua = new JRadioButton("Ezkutua");
	JRadioButton rdbtnBonba = new JRadioButton("Bonba");
	JRadioButton rdbtnMisila = new JRadioButton("Misila");
	JRadioButton rdbtnMisilZuzenduaNorabidea = new JRadioButton("Misil Zuzendua Norabidea");
	JLabel lblArmak = new JLabel("ARMAK:");
	JRadioButton rdbtnBertikal = new JRadioButton("Bertikal");
	JRadioButton rdbtnHorizontal = new JRadioButton("Horizontal");
	private final JRadioButton rdbtnOntziaKonpondu = new JRadioButton("Ontzia konpondu");
	JButton btnNewButton = new JButton("Denda");
	private final Action action = new SwingAction();
	private final JLabel label = new JLabel(Integer.toString(Erabiltzailea.getErabiltzailea().getArmamentua().getRadarKop()));
	private final JLabel label_1 = new JLabel(Integer.toString(Erabiltzailea.getErabiltzailea().getArmamentua().bonbaKop()));
	private final JLabel label_2 = new JLabel(Integer.toString(Erabiltzailea.getErabiltzailea().getArmamentua().misilKop()));
	private final JLabel label_3 = new JLabel(Integer.toString(Erabiltzailea.getErabiltzailea().getArmamentua().misilZuzenduNorabideKop()));
	private final JLabel label_4 = new JLabel(Integer.toString(Erabiltzailea.getErabiltzailea().getArmamentua().misilZuzenduGurutzatuaKop()));
	private final JLabel label_5 = new JLabel(Integer.toString(Erabiltzailea.getErabiltzailea().getArmamentua().ezkutuaKop()));
	private final JLabel label_6 = new JLabel("Dirua: " + Jokoa.getJokoa().getErabiltzailea().getDirua());
	
	
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
					new warning().main(null);
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
		setBounds(100, 100, 1100, 900);
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
		

		lblOntzia.setBounds(628, 517, 46, 14);
		contentPane.add(lblOntzia);
		

		lblTamaina.setBounds(628, 542, 53, 14);
		contentPane.add(lblTamaina);
		
		
		lblAsd.setBounds(691, 517, 103, 14);
		contentPane.add(lblAsd);
		
		lblAsd_1.setBounds(691, 542, 103, 14);
		contentPane.add(lblAsd_1);

		rdbtnBonba.setBounds(624, 86, 73, 23);
		contentPane.add(rdbtnBonba);
		rdbtnBonba.setVisible(false) ;
		
		rdbtnEzkutua.setBounds(624, 435, 84, 23);
		contentPane.add(rdbtnEzkutua);
		rdbtnEzkutua.setVisible(false) ;
		
		
		rdbtnMisila.setBounds(624, 112, 73, 23);
		contentPane.add(rdbtnMisila);
		rdbtnMisila.setVisible(false) ;
		
		
		rdbtnMisilZuzenduaNorabidea.setBounds(624, 138, 193, 23);
		contentPane.add(rdbtnMisilZuzenduaNorabidea);
		rdbtnMisilZuzenduaNorabidea.setVisible(false) ;
		
		lblArmak.setBounds(628, 11, 61, 16);
		contentPane.add(lblArmak);
		lblArmak.setVisible(false) ;
		
		rdbtnMisilZuzenduaGurutzatua.setBounds(624, 164, 180, 23);
		contentPane.add(rdbtnMisilZuzenduaGurutzatua);
		rdbtnMisilZuzenduaGurutzatua.setVisible(false) ;
		
		rdbtnRadarra.setBounds(624, 60, 73, 23);
		contentPane.add(rdbtnRadarra);
		rdbtnRadarra.setVisible(false) ;
		
		armak.add(rdbtnMisilZuzenduaNorabidea);
		armak.add(rdbtnMisila);
		armak.add(rdbtnBonba);
		armak.add(rdbtnRadarra);
		armak.add(rdbtnMisilZuzenduaGurutzatua);
		
		armaNorabidea.add(rdbtnBertikal);
		armaNorabidea.add(rdbtnHorizontal);
		
		armakonponketak.add(rdbtnOntziaKonpondu);
		armakonponketak.add(rdbtnEzkutua);
		btnNewButton.setAction(action);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(628, 194, 107, 26);
		contentPane.add(btnNewButton);
		btnNewButton.setVisible(false);
		
		rdbtnHorizontal.setBounds(819, 138, 109, 23);
		contentPane.add(rdbtnHorizontal);
		rdbtnHorizontal.setVisible(false);
		
		rdbtnBertikal.setBounds(930, 138, 79, 23);
		contentPane.add(rdbtnBertikal);
		rdbtnBertikal.setVisible(false);
		
		rdbtnOntziaKonpondu.setBounds(624, 409, 141, 23);	
		contentPane.add(rdbtnOntziaKonpondu);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setBounds(701, 64, 46, 14);
		
		contentPane.add(label);
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setBounds(701, 90, 46, 14);
		
		contentPane.add(label_1);
		label_2.setBounds(701, 116, 46, 14);
		
		contentPane.add(label_2);
		label_3.setBounds(1012, 142, 46, 14);
		
		contentPane.add(label_3);
		label_4.setBounds(817, 168, 46, 14);
		
		contentPane.add(label_4);
		label_5.setBounds(719, 439, 46, 14);
		
		contentPane.add(label_5);
	
		label_6.setBounds(628, 230, 80, 14);
		contentPane.add(label_6);
		label.setVisible(false);
		label_1.setVisible(false);
		label_2.setVisible(false);
		label_3.setVisible(false);
		label_4.setVisible(false);
		label_5.setVisible(false);
		label_6.setVisible(false);
		rdbtnOntziaKonpondu.setVisible(false);
		
		
		
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

	}

	private class Controller implements ActionListener {
		// al clicar en la matriz de arriba, se hace esto
		public void actionPerformed(ActionEvent arg0) {
			JButton textField = (JButton) arg0.getSource();
			int val = getButton(textField);
			int row = (val ) / 10;
			int col = (val % 10);
			//int aux = Jokoa.getJokoa().getZeregin();
			if (rdbtnBonba.isSelected()) {
				if(Jokoa.getJokoa().jokalariakTiroEgin("Bonba", row, col, 2)){
				zerDagoen(row,col);
				System.out.println("Bang!");}
			} 
			if (rdbtnMisila.isSelected()) {
				if(Jokoa.getJokoa().jokalariakTiroEgin("Misil", row, col, 2)){
				zerDagoen(row,col);
				ontziIkutuakEguneratu();
				System.out.println("Bang!");}
			} 
			
			if (rdbtnMisilZuzenduaNorabidea.isSelected()) {
				if(rdbtnBertikal.isSelected()){
					if(Jokoa.getJokoa().jokalariakTiroEgin("Misil Zuzendua Norabidea", row, col, 0)){//bertikal
					for(int i = 0; i<10; i++){
						zerDagoen(i, col);
					}
					}
				}
				if(rdbtnHorizontal.isSelected()){
					if(Jokoa.getJokoa().jokalariakTiroEgin("Misil Zuzendua Norabidea", row, col, 1)){//Horizontal
						for(int i = 0; i<10; i++){
							zerDagoen(row, i);
						}
					}
				}
				
			} 
					
			if (rdbtnMisilZuzenduaGurutzatua.isSelected()) {// tiro normal
				if(Jokoa.getJokoa().jokalariakTiroEgin("Misil Zuzendua Gurutzatua", row, col, 2)){
					for(int i = 0; i<10; i++){
						zerDagoen(row, i);
						zerDagoen(i, col);
					}
				}
			} 
			
			
			else if (rdbtnRadarra.isSelected()) {// radar
				if (Erabiltzailea.getErabiltzailea().getArmamentua().getRadarKop()>0){
					Erabiltzailea.getErabiltzailea().radarraErabili();
					zerDagoenRadar(row, col);
					System.out.println("pirililiii");
				}
			}
			//Ordenagailua.getOrdenagailua().ordenagailuaZerEginNahiDu();
			//meter aqui el txanda pasa, todo lo que sea clicar que haga pasar el turno
			armakEguneratu();
		}

	}
	
	public void armakEguneratu(){
		label.setText(Integer.toString(Erabiltzailea.getErabiltzailea().getArmamentua().getRadarKop()));
		label_1.setText(Integer.toString(Erabiltzailea.getErabiltzailea().getArmamentua().bonbaKop()));
		label_2.setText(Integer.toString(Erabiltzailea.getErabiltzailea().getArmamentua().misilKop()));
		label_3.setText(Integer.toString(Erabiltzailea.getErabiltzailea().getArmamentua().misilZuzenduNorabideKop()));
		label_4.setText(Integer.toString(Erabiltzailea.getErabiltzailea().getArmamentua().misilZuzenduGurutzatuaKop()));
		label_5.setText(Integer.toString(Erabiltzailea.getErabiltzailea().getArmamentua().ezkutuaKop()));
		label_6.setText("Dirua: " + Jokoa.getJokoa().getErabiltzailea().getDirua());
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
				lblAsd.setText(Jokoa.getJokoa().getOntziarenIzena());
				lblAsd_1.setText(Jokoa.getJokoa().getOntziarenTamaina());
			}
			if (Jokoa.getJokoa().zeinOntziKokatu()>9){
				botoiakIpini();
			}
			}
			if(rdbtnEzkutua.isSelected()==true){
				if(Jokoa.getJokoa().jokalariakTiroEgin("Ezkutua", row, col, 2)){
					aldatuIrudiaHoria2(row, col);
				}
				
			}
			//meter aqui el txanda pasa, todo lo que sea clicar que haga pasar el turno
			tablero2Eguneratu();
			armakEguneratu();
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
		matrix2[i][j].setOpaque(true);
		refresh();
	}
	public void aldatuIrudiaGorria(int i, int j) {
		matrix1[i][j].setBackground(java.awt.Color.red);
		matrix1[i][j].setOpaque(true);
		refresh();
	}
	public void aldatuIrudiaGorria2(int i, int j) {
		matrix2[i][j].setBackground(java.awt.Color.red);
		matrix2[i][j].setOpaque(true);
		refresh();
	}

	public void aldatuIrudiaBerdea(int i, int j) {
		matrix1[i][j].setBackground(java.awt.Color.green);
		matrix1[i][j].setOpaque(true);
		refresh();
	}
	
	public void aldatuIrudiaBerdea2(int i, int j) {
		matrix2[i][j].setBackground(java.awt.Color.green);
		matrix2[i][j].setOpaque(true);
		refresh();
	}

	public void aldatuIrudiaHoria(int i, int j) {
		matrix1[i][j].setBackground(java.awt.Color.yellow);
		matrix1[i][j].setOpaque(true);
		refresh();
	}
	
	public void aldatuIrudiaHoria2(int i, int j) {
		matrix2[i][j].setBackground(java.awt.Color.yellow);
		matrix2[i][j].setOpaque(true);
		refresh();
	}

	public void aldatuIrudiaUrdina(int i, int j) {
		matrix1[i][j].setBackground(java.awt.Color.blue);
		matrix1[i][j].setOpaque(true);
		refresh();
	}
	public void aldatuIrudiaUrdina2(int i, int j) {
		matrix2[i][j].setBackground(java.awt.Color.blue);
		matrix2[i][j].setOpaque(true);
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
		rdbtnEzkutua.setVisible(true) ;
		rdbtnBonba.setVisible(true) ;
		rdbtnMisila.setVisible(true);
		lblArmak.setVisible(true);
		rdbtnRadarra.setVisible(true);
		rdbtnMisilZuzenduaNorabidea.setVisible(true) ;
		rdbtnMisilZuzenduaGurutzatua.setVisible(true) ;
		rdbtnBertikal.setVisible(true);
		rdbtnHorizontal.setVisible(true);
		rdbtnOntziaKonpondu.setVisible(true);
		btnNewButton.setVisible(true);
		
		button.setVisible(false);
		button_2.setVisible(false);
		button_1.setVisible(false);
		button_3.setVisible(false);
		lblAsd.setVisible(false);
		lblAsd_1.setVisible(false);
		lblOntzia.setVisible(false);
		lblTamaina.setVisible(false);
		label.setVisible(true);
		label_1.setVisible(true);
		label_2.setVisible(true);
		label_3.setVisible(true);
		label_4.setVisible(true);
		label_5.setVisible(true);
		label_6.setVisible(true);
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
	public void ontziIkutuakEguneratu(){
		for(int i =0; i<10; i++){
			for(int j =0; j<10; j++){
				if(Jokoa.getJokoa().ontziaDago(i, j)){
					if(Jokoa.getJokoa().ontziaIkutua(i, j)){
						aldatuIrudiaGorria(i, j);
					}
				}
			}
		}
	}

	/*public void tirokatu(int i, int j) {
		if (i >= 0 && i <= 9 && j >= 0 && j <= 9) {
			if (!Jokoa.getJokoa().ontziaDago(i, j)) {
				aldatuIrudiaUrdina(i,j);
			}
			;
			if (Jokoa.getJokoa().ontziaDago(i, j)) {
				if ((Jokoa.getJokoa().getOntziarenEgoera(i, j) instanceof Ezkutatuta)) {
					aldatuIrudiaHoria(i,j);
					// txanda pasa
				} 
				else if (!Jokoa.getJokoa().ontziaIkutua(i, j)) {
					System.out.println("Ikutua");
					aldatuIrudiaGorria(i, j);
				}
				else if(Jokoa.getJokoa().ontziaIkutua(i, j)){
					aldatuIrudiaBerdea(i,j);
				}
			}
			;
		}
	}
	*/
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Denda");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			new Denda().main(null);
		}
	}
}
