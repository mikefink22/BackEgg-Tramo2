/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 
de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de 
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
imprimir “INCORRECTO”. Nota: investigar la función Length() en Java.
 */
package estructurasdecontrol;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        int longitud = frase.length();
        System.out.println("La longitud es de "+longitud+" nueve letras");
        System.out.println("La frase ingresada es " + frase);
        if (frase.length()==8) {
            System.out.println("SI!! Tiene 8 caracteres");
        } else {
            System.out.println("No tiene 8 caracteres");
        }
    }

}
