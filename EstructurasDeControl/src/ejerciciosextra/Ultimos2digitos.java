/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author Clinica
 */
public class Ultimos2digitos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número de 8 cifras");
        int numero = leer.nextInt();
        int resto = numero%10000;
        System.out.println(resto);
    }
}
