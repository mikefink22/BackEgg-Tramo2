/*
Escribir un programa que calcule el precio promedio de un producto. El precio promedio se
debe calcular a partir del precio del mismo producto en tres establecimientos distintos.
 */
package ejerciciospseint;

import java.util.Scanner;


public class C1Ej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio en Comercio 1");
        double Precio1 = leer.nextDouble();
        System.out.println("Ingrese el precio en Comercio 2");
        double Precio2 = leer.nextDouble();
        System.out.println("Ingrese el precio en Comercio 3");
        double Precio3 = leer.nextDouble();
        double Promedio = (Precio1+Precio2+Precio3)/3;
        System.out.println(Promedio);
    }
    
}
