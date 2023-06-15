/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicio;

/**
 *
 * @author Miguel
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cafeservicio = new CafeteraServicio();
        Cafetera cafe1 = cafeservicio.llenarCafetera();
        int opcion;
        
        do {
        System.out.println("1. Servir Taza");
        System.out.println("2. Vaciar Cafetera");
        System.out.println("3. Agregar Café a la Cafetera");
        System.out.println("4. Adiós");
        
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                cafeservicio.ServirTaza(cafe1);
                break;
            case 2:
                cafeservicio.vaciarCafetera(cafe1);
                break;
            case 3:
                cafeservicio.agregarCafe(cafe1);
                break;
            case 4:
                System.out.println("Adiós!!!");
                System.out.println("Gracias por visitarnos!");
                break;
            default:
                System.out.println("No ha ingresado una opción válida");
                        }
        } while (opcion!=4);
        
        
        }

    }


