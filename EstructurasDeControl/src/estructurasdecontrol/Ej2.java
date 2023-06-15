/*
*Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
*programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
*Nota: investigar la función equals() en Java.
 */
package estructurasdecontrol;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
     String frase = leer.nextLine();
        System.out.println("La frase ingresada es "+frase);
        if (frase.equals(frase)) {
            System.out.println("Eureka!!!");
        }else{
            System.out.println("Esto es un desastre");
        }
    }
   
}
