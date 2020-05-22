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
		//System.out.println("INSERT INTO prueba (Jugadores, Goles, T.Amarilla, T.roja, Min Jugados) VALUES ('"+jugador+"', '"+gol+"', '"+amarilla+"', '"+roja+"', '"+minutos+"');");
		conexion.EjecutarUpdate("INSERT INTO `prueba2` (`Posicion`, `Jugadores`, `Goles`, `T.Amarilla`, `T.roja`) VALUES ('"+posicion+"', '"+jugador+"', "+gol+", "+amarilla+", "+roja+");");
	}
	public void deleteJugador(String jugador) {
		conexion.EjecutarUpdate("DELETE FROM `prueba2` WHERE Jugadores = '"+jugador+"';");
	}

}
