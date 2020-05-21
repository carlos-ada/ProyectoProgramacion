package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ElegirJugador3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElegirJugador3 frame = new ElegirJugador3();
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
	public ElegirJugador3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Atr\u00E1s");
		btnNewButton_1.setBounds(0, 0, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u00A1Elige la posici\u00F3n!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(128, 0, 171, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Delanteros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Delanteros3().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(115, 38, 188, 61);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Centrocampistas");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(115, 110, 188, 61);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Defensas");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(115, 182, 188, 61);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Portero");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(115, 254, 188, 58);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Todos los jugadores");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_5.setBounds(359, 110, 227, 99);
		contentPane.add(btnNewButton_5);
	}

}
