/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
package guia5;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector (N)");
        int N = leer.nextInt();
        int[] vector = new int[N];
        int num;
        int cont = 0;
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 1000);
        }
        System.out.println("El vector es:");
        for (int i = 0; i < N; i++) {
            System.out.print("[ " + vector[i] + " ]");
        }
        System.out.println("Ingrese un numero entre 1 y 10 a buscar en el vector");

        do {
            num = leer.nextInt();
        } while (num > 10);
        
        for (int i = 0; i < N; i++) {
            if (num == vector[i]) {
                cont++;
                System.out.println("El número está dentro del vector en la posición " + i);

            }

        }
        if (cont == 0) {
            System.out.println("El número no está dentro del vector");
        }

    }

}
