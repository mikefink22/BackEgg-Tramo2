/*
Tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
 */
package service;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarPelicula(ArrayList<Pelicula> peliculas) {
        boolean nuevo = true;
        System.out.println("Ingresando datos de película:");
        System.out.println("Ingrese el título:");
        String título = leer.next();
        System.out.println("Ingrese el nombre del director");
        String director = leer.next();
        System.out.println("Ingrese la duración en horas:");
        Integer duración = leer.nextInt();
        Pelicula pelicula = new Pelicula(título, director, duración);
        peliculas.add(pelicula);
        do {

            System.out.println("¿Desea Ingresar los datos de otra Película?");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Ingrese nombre");
                título = leer.next();
                System.out.println("Ingrese el nombre del director");
                director = leer.next();
                System.out.println("Ingrese la duración en horas:");
                duración = leer.nextInt();
                pelicula = new Pelicula(título, director, duración);
                peliculas.add(pelicula);

            } else {
                nuevo = false;
            }

        } while (nuevo);

        System.out.println(peliculas);
    }
    //Mostrar en pantalla todas las películas.
    public void mostrarPeli(ArrayList<Pelicula> peliculas){
        System.out.println("Lista de todas las películas:");
        /*for (Pelicula pelicula : peliculas) {
        System.out.println(pelicula);
        }equivalente a:*/
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
    }
   //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarPeliLarga(ArrayList<Pelicula> peliculas){
        System.out.println("");
        System.out.println("Lista de películas con duración mayor a una hora:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuración()>1) {
                System.out.println(pelicula);
            }
        }
    }
    //Ordenar las películas.
    //Creamos los comparadores en la clase Comparadores.
    public void ordenarPor(ArrayList<Pelicula> pelicula, Comparator c){
        Collections.sort(pelicula,c);
            for (Pelicula pelicula1 : pelicula) {
                System.out.println(pelicula1);
        }
        }
    }
   

