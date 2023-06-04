package main;

import entidad.Documento;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.PersonaService;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        Documento dni = new Documento();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        persona.setNombre(nombre);
        System.out.println("Ingrese el apellido");
        persona.setApellido(leer.next());
        System.out.println("Ingrese el DNI");
        //persona.setDni(dni);
        System.out.println(persona.toString());
        

        
        PersonaService persona1 = new PersonaService();
        System.out.println("Vamos a iniciar la carga de datos.");
        ArrayList<PersonaService> personas = new ArrayList();
        String opcion = "s";
        do {
            System.out.println("Ingrese los datos de la persona");
            persona1.crearPersona();
            personas.add(persona1);
            System.out.println("¿Desea cargar más datos? Si=S");
            opcion = leer.next();
        } while (!"N".equalsIgnoreCase(opcion));
        for (PersonaService perso : personas) {
            System.out.println(perso);
        }
    }
        
    }


