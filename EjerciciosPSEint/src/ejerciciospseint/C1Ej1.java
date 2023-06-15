/*
Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio de
una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para
calcular el área y el perímetro se utilizan las siguientes fórmulas:
 */
package ejerciciospseint;

import java.util.Scanner;


public class C1Ej1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cálculo del Perímetro y Área de un Círculo");
        System.out.println("------------------------------------------");
        System.out.println("Ingrese el Radio");
        double Radio = leer.nextDouble();
        double Area = Math.PI*Math.pow(Radio, 2);
        System.out.println(Area);
        double Perimetro = 2*Math.PI*Radio;
        System.out.println(Perimetro);
    }
    
}
