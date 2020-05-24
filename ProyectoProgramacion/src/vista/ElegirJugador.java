package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class ElegirJugador extends JFrame {

	private JPanel contentPane;
	private ImageIcon icon;
    private Image image;
    private Image modifiImage;

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
		setBounds(100, 100, 632, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Delanteros");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Delanteros1().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(115, 38, 188, 61);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u00A1Elige la posici\u00F3n!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(128, 0, 171, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Atr\u00E1s");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.ElegirEquipo().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(0, 0, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Centrocampistas");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Centrocampistas1().setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(115, 110, 188, 61);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Defensas");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Defensas1().setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(115, 182, 188, 61);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Portero");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Portero1().setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(115, 254, 188, 58);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Todos los jugadores");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Todos1().setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_5.setBounds(363, 51, 227, 99);
		contentPane.add(btnNewButton_5);
		
	
		
		JButton btnNewButton_5_1 = new JButton("Exportar jugadores");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.ExportarJugadores().setVisible(true);
				dispose();
			}
		});
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_5_1.setBounds(363, 205, 227, 99);
		contentPane.add(btnNewButton_5_1);
		
			JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(115, -43, 459, 523);
		icon = new ImageIcon(Login.class.getResource("/vista/laligalogo.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(420,420, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_1.setIcon(icon);
		contentPane.add(lblNewLabel_1);
	}
}
