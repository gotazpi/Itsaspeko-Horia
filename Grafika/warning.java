package Grafika;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class warning {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					warning window = new warning();
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
	public warning() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWarning = new JLabel("WARNING!");
		lblWarning.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblWarning.setBounds(158, 57, 136, 42);
		frame.getContentPane().add(lblWarning);
		
		JLabel lblProyectMayExplode = new JLabel("PROJECT MAY EXPLODE");
		lblProyectMayExplode.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblProyectMayExplode.setBounds(121, 111, 221, 14);
		frame.getContentPane().add(lblProyectMayExplode);
		
		JLabel lblWeBuildThis = new JLabel("WE BUILT THIS BY OURSELF");
		lblWeBuildThis.setBounds(145, 153, 197, 14);
		frame.getContentPane().add(lblWeBuildThis);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnClose.setBounds(178, 203, 89, 23);
		frame.getContentPane().add(btnClose);
		
		JLabel lblunderConstruction = new JLabel("!!Under construction!!");
		lblunderConstruction.setBounds(302, 236, 122, 14);
		frame.getContentPane().add(lblunderConstruction);
	}
}
