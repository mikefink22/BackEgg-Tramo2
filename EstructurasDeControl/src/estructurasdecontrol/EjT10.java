/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor.
 */
package estructurasdecontrol;

import java.util.Scanner;

public class EjT10 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("Ingrese el número nº " + i);
            int numero = leer.nextInt();

            for (int j = 0; j < numero; j++) {

                System.out.print("*");

            }
            System.out.println("");
        }

    }

}
