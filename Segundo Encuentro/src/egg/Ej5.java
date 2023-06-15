/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. 
 */
package egg;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int entero = leer.nextInt();
        System.out.println("El cuadrado de "+entero+" es igual a "+ Math.pow(entero, 2));
        System.out.println("El triple de "+entero+ " es igual a " +entero*3);
        System.out.println("La raiz cuadrada de " +entero + " es igual a " + Math.sqrt(entero));
       
    }
 
    
}
