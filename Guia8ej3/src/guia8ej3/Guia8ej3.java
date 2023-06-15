/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos 
todos los métodos para cada objeto, deberá comprobar si la persona está en su peso 
ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto 
si la persona es mayor de edad.
 */
package guia8ej3;

import entidad.Persona;
import java.util.Scanner;
import servicios.PersonaServicios;

public class Guia8ej3 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      PersonaServicios p1 = new PersonaServicios();
      System.out.println("¿Cuántas personas desea cargar?");
      int cantidad = leer.nextInt();
        
      Persona persona1 = p1.crearPersona();
      p1.mostrarPersona(persona1);
      if (p1.esMayorDeEdad(persona1)){
            System.out.println("es mayor de edad");
      }else {
          System.out.println("es menor de edad");}
      p1.calcularIMC(persona1);
    }
    
}
