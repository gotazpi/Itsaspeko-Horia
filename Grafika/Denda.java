package Grafika;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;

import ItsaspekoHoria.*;

import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class Denda{

	private JFrame frame;
	/*private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private final Action action_6 = new SwingAction_6();*/

	private JLabel label_5 = new JLabel("Biltegian: " + 	Jokoa.getJokoa().getBiltegia().bonbaKop());
	private JLabel label_6 = new JLabel("Biltegian: " + Jokoa.getJokoa().getBiltegia().misilKop());
	private JLabel label_7 = new JLabel("Biltegian: " + Jokoa.getJokoa().getBiltegia().getRadarKop());
	private JLabel label_8 = new JLabel("Biltegian: " + Jokoa.getJokoa().getBiltegia().ezkutuaKop());
	private JLabel label_9 = new JLabel("Biltegian: " + Jokoa.getJokoa().getBiltegia().misilZuzenduGurutzatuaKop());
	private JLabel label_10 = new JLabel("Biltegian: " + Jokoa.getJokoa().getBiltegia().misilZuzenduNorabideKop());
	private JLabel label_11 = new JLabel("Dirua: " + Jokoa.getJokoa().getErabiltzailea().getDirua());
	//private Controller3 controller = new Controller3();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Denda window = new Denda();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Denda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBonba = new JButton("Bonba");
		btnBonba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Jokoa.getJokoa().getErabiltzailea().armaErosi("Bonba");
				eguneratu();
			}
		});
		btnBonba.setBounds(10, 11, 208, 23);
		//btnBonba.addActionListener(controller);
		frame.getContentPane().add(btnBonba);
		
		JButton btnMisil = new JButton("Misil");	
		btnMisil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokoa.getJokoa().getErabiltzailea().armaErosi("Misil");
				eguneratu();
			}
		});
		btnMisil.setBounds(10, 45, 208, 23);
		//btnMisil.addActionListener(controller);
		frame.getContentPane().add(btnMisil);
		
		JButton btnRadar = new JButton("Radar");	
		btnRadar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokoa.getJokoa().getErabiltzailea().armaErosi("Radar");
				eguneratu();
			}
		});
		btnRadar.setBounds(10, 79, 208, 23);
		//btnRadar.addActionListener(controller);
		frame.getContentPane().add(btnRadar);
		
		JButton btnEzkutua = new JButton("Ezkutua");	
		btnEzkutua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokoa.getJokoa().getErabiltzailea().armaErosi("Ezkutua");
				eguneratu();
			}
		});
		btnEzkutua.setBounds(10, 113, 208, 23);
		//btnEzkutua.addActionListener(controller);
		frame.getContentPane().add(btnEzkutua);
		
		JButton btnMisilZuzenduaGurutzatua = new JButton("Misil Zuzendua Gurutzatua");
		btnMisilZuzenduaGurutzatua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokoa.getJokoa().getErabiltzailea().armaErosi("Misil Zuzendua Gurutzatua");
				eguneratu();
			}
		});
		btnMisilZuzenduaGurutzatua.setBounds(10, 147, 208, 23);
		//btnMisilZuzenduaGurutzatua.addActionListener(controller);
		frame.getContentPane().add(btnMisilZuzenduaGurutzatua);
		
		JButton btnMisilZuzenduaNorabidea = new JButton("Misil Zuzendua Norabidea");
		btnMisilZuzenduaNorabidea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokoa.getJokoa().getErabiltzailea().armaErosi("Misil Zuzendua Norabidea");
				eguneratu();
			}
		});
		btnMisilZuzenduaNorabidea.setBounds(10, 181, 208, 23);
		//btnMisilZuzenduaNorabidea.addActionListener(controller);
		frame.getContentPane().add(btnMisilZuzenduaNorabidea);
		
		JLabel lblPrezioa = new JLabel("Prezioa: " + Integer.toString((new Bonba().getKostua())));
		lblPrezioa.setBounds(228, 12, 74, 14);
		frame.getContentPane().add(lblPrezioa);
		
		JLabel label = new JLabel("Prezioa: " + Integer.toString((new Misil().getKostua())));
		label.setBounds(228, 46, 74, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Prezioa: " + Integer.toString((new Radar().getKostua())));
		label_1.setBounds(228, 80, 74, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Prezioa: " + Integer.toString((new Ezkutua().getKostua())));
		label_2.setBounds(228, 114, 74, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Prezioa: " + Integer.toString((new MisilZuzenduaGurutzatua().getKostua())));
		label_3.setBounds(228, 148, 74, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Prezioa: " + Integer.toString((new MisilZuzenduaNorabidea().getKostua())));
		label_4.setBounds(228, 182, 74, 14);
		frame.getContentPane().add(label_4);
		
		//JLabel label_5 = new JLabel("Biltegian: " + Jokoa.getJokoa().getBiltegia().bonbaKop());
		label_5.setBounds(314, 11, 89, 14);
		frame.getContentPane().add(label_5);
		
		//JLabel label_6 = new JLabel("Biltegian: " + Jokoa.getJokoa().getBiltegia().misilKop());
		label_6.setBounds(314, 45, 86, 14);
		frame.getContentPane().add(label_6);
		
		//JLabel label_7 = new JLabel("Biltegian: " + Jokoa.getJokoa().getBiltegia().getRadarKop());
		label_7.setBounds(314, 79, 86, 14);
		frame.getContentPane().add(label_7);
		
		//JLabel label_8 = new JLabel("Biltegian: " + Jokoa.getJokoa().getBiltegia().ezkutuaKop());
		label_8.setBounds(314, 113, 89, 14);
		frame.getContentPane().add(label_8);
		
		//JLabel label_9 = new JLabel("Biltegian: " + Jokoa.getJokoa().getBiltegia().misilZuzenduGurutzatuaKop());
		label_9.setBounds(314, 147, 89, 14);
		frame.getContentPane().add(label_9);
		
		//JLabel label_10 = new JLabel("Biltegian: " + Jokoa.getJokoa().getBiltegia().misilZuzenduNorabideKop());
		label_10.setBounds(314, 181, 89, 14);
		frame.getContentPane().add(label_10);
		
		JButton btnItzuli = new JButton("Itzuli");
		btnItzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Leihoa.getLeihoa().armakEguneratu();
				frame.dispose();
			}
		});
		btnItzuli.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnItzuli);
		
		//JLabel label_11 = new JLabel("Dirua: " + Jokoa.getJokoa().getErabiltzailea().getDirua());
		label_11.setBounds(10, 231, 86, 14);
		frame.getContentPane().add(label_11);
	}
	
	private void eguneratu(){

		label_5.setText("Biltegian: " + Jokoa.getJokoa().getBiltegia().bonbaKop());
		label_6.setText("Biltegian: " + Jokoa.getJokoa().getBiltegia().misilKop());
		label_7.setText("Biltegian: " + Jokoa.getJokoa().getBiltegia().getRadarKop());
		label_8.setText("Biltegian: " + Jokoa.getJokoa().getBiltegia().ezkutuaKop());
		label_9.setText("Biltegian: " + Jokoa.getJokoa().getBiltegia().misilZuzenduGurutzatuaKop());
		label_10.setText("Biltegian: " + Jokoa.getJokoa().getBiltegia().misilZuzenduNorabideKop());
		label_11.setText("Dirua: " + Jokoa.getJokoa().getErabiltzailea().getDirua());
		frame.getContentPane().validate();
		frame.getContentPane().repaint();
		frame.validate();
		frame.repaint();
	}
	
}
