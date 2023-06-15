package egg;

import java.util.Locale;
import java.util.Scanner;

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas 
+y después toda en minúsculas. 
*/

public class Ej3 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    Locale locale = new Locale("es", "ES");
    System.out.println("Escriba la frase");
    String frase = leer.nextLine();
    System.out.println(frase.toUpperCase(locale));
    System.out.println(frase.toLowerCase(locale));
    }
        
   
}
