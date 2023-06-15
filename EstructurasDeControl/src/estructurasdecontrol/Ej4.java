/*
* Escriba un programa que pida una frase o palabra y valide si la primera letra 
* de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir 
* un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
* imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package estructurasdecontrol;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); // Creamos el Scanner
        
        System.out.println("Ingrese una cadena");
        String cadena = leer.nextLine(); // Leer una cadena
        
        
        /*Otras opciones de escribirlo:
        1)if(cadena.substring(0,1).equalsIgnoreCase("a")){
            */
        if ("A".equals(cadena.substring(0,1))) {
            
        
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        } 
    }
    
    } 


