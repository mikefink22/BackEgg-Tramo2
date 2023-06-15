/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
el promedio de n números (n>0). El valor de n se solicitará al principio del 
programa y los números serán introducidos por el usuario. Realice dos versiones 
del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package estructurasdecontrol;

import java.util.Scanner;

public class EjEx7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a ingresar:");
        int n = leer.nextInt();
        int num, cont = 0, max = 0, min = 0, suma = 0, promedio;
        while (cont < n) {
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            cont++;
            if (cont == 1) {
                max = num;
                min = num;
            }

            if (max < num) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            suma += num;
        }
        promedio = suma / n;
        System.out.println("El máximo número ingresado es " + max);
        System.out.println("El mínimo número ingresado es " + min);
        System.out.println("El promedio de los números ingresados es " + promedio);
        /* do {
        
        } while ();*/

    }

}
