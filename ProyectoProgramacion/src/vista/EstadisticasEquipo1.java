package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bbdd.conexion;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class EstadisticasEquipo1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
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
					EstadisticasEquipo1 frame = new EstadisticasEquipo1();
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
	public EstadisticasEquipo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Estadisticas Real Betis");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(215, -5, 243, 25);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(90, 56, 443, 14);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Jugadores");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.ElegirJugador().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(435, 122, 191, 100);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atr\u00E1s");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.ElegirEquipo().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(0, 0, 75, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mostrar Estadisticas");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql = "SELECT * FROM equipos WHERE Equipos = 'Real Betis' ";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Equipos");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				model.addColumn("Goles en contra");
				
				table.setModel(model);
				
				String[] dato = new String[5];
				
				try {
					
					ResultSet result = conexion.EjecutarSentencia(sql);
					
					while (result.next()) {
						dato[0] = result.getString(1);
						dato[1] = result.getString(2);
						dato[2] = result.getString(3);
						dato[3] = result.getString(4);
						dato[4] = result.getString(5);
						model.addRow(dato);
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(26, 122, 174, 100);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Goles");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(208, 36, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("T.Amarilla");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(279, 36, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Equipo");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBounds(114, 36, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("T.Rojas");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setBounds(372, 36, 60, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("Goles en contra");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBounds(442, 36, 95, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(208, 30, 495, 275);
		icon = new ImageIcon(Login.class.getResource("/vista/171.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(220,220, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_5.setIcon(icon);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(0, 0, 657, 278);
		icon = new ImageIcon(Login.class.getResource("/vista/villamarin.jpg"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(657,520, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_6.setIcon(icon);
		contentPane.add(lblNewLabel_6);
	}
}