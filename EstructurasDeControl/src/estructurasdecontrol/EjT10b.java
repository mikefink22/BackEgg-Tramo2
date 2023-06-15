/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor.
 */
package estructurasdecontrol;

import java.util.Scanner;

public class EjT10b {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int numero;
        int j = 0;

        do {
            System.out.println("Ingrese un número entre 1 y 20");
            numero = leer.nextInt();
            if (numero <= 20 && numero >= 0) {
                j++;
                System.out.print(numero + " ");
                for (int i = 0; i < numero; i++) {
                    System.out.print("*");
                }

                System.out.println("");
            } else {
                System.out.println("El numero " + numero + " ingresado no está en el intervalo");
            }
        } while (j < 4);

    }
}
