/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;


public class Juego {
    private String nombreJugador1, nombreJugador2;
    private int intentosMaximos, intentosJugador2, numeroJugador1, numeroJugador2, contadorJugador1, contadorJugador2;

    public String getNombreJugador1() {
        return nombreJugador1;
    }

    public void setNombreJugador1(String nombreJugador1) {
        this.nombreJugador1 = nombreJugador1;
    }

    public String getNombreJugador2() {
        return nombreJugador2;
    }

    public void setNombreJugador2(String nombreJugador2) {
        this.nombreJugador2 = nombreJugador2;
    }

    public int getIntentosMaximos() {
        return intentosMaximos;
    }

    public void setIntentosMaximos(int intentosMaximos) {
        this.intentosMaximos = intentosMaximos;
    }

    public int getIntentosJugador2() {
        return intentosJugador2;
    }

    public void setIntentosJugador2(int intentosJugador2) {
        this.intentosJugador2 = intentosJugador2;
    }

    public int getNumeroJugador1() {
        return numeroJugador1;
    }

    public void setNumeroJugador1(int numeroJugador1) {
        this.numeroJugador1 = numeroJugador1;
    }

    public int getNumeroJugador2() {
        return numeroJugador2;
    }

    public void setNumeroJugador2(int numeroJugador2) {
        this.numeroJugador2 = numeroJugador2;
    }

    public int getContadorJugador1() {
        return contadorJugador1;
    }

    public void setContadorJugador1(int contadorJugador1) {
        this.contadorJugador1 = contadorJugador1;
    }

    public int getContadorJugador2() {
        return contadorJugador2;
    }

    public void setContadorJugador2(int contadorJugador2) {
        this.contadorJugador2 = contadorJugador2;
    }

    public Juego(String nombreJugador1, String nombreJugador2, int intentosMaximos, int intentosJugador2, int numeroJugador1, int numeroJugador2, int contadorJugador1, int contadorJugador2) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
        this.intentosMaximos = intentosMaximos;
        this.intentosJugador2 = intentosJugador2;
        this.numeroJugador1 = numeroJugador1;
        this.numeroJugador2 = numeroJugador2;
        this.contadorJugador1 = contadorJugador1;
        this.contadorJugador2 = contadorJugador2;
    }

    public Juego() {
    }
    public void preguntarNombres() {
        System.out.println("Jugador 1 \n Ingrese su nombre por favor");
        setNombreJugador1(leer.nextLine());
        System.out.println("Jugador 2 \n Ingrese su nombre por favor");
        setNombreJugador2(leer.nextLine());
    }

   

    Scanner leer = new Scanner(System.in);
    public void iniciar_juego() {        
        numeroJugador1 = 0;
        numeroJugador2 = 0;        
        contadorJugador1 = 0;
        contadorJugador2 = 0;
        intentosJugador2 = 0;
        System.out.println("Ingrese la cantidad de intentos maximos");
        setIntentosMaximos(leer.nextInt());
        System.out.println(nombreJugador1 + " inserte un numero a adivinar.");
        setNumeroJugador1(leer.nextInt());
        do {
            System.out.println(nombreJugador2 + " di un numero");
            setNumeroJugador2(leer.nextInt());
            intentosJugador2++;
            if (numeroJugador2 < numeroJugador1) {
                System.out.println("Más Alto!");
            }   else if (numeroJugador2 > numeroJugador1) {
                System.out.println("Más Bajo");
            }   else if (numeroJugador2 == numeroJugador1) {
                System.out.println("Felicidades " + nombreJugador2 + " ¡Adivinaste! con " + intentosJugador2 + " intentos.");
                contadorJugador2++;
                continuar_jugando();
            }
        }   while (intentosJugador2 < intentosMaximos);
        if (numeroJugador1 != numeroJugador2) {
            System.out.println("Felicidades " + nombreJugador1 + " ¡Ganaste!");
            contadorJugador1++;
        }
        //continuar_jugando();
        }
    public void continuar_jugando() {
    System.out.println("¿Desean continuar jugando? (S/N)");
    String respuesta = leer.next().toUpperCase();
    if (respuesta.equals("S")) {
        iniciar_juego();
    }   else {
        if (contadorJugador1 < contadorJugador2) {
            System.out.println(nombreJugador2 + " Ganaste " + contadorJugador2 + " el juego.");
        }   else if (contadorJugador2 > contadorJugador1) {
            System.out.println(nombreJugador1 + " Ganaste " + contadorJugador1 + " el juego.");
        }   else if (contadorJugador1 == contadorJugador2) {
            System.out.println("Es un empate!");
        }
        
    }
        System.out.println(nombreJugador1 + " Ganaste " + contadorJugador1 + " rondas.");
        System.out.println(nombreJugador2 + " Ganaste " + contadorJugador2 + " rondas.");
        System.out.println("Gracias por jugar");
        
    
}
}
