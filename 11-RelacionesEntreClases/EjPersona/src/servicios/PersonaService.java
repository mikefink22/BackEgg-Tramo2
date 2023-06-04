/*
 
 * and open the template in the editor.
 */
package servicios;

import entidad.Persona;
import java.util.Scanner;



public class PersonaService {
    Persona persona = new Persona();
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    
    public void crearPersona(){
        System.out.println("Ingrese el nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        persona.setApellido(leer.next());
        System.out.println("Ingrese la serie y número del DNI");
        persona.setDocumento(leer.next(),leer.nextInt());
           
}

    @Override
    public String toString() {
        return "PersonaService{" + "persona=" + persona +  '}';
    }
}
