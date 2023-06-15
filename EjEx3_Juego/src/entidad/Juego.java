/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo 
jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y 
recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina 
cuando el segundo jugador adivina el número o se queda sin intentos. Registra el número 
de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Juego {
    // Atributos
    private int numero; // El número que elige el primer jugador
    private int intentos; // El número de intentos que tiene el segundo jugador
    private String pista; // La pista que se le da al segundo jugador
    private int contador; // El número de intentos necesarios para adivinar el número
    private int cantidad; // El número de jugadores
    private Jugador[] jugadores; // El arreglo de jugadores
    private int victorias1; // El número de veces que el primer jugador ha ganado
    private int victorias2; // El número de veces que el segundo jugador ha ganado

    // Constructor
    public Juego(int cantidad) {
        // Inicializar los atributos con valores por defecto o por parámetro
        numero = 0;
        intentos = 10;
        pista = "";
        contador = 0;
        this.cantidad = cantidad;
        jugadores = new Jugador[cantidad];
        for (int i = 0; i < cantidad; i++) {
            jugadores[i] = new Jugador(); // Crear un objeto de la clase Jugador para cada posición del arreglo
        }
    }
    public void iniciar_juego() {
    // Pedir al primer jugador que elija un número
    System.out.println("Jugador 1, elige un número entre 1 y 100");
    Scanner sc = new Scanner(System.in); // Crear un objeto de la clase Scanner para leer datos por teclado
    numero = sc.nextInt(); // Leer el número por teclado y guardarlo en el atributo numero
    System.out.println("Jugador 1, has elegido el número " + numero);

    // Pedir al segundo jugador que intente adivinar el número
    System.out.println("Jugador 2, intenta adivinar el número");
    int adivinado = sc.nextInt(); // Leer el número por teclado y guardarlo en una variable local
    contador++; // Incrementar el atributo contador en uno

    // Comparar el número elegido con el número adivinado y dar una pista si no son iguales
    while (adivinado != numero && contador < intentos) { // Mientras el número no sea correcto y queden intentos
        if (adivinado < numero) { // Si el número adivinado es menor que el elegido
            pista = "más alto"; // Asignar la pista "más alto" al atributo pista
        } else { // Si el número adivinado es mayor que el elegido
            pista = "más bajo"; // Asignar la pista "más bajo" al atributo pista
        }
        System.out.println("No has acertado. La pista es: " + pista); // Mostrar la pista por pantalla
        System.out.println("Te quedan " + (intentos - contador) + " intentos"); // Mostrar los intentos restantes por pantalla
        System.out.println("Jugador 2, vuelve a intentar adivinar el número"); // Pedir al segundo jugador que vuelva a intentar
        adivinado = sc.nextInt(); // Leer el nuevo número por teclado y guardarlo en la variable local
        contador++; // Incrementar el atributo contador en uno
    }

    // Mostrar un mensaje indicando si el segundo jugador ha ganado o perdido y cuántos intentos ha necesitado
    if (adivinado == numero) { // Si el número adivinado es igual al elegido
        System.out.println("¡Has acertado! El número era " + numero); // Mostrar un mensaje de felicitación por pantalla
        System.out.println("Has necesitado " + contador + " intentos"); // Mostrar el número de intentos por pantalla
        victorias2++; // Incrementar el atributo victorias2 en uno
    } else { // Si el número adivinado no es igual al elegido
        System.out.println("Lo siento, has perdido. El número era " + numero); // Mostrar un mensaje de consuelo por pantalla
        System.out.println("Has agotado tus " + intentos + " intentos"); // Mostrar los intentos agotados por pantalla
        victorias1++; // Incrementar el atributo victorias1 en uno
    }

    // Mostrar el número de veces que cada jugador ha ganado
    System.out.println("El jugador 1 ha ganado " + victorias1 + " veces"); // Mostrar las victorias del primer jugador por
}
}
    

