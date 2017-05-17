package Grafika;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import ItsaspekoHoria.Jokoa;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class warning {

	private JFrame frame;
	JLabel lblWarning = new JLabel(Jokoa.getJokoa().mezua());
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
		frame.setBounds(100, 100, 450, 187);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblWarning.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblWarning.setBounds(10, 11, 414, 42);
		frame.getContentPane().add(lblWarning);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnClose.setBounds(166, 86, 89, 23);
		frame.getContentPane().add(btnClose);
	}
}
