/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package egg;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre ");
        String nombre = leer.nextLine();
        System.out.println("Bienvenido "+ nombre);
    }
    
}
