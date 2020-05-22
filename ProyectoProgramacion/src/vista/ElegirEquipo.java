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

public class ElegirEquipo extends JFrame {

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
					ElegirEquipo frame = new ElegirEquipo();
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
	public ElegirEquipo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.EstadisticasEquipo1().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 45, 123, 97);
		icon = new ImageIcon(Login.class.getResource("/vista/171.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        btnNewButton_1.setIcon(icon);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.EstadisticasEquipo2().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(10, 153, 123, 97);
		icon = new ImageIcon(Login.class.getResource("/vista/sevilla.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(80,90, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        btnNewButton_1_1.setIcon(icon);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.EstadisticasEquipo3().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2.setBounds(296, 45, 128, 97);
		icon = new ImageIcon(Login.class.getResource("/vista/madrid.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(90,90, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        btnNewButton_1_2.setIcon(icon);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.EstadisticasEquipo4().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_3.setBounds(296, 153, 128, 97);
		icon = new ImageIcon(Login.class.getResource("/vista/barcelona.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(90,90, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        btnNewButton_1_3.setIcon(icon);
		contentPane.add(btnNewButton_1_3);
		
		JLabel lblNewLabel = new JLabel("Elige tu equipo favorito");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(111, 0, 214, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Atr\u00E1s");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Login().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(0, 0, 75, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(59, -65, 375, 502);
		icon = new ImageIcon(Login.class.getResource("/vista/laligalogo.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(320,320, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_1.setIcon(icon);
		contentPane.add(lblNewLabel_1);
	}
}
