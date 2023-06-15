/*
 A partir de una conocida cantidad de metros que el usuario ingresa a través del 
teclado se debe obtener su equivalente en centímetros, en milímetros y en pulgadas.
 */
package ejerciciospseint;

import java.util.Scanner;


public class C1Ej3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Conversión de metros a cm, mm y pulgadas");
        System.out.println("Ingrese la cantidad de metros a convertir");
        double metros = leer.nextDouble();
        double centimetros = metros*100;
        double milimetros = centimetros*10;
        double pulgadas = centimetros*2.54;
        System.out.println(metros+ "metros equivale a "+centimetros+" cm.");
        System.out.println(metros+ "metros equivale a "+milimetros+" mm.");
        System.out.println(metros+ "centimetros equivalen a "+pulgadas+" pulgadas.");
        
        
              
    }
}
