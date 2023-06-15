/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package estructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author Clinica
 */
public class EjEx3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") 
                || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("Es una vocal!");
        }else{
            System.out.println("No es una vocal");
        }
        
    }
    
}
