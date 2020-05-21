package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ficheros {
	
	public static void escribRecordar(String jugador) {


        FileWriter escribirjugador;

        BufferedWriter buferUser;

        PrintWriter printUser;


        try {

            escribirjugador = new FileWriter("Jugadores.txt");

            buferUser = new BufferedWriter(escribirjugador);
            printUser = new PrintWriter(escribirjugador);
            escribirjugador.write(jugador);

            escribirjugador.close();
            buferUser.close();


        } catch (IOException e1) {
            System.out.println("No se ha podido escribir en el archivo.");
            e1.printStackTrace();
        }
    }

}
