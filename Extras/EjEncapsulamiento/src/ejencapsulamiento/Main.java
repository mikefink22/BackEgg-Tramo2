/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejencapsulamiento;

import entidad.Persona;

/**
 *
 * @author Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Crear un objeto de la clase Persona
    Persona persona1 = new Persona("Juan", 25, 70.0, 1.75);

    // Usar los métodos públicos de la clase Persona
    System.out.println("El nombre es: " + persona1.getNombre());
    System.out.println("La edad es: " + persona1.getEdad());
    persona1.setEdad(26);
    System.out.println("La nueva edad es: " + persona1.getEdad());

    // No se puede acceder a los atributos o métodos privados de la clase Persona
    System.out.println("El peso es: " + persona1.getPeso()); // Error
    // System.out.println("El IMC es: " + persona1.calcularIMC()); // Error
        System.out.println("El IMC es: "+persona1.mostrarIMC());
    }
    
}
