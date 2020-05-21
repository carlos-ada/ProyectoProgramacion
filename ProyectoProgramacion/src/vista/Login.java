package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.User;
import modelo.Users;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField passwordInput;
	private JTextField userInput;
	private ImageIcon icon;
    private Image image;
    private Image modifiImage;
    private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 251);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar sesion");
		
		btnNewButton.setBounds(148, 168, 123, 23);
		panel.add(btnNewButton);
		
		/*passwordField = new JPasswordField();
		  passwordField.setBounds(95, 124, 190, 20);
		  panel.add(passwordField);*/
		passwordInput = new JTextField();
		passwordInput.setBounds(95, 124, 190, 20);
		panel.add(passwordInput);
		passwordInput.setColumns(10);
		
		userInput = new JTextField();
		userInput.setColumns(10);
		userInput.setBounds(95, 62, 190, 20);
		panel.add(userInput);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(29, 64, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContrasea.setForeground(Color.BLACK);
		lblContrasea.setBounds(10, 127, 76, 14);
		panel.add(lblContrasea);
		
		JButton btnNewButton_1 = new JButton("Insertar");
		
		btnNewButton_1.setBounds(29, 168, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		
		btnNewButton_2.setBounds(298, 168, 89, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Estadisticas Futbol");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1.setBounds(142, 0, 177, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		//lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/vista/171.png")));
		lblNewLabel_2.setBounds(39, -72, 375, 489);
		icon = new ImageIcon(Login.class.getResource("/vista/laligalogo.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(320,320, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_2.setIcon(icon);
		panel.add(lblNewLabel_2);
		
	
		
		
		// Acciones
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//		Login tbl = new Login();                  
			//	Users usr = new Users();
				String user = userInput.getText();
				String password = passwordInput.getText();
				new controlador.Login().checkUser(user, password);		
				//if (usr.checkUserAndPass(user, password)) {                        
				//Login atras1 = new Login();                        
				//atras1.setVisible(true);                         
				//setVisible(false);                                             
//} else {                         
	//JOptionPane.showMessageDialog(null, "Usuario no reconocido");  }
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * ElegirEquipo elegirequipo = new ElegirEquipo();
					elegirequipo.setVisible(true);
					dispose();
				 */
				new vista.ElegirEquipo().setVisible(true);
				dispose();
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = userInput.getText();
				String password = passwordInput.getText();
				new controlador.Login().insertUser(user, password);
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = userInput.getText();
				new controlador.Login().deleteUser(user);
			}
		});
	}
}