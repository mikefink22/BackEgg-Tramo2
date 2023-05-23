/*
package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
 * calcular su nota final y se lo busca en la lista de Alumnos. Si está en la
 * lista, se llama al método. Dentro del método se usará la lista notas para
 * calcular el promedio final de alumno. Siendo este promedio final, devuelto
 * por el método y mostrado en el main.
 *
 * @author Joel Gonzalez
 
public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos = new ArrayList();

    public void cargarAlumnos() {
        String opcion;
        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();
            ArrayList<Integer> notas = new ArrayList();
            int nota;
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese nota del alumno");
                nota = leer.nextInt();
                notas.add(nota);
            }
            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);

            System.out.println("¿Desea crear otro alumno?(S/N)");
            opcion = leer.next();
            while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                System.out.println("Ha ingresado una opcion invalida. Intente de nuevo.");
                System.out.println("¿Desea crear otro alumno?(S/N)");
                opcion = leer.next();
            }
        } while (opcion.equalsIgnoreCase("S"));

    }

    public void buscarAlumno() {

        System.out.println("Ingrese el alumno que desea buscar para calcular su nota final");
        String nombre = leer.next();
        boolean encontrado = false;
        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()) {
            Alumno alumno = it.next();
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                notaFinal(nombre);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un alumno con ese nombre.");
        }
    }

    public void notaFinal(String nombre) {
        Iterator<Alumno> it = alumnos.iterator();
        Alumno alumno = it.next();
        double promedio = 0;
        ArrayList<Integer> notas = alumno.getNotas();

        for (int i = 0; i < notas.size(); i++) {
            promedio = promedio + notas.get(i);
        }

        promedio = promedio / notas.size();
        System.out.println("La nota final de " + nombre + " es: " + promedio);
    }
}

*/