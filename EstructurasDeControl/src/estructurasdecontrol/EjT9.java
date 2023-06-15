/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se 
 debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El 
 programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
 pero si el número es negativo no debe sumarse. 
 Nota: recordar el uso de la sentencia break.
 */
package estructurasdecontrol;

import java.util.Scanner;

public class EjT9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Suma = 0;
        for (int i = 0; i <= 20; i++) {
            System.out.println("Ingrese un número");
            int numero = leer.nextInt();
            if (numero == 0) {
                System.out.println("Se capturó el número cero");
                break;
            }
            if (numero > 0) {
                Suma += numero;
            }
        }
        System.out.println("La suma de los números ingresados es " + Suma);
    }
}
