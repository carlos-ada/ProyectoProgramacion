package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class ElegirJugador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElegirJugador frame = new ElegirJugador();
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
	public ElegirJugador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Jugador 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 49, 101, 31);
		contentPane.add(btnNewButton);
		
		JButton btnJugador = new JButton("Jugador 2");
		btnJugador.setBounds(10, 94, 101, 31);
		contentPane.add(btnJugador);
		
		JButton btnJugador_1 = new JButton("Jugador 3");
		btnJugador_1.setBounds(10, 136, 101, 31);
		contentPane.add(btnJugador_1);
		
		JButton btnJugador_2 = new JButton("Jugador 4");
		btnJugador_2.setBounds(10, 178, 101, 31);
		contentPane.add(btnJugador_2);
		
		JButton btnJugador_3 = new JButton("Jugador 5");
		btnJugador_3.setBounds(10, 220, 101, 31);
		contentPane.add(btnJugador_3);
		
		JButton btnJugador_4 = new JButton("Jugador 6");
		btnJugador_4.setBounds(121, 49, 101, 31);
		contentPane.add(btnJugador_4);
		
		JButton btnJugador_5 = new JButton("Jugador 7");
		btnJugador_5.setBounds(121, 94, 101, 31);
		contentPane.add(btnJugador_5);
		
		JButton btnJugador_6 = new JButton("Jugador 8");
		btnJugador_6.setBounds(121, 136, 101, 31);
		contentPane.add(btnJugador_6);
		
		JButton btnJugador_7 = new JButton("Jugador 9");
		btnJugador_7.setBounds(121, 178, 101, 31);
		contentPane.add(btnJugador_7);
		
		JButton btnJugador_8 = new JButton("Jugador 10");
		btnJugador_8.setBounds(121, 220, 101, 31);
		contentPane.add(btnJugador_8);
		
		JButton btnJugador_9 = new JButton("Jugador 11");
		btnJugador_9.setBounds(69, 262, 101, 31);
		contentPane.add(btnJugador_9);
		
		JLabel lblNewLabel = new JLabel("\u00A1Elige un Jugador!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(37, 11, 171, 27);
		contentPane.add(lblNewLabel);
	}

}
