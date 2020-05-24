package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ficheros {
	
	public static void escribRecordar(String jugador) {


        FileWriter escribirjugador;
        
        String linea = "";

        //BufferedWriter buferUser;

        //PrintWriter printUser;


        try {

            /*escribirjugador = new FileWriter("Jugadores.txt");

            buferUser = new BufferedWriter(escribirjugador);
            printUser = new PrintWriter(escribirjugador);
            escribirjugador.write(jugador);*/
            escribirjugador = new FileWriter("modelo\\Jugadores.txt");
            for (int i=0; i<10; i+=1) {
                linea = i+". ";
                linea = linea + "Hola\n";
                escribirjugador.write(linea);
            }

            escribirjugador.close();
            //buferUser.close();


        } catch (IOException e1) {
            System.out.println("No se ha podido escribir en el archivo.");
            e1.printStackTrace();
        }
    }

}
