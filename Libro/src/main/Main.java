/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Libro;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Libro libro1 = new Libro();
        Libro libro2 = new Libro(100,"La Isla del Tesoro","R. L. Stevenson",350);
        System.out.println("El libro 2 es " + libro2.getTitulo());
        System.out.println("El autor del libro2 es "+libro2.getAutor());
        System.out.println("Ingrese el título del libro 1: ");
        String Titulo1 = leer.nextLine();
        libro1.setTitulo(Titulo1);
        System.out.println("El título del libro 1 es "+libro1.getTitulo());
        System.out.println("Y tiene "+libro1.getPaginas() + "páginas");
               
        }
   
}
