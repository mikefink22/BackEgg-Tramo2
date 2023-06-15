package main;

import entidad.Estudiante;
import java.util.Scanner;
import services.ServiciosEstudiantes;


public class Main {

       public static void main(String[] args) {
        // TODO code application logic here
        
           for (int i = 2; i <= 128; i*=2) {
               System.out.println("i = "+i);
           }
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de alumnos: ");
        int cantidad = leer.nextInt();
        ServiciosEstudiantes alumnos = new ServiciosEstudiantes();
        Estudiante[] estudiantes = alumnos.crearEstudiante(cantidad);
        alumnos.mostrarEstudiantes(estudiantes);
        System.out.println("La nota promedio es: "+alumnos.sumarNotas(estudiantes));
        alumnos.nombreAlumnosNotaMayorProm(estudiantes);
    }
    
}
