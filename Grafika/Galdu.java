package Grafika;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class Galdu {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Galdu window = new Galdu();
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
	public Galdu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 463, 195);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblJokoaGalduDuzu = new JLabel("Jokoa galdu duzu, saiatu berriro");
		lblJokoaGalduDuzu.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblJokoaGalduDuzu.setBounds(10, 11, 424, 89);
		frame.getContentPane().add(lblJokoaGalduDuzu);
		
		JButton button = new JButton("OK");
		button.setAction(action);
		button.setBounds(173, 111, 89, 23);
		frame.getContentPane().add(button);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "OK");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
		}
	}
}
