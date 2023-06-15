/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teorico;

import java.util.Scanner;
import java.lang.String;
import java.util.Date;
/**
 *
 * @author Clinica
 */
public class Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Integer objeto;
        objeto=8;
        System.out.println("Ingrese el valor a convertir en Integer");
        Integer entero1 = leer.nextInt();
        System.out.println("objeto"+"entero1");
        System.out.println(objeto+entero1);
        entero1.toString();
        System.out.println(objeto.compareTo(entero1));
        
        String numero;
        numero = "0"+5;
        System.out.println("numero: "+numero);
        String numero1;
        numero1 = Integer.toString(entero1);
        System.out.println(numero1+numero);
        
        Date fecha = new Date();
        System.out.println("la fecha es:");
        System.out.println(fecha);
        Date fecha1 = leer.
        fecha.equals(fecha1);
}

    
}
