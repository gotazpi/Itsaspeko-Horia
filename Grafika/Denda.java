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
import javax.swing.Action;

public class Denda{

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private final Action action_6 = new SwingAction_6();
	private JLabel label_5 = new JLabel("Biltegian: " + Biltegia.getNireBiltegia().bonbaKop());
	private JLabel label_6 = new JLabel("Biltegian: " + Biltegia.getNireBiltegia().misilKop());
	private JLabel label_7 = new JLabel("Biltegian: " + Biltegia.getNireBiltegia().getRadarKop());
	private JLabel label_8 = new JLabel("Biltegian: " + Biltegia.getNireBiltegia().ezkutuaKop());
	private JLabel label_9 = new JLabel("Biltegian: " + Biltegia.getNireBiltegia().misilZuzenduGurutzatuaKop());
	private JLabel label_10 = new JLabel("Biltegian: " + Biltegia.getNireBiltegia().misilZuzenduNorabideKop());
	private JLabel label_11 = new JLabel("Dirua: " + Erabiltzailea.getErabiltzailea().getDirua());

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
		btnBonba.setAction(action_1);
		btnBonba.setBounds(10, 11, 190, 23);
		frame.getContentPane().add(btnBonba);
		
		JButton btnMisil = new JButton("Misil");
		btnMisil.setAction(action_2);
		btnMisil.setBounds(10, 45, 190, 23);
		frame.getContentPane().add(btnMisil);
		
		JButton btnRadar = new JButton("Radar");
		btnRadar.setAction(action_3);
		btnRadar.setBounds(10, 79, 190, 23);
		frame.getContentPane().add(btnRadar);
		
		JButton btnEzkutua = new JButton("Ezkutua");
		btnEzkutua.setAction(action_4);
		btnEzkutua.setBounds(10, 113, 190, 23);
		frame.getContentPane().add(btnEzkutua);
		
		JButton btnMisilZuzenduaGurutzatua = new JButton("Misil Zuzendua Gurutzatua");
		btnMisilZuzenduaGurutzatua.setAction(action_5);
		btnMisilZuzenduaGurutzatua.setBounds(10, 147, 190, 23);
		frame.getContentPane().add(btnMisilZuzenduaGurutzatua);
		
		JButton btnMisilZuzenduaNorabidea = new JButton("Misil Zuzendua Norabidea");
		btnMisilZuzenduaNorabidea.setAction(action_6);
		btnMisilZuzenduaNorabidea.setBounds(10, 181, 190, 23);
		frame.getContentPane().add(btnMisilZuzenduaNorabidea);
		
		JLabel lblPrezioa = new JLabel("Prezioa: " + Integer.toString((new Bonba().getKostua())));
		lblPrezioa.setBounds(210, 15, 65, 14);
		frame.getContentPane().add(lblPrezioa);
		
		JLabel label = new JLabel("Prezioa: " + Integer.toString((new Misil().getKostua())));
		label.setBounds(210, 49, 65, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Prezioa: " + Integer.toString((new Radar().getKostua())));
		label_1.setBounds(210, 83, 65, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Prezioa: " + Integer.toString((new Ezkutua().getKostua())));
		label_2.setBounds(210, 117, 65, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Prezioa: " + Integer.toString((new MisilZuzenduaGurutzatua().getKostua())));
		label_3.setBounds(210, 151, 65, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Prezioa: " + Integer.toString((new MisilZuzenduaNorabidea().getKostua())));
		label_4.setBounds(210, 185, 65, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Biltegian: " + Biltegia.getNireBiltegia().bonbaKop());
		label_5.setBounds(285, 15, 75, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Biltegian: " + Biltegia.getNireBiltegia().misilKop());
		label_6.setBounds(285, 49, 75, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Biltegian: " + Biltegia.getNireBiltegia().getRadarKop());
		label_7.setBounds(285, 83, 75, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Biltegian: " + Biltegia.getNireBiltegia().ezkutuaKop());
		label_8.setBounds(285, 117, 75, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Biltegian: " + Biltegia.getNireBiltegia().misilZuzenduGurutzatuaKop());
		label_9.setBounds(285, 151, 75, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Biltegian: " + Biltegia.getNireBiltegia().misilZuzenduNorabideKop());
		label_10.setBounds(285, 185, 75, 14);
		frame.getContentPane().add(label_10);
		
		JButton btnItzuli = new JButton("Itzuli");
		btnItzuli.setAction(action);
		btnItzuli.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnItzuli);
		
		JLabel label_11 = new JLabel("Dirua: " + Erabiltzailea.getErabiltzailea().getDirua());
		label_11.setBounds(10, 231, 65, 14);
		frame.getContentPane().add(label_11);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Itzuli");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			//eguneratu lehioa
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Bonba");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Erabiltzailea.getErabiltzailea().armaErosi("Bonba");
			label_5.setText("Biltegian: " + Biltegia.getNireBiltegia().bonbaKop());
			label_11.setText("Dirua: " + Erabiltzailea.getErabiltzailea().getDirua());
			eguneratu();
			Leihoa.getLeihoa().armakEguneratu();
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Misil");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Erabiltzailea.getErabiltzailea().armaErosi("Misil");
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Radar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Erabiltzailea.getErabiltzailea().armaErosi("Radar");
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Ezkutua");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Erabiltzailea.getErabiltzailea().armaErosi("Ezkutua");
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "Misil Zuzendua Gurutzatua");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Erabiltzailea.getErabiltzailea().armaErosi("Misil Zuzendua Gurutzatua");
		}
	}
	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "Misil Zuzendua Norabidea");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Erabiltzailea.getErabiltzailea().armaErosi("Misil Zuzendua Norabidea");
		}
	}
	
	private void eguneratu(){
		frame.getContentPane().repaint();
		frame.getContentPane().validate();
	}
}
