package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bbdd.conexion;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class Todos1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ImageIcon icon;
    private Image image;
    private Image modifiImage;
    private JTextField jugadorInput;
	private JTextField golInput;
	private JTextField amarillaInput;
	private JTextField rojaInput;
	private JTextField posicionInput;
    private JTextField jugadorInput2;
	private JTextField golInput2;
	private JTextField amarillaInput2;
	private JTextField rojaInput2;
	private JTextField posicionInput2;
    private JTextField jugadorInput3;
	private JTextField golInput3;
	private JTextField amarillaInput3;
	private JTextField rojaInput3;
	private JTextField posicionInput3;
    private JTextField jugadorInput4;
	private JTextField golInput4;
	private JTextField amarillaInput4;
	private JTextField rojaInput4;
	private JTextField posicionInput4;

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
		setBounds(100, 100, 890, 630);
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
		
		JLabel lblEstadisticasEquipo = new JLabel("Estadisticas de todos los jugadores");
		lblEstadisticasEquipo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstadisticasEquipo.setBounds(243, -2, 330, 25);
		contentPane.add(lblEstadisticasEquipo);
		
		table = new JTable();
		table.setBounds(98, 59, 670, 211);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Mostrar Estadisticas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String sql = "SELECT * FROM realbetis";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugador");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				//model.addColumn("Min Jugados");
				
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
						//dato[5] = result.getString(6);
						model.addRow(dato);
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(171, 281, 171, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Mostrar Estadisticas");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String sql = "SELECT * FROM sevilla_fc";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugador");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				//model.addColumn("Min Jugados");
				
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
						//dato[5] = result.getString(6);
						model.addRow(dato);
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(171, 328, 171, 36);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Mostrar Estadisticas");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String sql = "SELECT * FROM madridcf";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugador");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				//model.addColumn("Min Jugados");
				
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
						//dato[5] = result.getString(6);
						model.addRow(dato);
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3.setBounds(485, 281, 171, 36);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Mostrar Estadisticas");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String sql = "SELECT * FROM fcbarcelona";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugador");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				//model.addColumn("Min Jugados");
				
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
						//dato[5] = result.getString(6);
						model.addRow(dato);
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.setBounds(485, 328, 171, 36);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(127, 270, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/171.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel.setIcon(icon);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(137, 322, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/sevilla.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(35,40, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_5.setIcon(icon);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(657, 270, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/madrid.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_6.setIcon(icon);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(657, 322, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/barcelona.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_7.setIcon(icon);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_3_1 = new JButton("Quitar Jugador");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jugador = jugadorInput.getText();
				new controlador.Login().deleteJugador(jugador);
				
				String sql = "SELECT * FROM realbetis";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugador");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				//model.addColumn("Min Jugados");
				
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
						//dato[5] = result.getString(6);
						model.addRow(dato);
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3_1.setBounds(46, 404, 209, 36);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("Quitar Jugador");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jugador2 = jugadorInput.getText();
				new controlador.Login().deleteJugadorSevilla(jugador2);
				
				String sql = "SELECT * FROM sevilla_fc";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugador");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				//model.addColumn("Min Jugados");
				
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
						//dato[5] = result.getString(6);
						model.addRow(dato);
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3_2.setBounds(46, 451, 209, 36);
		contentPane.add(btnNewButton_3_2);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setBounds(0, 395, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/171.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_5_1.setIcon(icon);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setBounds(3, 448, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/sevilla.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(35,40, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_8_1.setIcon(icon);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setBounds(3, 492, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/madrid.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_6_1.setIcon(icon);
		contentPane.add(lblNewLabel_6_1);
		
		JButton btnNewButton_3_3 = new JButton("Quitar Jugador");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jugador3 = jugadorInput.getText();
				new controlador.Login().deleteJugadorMadrid(jugador3);
				
				String sql = "SELECT * FROM madridcf";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugador");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				//model.addColumn("Min Jugados");
				
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
						//dato[5] = result.getString(6);
						model.addRow(dato);
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3_3.setBounds(46, 497, 209, 36);
		contentPane.add(btnNewButton_3_3);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setBounds(0, 539, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/barcelona.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_7_1.setIcon(icon);
		contentPane.add(lblNewLabel_7_1);
		
		JButton btnNewButton_3_4 = new JButton("Quitar Jugador");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jugador4 = jugadorInput.getText();
				new controlador.Login().deleteJugadorBarcelona(jugador4);
				
				String sql = "SELECT * FROM fcbarcelona";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugador");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				//model.addColumn("Min Jugados");
				
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
						//dato[5] = result.getString(6);
						model.addRow(dato);
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3_4.setBounds(46, 544, 209, 36);
		contentPane.add(btnNewButton_3_4);
		
		JLabel lblNewLabel_8_2 = new JLabel("Posicion:");
		lblNewLabel_8_2.setForeground(Color.GREEN);
		lblNewLabel_8_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8_2.setBounds(279, 450, 94, 14);
		contentPane.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Jugador:");
		lblNewLabel_4_1.setForeground(Color.GREEN);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(279, 473, 94, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Goles:");
		lblNewLabel_5_2.setForeground(Color.GREEN);
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_2.setBounds(279, 501, 94, 14);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("T.Amarilla:");
		lblNewLabel_6_2.setForeground(Color.GREEN);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_2.setBounds(279, 531, 94, 14);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("T.Roja:");
		lblNewLabel_7_2.setForeground(Color.GREEN);
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_2.setBounds(279, 555, 94, 14);
		contentPane.add(lblNewLabel_7_2);
		
		jugadorInput = new JTextField();
		jugadorInput.setColumns(10);
		jugadorInput.setBounds(383, 473, 156, 20);
		contentPane.add(jugadorInput);
		/*userInput = new JTextField();
		userInput.setColumns(10);
		userInput.setBounds(95, 62, 190, 20);
		panel.add(userInput);*/
		
		golInput = new JTextField();
		golInput.setColumns(10);
		golInput.setBounds(383, 501, 156, 20);
		contentPane.add(golInput);
		
		amarillaInput = new JTextField();
		amarillaInput.setColumns(10);
		amarillaInput.setBounds(383, 531, 156, 20);
		contentPane.add(amarillaInput);
		
		rojaInput = new JTextField();
		rojaInput.setColumns(10);
		rojaInput.setBounds(383, 555, 156, 20);
		contentPane.add(rojaInput);
		
		posicionInput = new JTextField();
		posicionInput.setColumns(10);
		posicionInput.setBounds(383, 448, 156, 20);
		contentPane.add(posicionInput);
		
		JButton btnNewButton_2_1 = new JButton("Agregar Jugador del Filial");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String posicion = posicionInput.getText();
				String jugador = jugadorInput.getText();
				String gol = golInput.getText();
				String amarilla = amarillaInput.getText();
				String roja = rojaInput.getText();
				new controlador.Login().insertJugador(posicion,jugador, gol, amarilla, roja);
				
				String sql = "SELECT * FROM realbetis";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugador");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				//model.addColumn("Min Jugados");
				
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
						//dato[5] = result.getString(6);
						model.addRow(dato);
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2_1.setBounds(578, 395, 209, 36);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Agregar Jugador del Filial");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String posicion2 = posicionInput.getText();
				String jugador2 = jugadorInput.getText();
				String gol2 = golInput.getText();
				String amarilla2 = amarillaInput.getText();
				String roja2 = rojaInput.getText();
				new controlador.Login().insertJugadorSevilla(posicion2,jugador2, gol2, amarilla2, roja2);
				
				String sql = "SELECT * FROM sevilla_fc";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugador");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				//model.addColumn("Min Jugados");
				
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
						//dato[5] = result.getString(6);
						model.addRow(dato);
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2_1_1.setBounds(578, 444, 209, 36);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_2 = new JButton("Agregar Jugador del Filial");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String posicion3 = posicionInput.getText();
				String jugador3 = jugadorInput.getText();
				String gol3 = golInput.getText();
				String amarilla3 = amarillaInput.getText();
				String roja3 = rojaInput.getText();
				new controlador.Login().insertJugadorMadrid(posicion3,jugador3, gol3, amarilla3, roja3);
				
				String sql = "SELECT * FROM madridcf";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugador");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				//model.addColumn("Min Jugados");
				
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
						//dato[5] = result.getString(6);
						model.addRow(dato);
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2_2.setBounds(578, 492, 209, 36);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("Agregar Jugador del Filial");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String posicion4 = posicionInput.getText();
				String jugador4 = jugadorInput.getText();
				String gol4 = golInput.getText();
				String amarilla4 = amarillaInput.getText();
				String roja4 = rojaInput.getText();
				new controlador.Login().insertJugadorBarcelona(posicion4,jugador4, gol4, amarilla4, roja4);
				
				String sql = "SELECT * FROM fcbarcelona";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugador");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				//model.addColumn("Min Jugados");
				
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
						//dato[5] = result.getString(6);
						model.addRow(dato);
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2_3.setBounds(578, 539, 209, 36);
		contentPane.add(btnNewButton_2_3);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("");
		lblNewLabel_5_2_1.setBounds(789, 381, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/171.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_5_2_1.setIcon(icon);
		contentPane.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_8_2_1 = new JLabel("");
		lblNewLabel_8_2_1.setBounds(789, 429, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/sevilla.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(35,40, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_8_2_1.setIcon(icon);
		contentPane.add(lblNewLabel_8_2_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("");
		lblNewLabel_6_2_1.setBounds(789, 481, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/madrid.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_6_2_1.setIcon(icon);
		contentPane.add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("");
		lblNewLabel_7_2_1.setBounds(789, 536, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/barcelona.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_7_2_1.setIcon(icon);
		contentPane.add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Posicion");
		lblNewLabel_3_1.setForeground(Color.GREEN);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(144, 45, 75, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Jugadores");
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(264, 45, 75, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Goles");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(417, 45, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("T.Amarilla");
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(549, 45, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("T.Rojas");
		lblNewLabel_2_1.setForeground(Color.GREEN);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(678, 45, 75, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(0, 0, 874, 589);
		icon = new ImageIcon(Login.class.getResource("/vista/champions.jpeg"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(874, 630, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_9.setIcon(icon);
		contentPane.add(lblNewLabel_9);
	}

}
