/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
de tamaño N, con los valores ingresados por el usuario.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Clinica
 */
public class EjEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int [] vector = new int [N];
        int suma=0;
        System.out.println("Ingrese los valores del vector");
        for (int i = 0; i < N; i++) {
            vector[i] = leer.nextInt();          
            suma += vector[i];            
        }
        System.out.println("La suma de los valores ingresados es "+suma);
    }
    
}
