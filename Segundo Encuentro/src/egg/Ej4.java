/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package egg;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    double Grados = leer.nextDouble();
    double Farenheit = 32 + (9*Grados/5);
    System.out.println("La conversión de "+ Grados +" ºC a grados Farenheit es igual a " + Farenheit+ " ºF");   
    }
}
