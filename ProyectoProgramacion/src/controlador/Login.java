package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.User;

public class Login {
	
	public void checkUser(String user, String password) {
		// Recoger los usuarios
		boolean check = new modelo.Users().checkUserAndPass(user, password);
		if(check) {
			JOptionPane.showMessageDialog(null, "¡Usuario correcto!");
		}else { // Sino error
			JOptionPane.showMessageDialog(null, "¡Usuario no registrado!");
		}
	}
	
	public boolean checkUserOld(String user, String password) {
		// Recoger los usuarios
		ArrayList<User> usuarios = new modelo.Users().getAllUsers();
		// Comprobar si usuario y contraseña son correctos
		for(User usuario : usuarios) {
			if(user.equals(usuario.getUser()) && password.equals(usuario.getPassword())) {
				JOptionPane.showMessageDialog(null, "¡Usuario correcto!");
			}else { // Sino error
				JOptionPane.showMessageDialog(null, "¡Usuario no registrado!");
				return false;
			}
		}
		
		
		
		return true;
	}
	
	public void createTable(String name) {
		ArrayList<String[]> columns = new ArrayList<String[]>();
		String[] column0 = {"id", "int"};
		String[] column1 = {"user", "varchar(25)"};
		String[] column2 = {"password", "varchar(25)"};
		columns.add(column0);
		columns.add(column1);
		columns.add(column2);
		
		new modelo.Table().createTable(name, columns);
	}
	
	public void insertUser(String user, String password) {
		new modelo.Users().insertUser(user,password);
	}
	
	public void deleteUser(String user) {
		new modelo.Users().deleteUser(user);
	}
	public void insertJugador(String posicion, String jugador, String gol, String amarilla, String roja) {
		new modelo.Users().insertJugador(posicion,jugador,gol,amarilla,roja);
	}
	public void deleteJugador(String jugador) {
		new modelo.Users().deleteJugador(jugador);
	}
	public void insertJugadorSevilla(String posicion2, String jugador2, String gol2, String amarilla2, String roja2) {
		new modelo.Users().insertJugadorSevilla(posicion2,jugador2,gol2,amarilla2,roja2);
	}
	public void deleteJugadorSevilla(String jugador2) {
		new modelo.Users().deleteJugadorSevilla(jugador2);
	}
	public void insertJugadorMadrid(String posicion3, String jugador3, String gol3, String amarilla3, String roja3) {
		new modelo.Users().insertJugadorMadrid(posicion3,jugador3,gol3,amarilla3,roja3);
	}
	public void deleteJugadorMadrid(String jugador3) {
		new modelo.Users().deleteJugadorMadrid(jugador3);
	}
	public void insertJugadorBarcelona(String posicion4, String jugador4, String gol4, String amarilla4, String roja4) {
		new modelo.Users().insertJugadorBarcelona(posicion4,jugador4,gol4,amarilla4,roja4);
	}
	public void deleteJugadorBarcelona(String jugador4) {
		new modelo.Users().deleteJugadorBarcelona(jugador4);
	}
	public void insertJugadorFichero() {
		new modelo.Users().insertJugadorFichero();
	}

}
