/*Escriba un programa en el cual se ingrese un valor límite positivo, y 
* a continuación solicite números al usuario hasta que la suma de los números 
* introducidos supere el límite inicial.
 */
package estructurasdecontrol;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo");
        int ValorLimite = leer.nextInt();
        System.out.println("El Valor Límite es " + ValorLimite);
        int suma = 0;
        do {
            System.out.println("Ingrese un número");
            int numero = leer.nextInt();
            suma += numero;
            System.out.println("Suma acumulada: "+suma);
            
        } while (suma <= ValorLimite);
        System.out.println("Se ha superado el valor límite");
    }
}
