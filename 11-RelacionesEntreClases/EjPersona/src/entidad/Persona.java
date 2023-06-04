/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package entidad;

import java.util.Scanner;


public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private String apellido;
    private Documento dni;
    
    

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;        
    }

    public Persona() {
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Documento getDni() {
        return dni;
    }

    public void setDocumento(String serie, int numero) {
        /*System.out.println("Ingrese la Serie");
        dni.setSerie(leer.next());
        System.out.println("Ingrese el número");
        dni.setNumero(leer.nextInt());
        
        this.dni = dni;*/
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
}
