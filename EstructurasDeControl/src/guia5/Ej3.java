/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dimensión del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
        int num;
        int cont;

        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 1000);
        }

        System.out.println("El vector es:");
        for (int i = 0; i < N; i++) {
            System.out.print("[ " + vector[i] + " ]");
        }
        for (int i = 0; i < N; i++) {
            cont = 0;
            for (int j = 0; j < 6; j++) {
                cont++;
                num = (int) (vector[i] / (Math.pow(10, j)));
                if (num < 1) {
                    break;
                }
            }
            System.out.println("El número " + vector[i] + " tiene " + (cont - 1) + " cifras");

        }

    }

}
