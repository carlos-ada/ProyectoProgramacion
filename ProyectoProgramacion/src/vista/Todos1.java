package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bbdd.conexion;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Todos1 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Todos1 frame = new Todos1();
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
	public Todos1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Atr\u00E1s");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.ElegirJugador().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(0, 0, 75, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblEstadisticasEquipo = new JLabel("Estadisticas de todo el Real Betis");
		lblEstadisticasEquipo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstadisticasEquipo.setBounds(185, -2, 309, 25);
		contentPane.add(lblEstadisticasEquipo);
		
		table = new JTable();
		table.setBounds(10, 54, 670, 177);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Mostrar Estadisticas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conexion con = new conexion();
				Connection conexion = con.Conectar();
				
				String sql = "SELECT * FROM Jugadores";
				
				Statement st;
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Jugadores");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				model.addColumn("Min Jugados");
				
				table.setModel(model);
				
				String[] dato = new String[5];
				
				try {
					st = conexion.createStatement();
					
					ResultSet result = st.executeQuery(sql);
					
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
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(21, 257, 171, 65);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Jugadores");
		lblNewLabel_3.setBounds(53, 34, 75, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Goles");
		lblNewLabel_1.setBounds(194, 34, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("T.Amarilla");
		lblNewLabel_2.setBounds(323, 34, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("T.Rojas");
		lblNewLabel_2_1.setBounds(455, 34, 60, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("Min Jugados");
		lblNewLabel_4.setBounds(571, 34, 95, 14);
		contentPane.add(lblNewLabel_4);
	}

}
