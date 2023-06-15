/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 */
package estructurasdecontrol;

import java.util.Scanner;


public class Ej8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimensión del cuadrado");
        int lado = leer.nextInt();
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i==0 || i == lado-1 || j == 0 || j == lado-1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
       
}
