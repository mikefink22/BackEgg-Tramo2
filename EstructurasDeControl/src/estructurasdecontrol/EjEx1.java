/*
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
su equivalente: 1 día, 2 horas.
 */
package estructurasdecontrol;

import java.util.Scanner;

public class EjEx1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos");
        int minutos = leer.nextInt();
        int horas = minutos / 60;
        int dias = (horas / 24);
        horas = (int) (horas % 24);
        minutos = (int) (minutos % 60);
        
        
        //System.out.println("Equivale a "+dias+" dias "+horas+ " horas y "+minutos+" minutos");
        if (dias != 0) {
            System.out.print("Equivale a " + dias + " días");
            if (horas == 0 && minutos != 0) {
                System.out.print(" y " + minutos + " minutos");
            }
            if (horas != 0 && minutos != 0) {
                System.out.print(", " + horas + " horas y " + minutos + " minutos");
            } else {
                System.out.print(" y " + horas + " horas.");
            }
        } else {
            if (horas == 0 && minutos != 0) {
                System.out.print("Los minutos son menos de una hora!! Es lo mismo: " + minutos + " minutos!!!");
            }
            if (horas != 0 && minutos != 0) {
                System.out.print("Equivale a " + horas + " horas y " + minutos + " minutos");
            }

        }
        System.out.println(" ");
    }
}
