/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */
package egg;

import java.util.Scanner;


public class Ej1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int numero2 = leer.nextInt();
        int suma = numero1+numero2;
        System.out.println("La suma entre "+numero1+" y "+numero2+" es igual a "+suma);
              
    }
    
        
    }

