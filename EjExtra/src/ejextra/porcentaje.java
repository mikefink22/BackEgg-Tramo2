/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class porcentaje {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double veintePorCiento;
        double saldo=10000;
        int decir;
        do {
            saldo = 0.20*saldo;
            System.out.println("El nuevo saldo es de "+saldo);
            System.out.println("Desea continuar?");
            decir = leer.nextInt();
        } while (decir>0);
        System.out.println("Programa finalizado"); 
    }
}
