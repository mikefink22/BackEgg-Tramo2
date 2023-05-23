
package javaapplication6;

import entidades.Juego;
import entidades.Jugador;
import entidades.Pistola;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaApplication6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList();
        Juego juego = new Juego();
        Pistola pistola = new Pistola();
        
        System.out.println("Ingrese cantidad de jugadores: ");
        int num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            jugadores.add(new Jugador());
        }
        
        pistola.llenarRevolver();
        System.out.println(pistola.toString());
        Collections.shuffle(jugadores);
        for (Jugador jugadore : jugadores) {
            System.out.print(jugadore + " ");
        }
        System.out.println("");
        juego.llenarJuego(jugadores, pistola);
        juego.ronda();
        
    }
}
