package services;

import entidad.Estudiante;
import java.util.Scanner;

/*
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.

Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.

1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.

Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 */
public class ServiciosEstudiantes {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Estudiante[] crearEstudiante(int cantidad) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Estudiante estudiantes[] = new Estudiante[cantidad];

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese el nombre del estudiante nº" + i);
            String nombre = leer.next();
            System.out.println("Ingrese  la nota del estudiante nº" + i);
            double nota = leer.nextDouble();
            estudiantes[i] = new Estudiante(nombre, nota);
        }
        return estudiantes;
    }

    public void mostrarEstudiantes(Estudiante[] estudiantes) {
        //Muestro por pantalla los estudiantes cargados:
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Estudiante " + i);
            System.out.println("Nombre: " + estudiantes[i].getNombre());
            System.out.println("Nombre: " + estudiantes[i].getNota());

        }
    }

    public Double sumarNotas(Estudiante[] estudiantes) {
        Double suma = 0.0;
        for (int i = 0; i < estudiantes.length; i++) {
            suma += estudiantes[i].getNota();
        }
        Double promedioNotas = suma / estudiantes.length;
        return promedioNotas;
    }

    public void nombreAlumnosNotaMayorProm(Estudiante[] estudiantes) {
        int contador = 0;
        Double promedioNotas = sumarNotas(estudiantes);
        for (int i = 0; i < estudiantes.length; i++) {

            if (estudiantes[i].getNota() > promedioNotas) {
                contador++;
            }
        }
        String nombreAlumnos[] = new String[contador];
        contador = 0;

        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedioNotas) {
                nombreAlumnos[contador] = estudiantes[i].getNombre();
                contador++;
            }
        }
        for (String nombre : nombreAlumnos) {
            System.out.println("El alumno " + nombre + " supera la nota promedio");
        }
    }
}
