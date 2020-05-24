package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bbdd.conexion;
import modelo.Ficheros;

import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class Delanteros1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ImageIcon icon;
    private Image image;
    private Image modifiImage;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
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
					Delanteros1 frame = new Delanteros1();
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
	public Delanteros1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*JButton btnNewButton_2 = new JButton("Exportar Jugador");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conexion con = new conexion();
				Connection conexion = con.Conectar();
				
				Ficheros fichero = new Ficheros();
				fichero.escribRecordar("Joaquin");
			}
		});
		btnNewButton_2.setBounds(356, 290, 150, 35);
		contentPane.add(btnNewButton_2);*/
		
		JButton btnNewButton_1 = new JButton("Atr\u00E1s");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.ElegirJugador().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(0, 0, 75, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblDelanteros = new JLabel("Delanteros");
		lblDelanteros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDelanteros.setBounds(356, -2, 243, 25);
		contentPane.add(lblDelanteros);
		
		table = new JTable();
		table.setBounds(96, 56, 670, 102);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Mostrar Estadisticas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql = "SELECT * FROM realbetis WHERE Posicion IN ('DT') ";
				
				
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
		btnNewButton.setBounds(190, 182, 171, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(140, 168, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/171.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_5.setIcon(icon);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_2_1_1 = new JButton("Mostrar Estadisticas");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql = "SELECT * FROM sevilla_fc WHERE Posicion IN ('DT') ";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugadores");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				
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
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2_1_1.setBounds(190, 239, 171, 36);
		contentPane.add(btnNewButton_2_1_1);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(140, 229, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/sevilla.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(35,40, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_8.setIcon(icon);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(676, 168, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/madrid.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_6.setIcon(icon);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_3_1 = new JButton("Mostrar Estadisticas");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql = "SELECT * FROM madridcf WHERE Posicion IN ('DT') ";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugadores");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				
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
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3_1.setBounds(503, 182, 171, 36);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_4 = new JButton("Mostrar Estadisticas");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql = "SELECT * FROM fcbarcelona WHERE Posicion IN ('DT') ";
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Posicion");
				model.addColumn("Jugadores");
				model.addColumn("Goles");
				model.addColumn("T.Amarilla");
				model.addColumn("T.Roja");
				
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
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.setBounds(503, 239, 171, 36);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(676, 229, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/barcelona.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_7.setIcon(icon);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setBounds(10, 350, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/171.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_5_1.setIcon(icon);
		contentPane.add(lblNewLabel_5_1);
		
		JButton btnNewButton_3 = new JButton("Quitar Jugador");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jugador = jugadorInput.getText();
				new controlador.Login().deleteJugador(jugador);
				
				String sql = "SELECT * FROM realbetis WHERE Posicion IN ('DT') ";
				
				
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
		btnNewButton_3.setBounds(56, 359, 209, 36);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setBounds(13, 403, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/sevilla.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(35,40, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_8_1.setIcon(icon);
		contentPane.add(lblNewLabel_8_1);
		
		JButton btnNewButton_3_2 = new JButton("Quitar Jugador");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jugador2 = jugadorInput.getText();
				new controlador.Login().deleteJugadorSevilla(jugador2);
				
				String sql = "SELECT * FROM sevilla_fc WHERE Posicion IN ('DT') ";
				
				
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
		btnNewButton_3_2.setBounds(56, 406, 209, 36);
		contentPane.add(btnNewButton_3_2);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setBounds(13, 447, 75, 50);
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
				
				String sql = "SELECT * FROM madridcf WHERE Posicion IN ('DT') ";
				
				
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
		btnNewButton_3_3.setBounds(56, 452, 209, 36);
		contentPane.add(btnNewButton_3_3);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setBounds(10, 494, 75, 50);
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
				
				String sql = "SELECT * FROM fcbarcelona WHERE Posicion IN ('DT') ";
				
				
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
		btnNewButton_3_4.setBounds(56, 499, 209, 36);
		contentPane.add(btnNewButton_3_4);
		
		JLabel lblNewLabel_8_2 = new JLabel("Posicion:");
		lblNewLabel_8_2.setForeground(Color.GREEN);
		lblNewLabel_8_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8_2.setBounds(285, 410, 94, 14);
		contentPane.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel = new JLabel("Jugador:");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(285, 433, 94, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_5_2 = new JLabel("Goles:");
		lblNewLabel_5_2.setForeground(Color.GREEN);
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_2.setBounds(285, 461, 94, 14);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("T.Amarilla:");
		lblNewLabel_6_2.setForeground(Color.GREEN);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_2.setBounds(285, 491, 94, 14);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("T.Roja:");
		lblNewLabel_7_2.setForeground(Color.GREEN);
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_2.setBounds(285, 515, 94, 14);
		contentPane.add(lblNewLabel_7_2);
		
		jugadorInput = new JTextField();
		jugadorInput.setColumns(10);
		jugadorInput.setBounds(377, 428, 156, 20);
		contentPane.add(jugadorInput);
		/*userInput = new JTextField();
		userInput.setColumns(10);
		userInput.setBounds(95, 62, 190, 20);
		panel.add(userInput);*/
		
		golInput = new JTextField();
		golInput.setColumns(10);
		golInput.setBounds(377, 456, 156, 20);
		contentPane.add(golInput);
		
		amarillaInput = new JTextField();
		amarillaInput.setColumns(10);
		amarillaInput.setBounds(377, 486, 156, 20);
		contentPane.add(amarillaInput);
		
		rojaInput = new JTextField();
		rojaInput.setColumns(10);
		rojaInput.setBounds(377, 510, 156, 20);
		contentPane.add(rojaInput);
		
		posicionInput = new JTextField();
		posicionInput.setColumns(10);
		posicionInput.setBounds(377, 403, 156, 20);
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
				
				String sql = "SELECT * FROM realbetis WHERE Posicion IN ('DT') ";
				
				
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
		btnNewButton_2_1.setBounds(588, 350, 209, 36);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_2 = new JButton("Agregar Jugador del Filial");
		btnNewButton_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String posicion2 = posicionInput.getText();
				String jugador2 = jugadorInput.getText();
				String gol2 = golInput.getText();
				String amarilla2 = amarillaInput.getText();
				String roja2 = rojaInput.getText();
				new controlador.Login().insertJugadorSevilla(posicion2,jugador2, gol2, amarilla2, roja2);
				
				String sql = "SELECT * FROM sevilla_fc WHERE Posicion IN ('DT') ";
				
				
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
		btnNewButton_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2_1_2.setBounds(588, 399, 209, 36);
		contentPane.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_2_2 = new JButton("Agregar Jugador del Filial");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String posicion3 = posicionInput.getText();
				String jugador3 = jugadorInput.getText();
				String gol3 = golInput.getText();
				String amarilla3 = amarillaInput.getText();
				String roja3 = rojaInput.getText();
				new controlador.Login().insertJugadorMadrid(posicion3,jugador3, gol3, amarilla3, roja3);
				
				String sql = "SELECT * FROM madridcf WHERE Posicion IN ('DT') ";
				
				
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
		btnNewButton_2_2.setBounds(588, 447, 209, 36);
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
				
				String sql = "SELECT * FROM fcbarcelona WHERE Posicion IN ('DT') ";
				
				
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
		btnNewButton_2_3.setBounds(588, 494, 209, 36);
		contentPane.add(btnNewButton_2_3);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("");
		lblNewLabel_7_2_1.setBounds(799, 491, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/barcelona.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_7_2_1.setIcon(icon);
		contentPane.add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("");
		lblNewLabel_6_2_1.setBounds(799, 436, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/madrid.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_6_2_1.setIcon(icon);
		contentPane.add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_8_2_1 = new JLabel("");
		lblNewLabel_8_2_1.setBounds(799, 384, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/sevilla.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(35,40, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_8_2_1.setIcon(icon);
		contentPane.add(lblNewLabel_8_2_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("");
		lblNewLabel_5_2_1.setBounds(799, 336, 75, 50);
		icon = new ImageIcon(Login.class.getResource("/vista/171.png"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_5_2_1.setIcon(icon);
		contentPane.add(lblNewLabel_5_2_1);
		
	
		
		JLabel lblNewLabel_3_1 = new JLabel("Posicion");
		lblNewLabel_3_1.setForeground(Color.GREEN);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(128, 34, 75, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Jugadores");
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(248, 34, 75, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Goles");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(401, 34, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("T.Amarilla");
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(533, 34, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("T.Rojas");
		lblNewLabel_2_1.setForeground(Color.GREEN);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(662, 34, 75, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(0, 0, 874, 548);
		icon = new ImageIcon(Login.class.getResource("/vista/champions.jpeg"));
        image = icon.getImage();
        modifiImage = image.getScaledInstance(874, 548, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiImage);
        lblNewLabel_9.setIcon(icon);
		contentPane.add(lblNewLabel_9);
	}
}