package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.User;

public class Users {
	
	public ArrayList<User> getAllUsers() {
		ResultSet resultados = conexion.EjecutarSentencia("SELECT * FROM usuarios");
		ArrayList<User> usuarios = new controlador.Helper().ResultSet2ArrayList(resultados);
		return usuarios;
	}
	
	public boolean checkUserAndPass(String user, String password) {
		ResultSet usuarioBD = conexion.EjecutarSentencia("SELECT * FROM usuarios WHERE USER='"+user+"' AND contraseña='"+password+"'");
	
		
		try {
			return usuarioBD.next();
		} catch (SQLException e) {
			return false;
		}
	}
	public void insertUser(String user, String password) {
		conexion.EjecutarUpdate("INSERT INTO usuarios (USER, contraseña) VALUES ('"+user+"', '"+password+"');");
	}
	
	public void deleteUser(String user) {
		conexion.EjecutarUpdate("DELETE FROM usuarios WHERE USER = '"+user+"';");
	}
	public void insertJugador(String posicion, String jugador, String gol, String amarilla, String roja) {
		//conexion.EjecutarUpdate("INSERT INTO `prueba2` (`Posicion`, `Jugadores`, `Goles`, `T.Amarilla`, `T.roja`) VALUES ('"+posicion+"', '"+jugador+"', "+gol+", "+amarilla+", "+roja+");");
		conexion.EjecutarUpdate("INSERT INTO `realbetis` (`Posicion`, `Jugadores`, `Goles`, `T.Amarilla`, `T.roja`) VALUES ('"+posicion+"', '"+jugador+"', "+gol+", "+amarilla+", "+roja+");");
	}
	public void deleteJugador(String jugador) {
		conexion.EjecutarUpdate("DELETE FROM `realbetis` WHERE Jugadores = '"+jugador+"';");
	}
	public void insertJugadorSevilla(String posicion2, String jugador2, String gol2, String amarilla2, String roja2) {
		conexion.EjecutarUpdate("INSERT INTO `sevilla_fc` (`Posicion`, `Jugadores`, `Goles`, `T.Amarilla`, `T.roja`) VALUES ('"+posicion2+"', '"+jugador2+"', "+gol2+", "+amarilla2+", "+roja2+");");
	}
	public void deleteJugadorSevilla(String jugador2) {
		conexion.EjecutarUpdate("DELETE FROM `sevilla_fc` WHERE Jugadores = '"+jugador2+"';");
	}
	public void insertJugadorMadrid(String posicion3, String jugador3, String gol3, String amarilla3, String roja3) {
		conexion.EjecutarUpdate("INSERT INTO `madridcf` (`Posicion`, `Jugadores`, `Goles`, `T.Amarilla`, `T.roja`) VALUES ('"+posicion3+"', '"+jugador3+"', "+gol3+", "+amarilla3+", "+roja3+");");
	}
	public void deleteJugadorMadrid(String jugador3) {
		conexion.EjecutarUpdate("DELETE FROM `madridcf` WHERE Jugadores = '"+jugador3+"';");
	}
	public void insertJugadorBarcelona(String posicion4, String jugador4, String gol4, String amarilla4, String roja4) {
		conexion.EjecutarUpdate("INSERT INTO `fcbarcelona` (`Posicion`, `Jugadores`, `Goles`, `T.Amarilla`, `T.roja`) VALUES ('"+posicion4+"', '"+jugador4+"', "+gol4+", "+amarilla4+", "+roja4+");");
	}
	public void deleteJugadorBarcelona(String jugador4) {
		conexion.EjecutarUpdate("DELETE FROM `fcbarcelona` WHERE Jugadores = '"+jugador4+"';");
	}
	public void insertJugadorFichero() {
		conexion.EjecutarUpdate("SELECT * FROM realbetis");
	}

}
