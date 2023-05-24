package main;

import entidad.Pelicula;
import java.util.ArrayList;
import service.ServicioPelicula;
import utilidades.Comparadores;

/*

 */
public class Main {

  
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Pelicula> peliculas = new ArrayList();
        ServicioPelicula servPeli = new ServicioPelicula(); 
        servPeli.cargarPelicula(peliculas);
        servPeli.mostrarPeli(peliculas);
        servPeli.mostrarPeliLarga(peliculas);
        System.out.println("Películas ordenadas de acuerdo a su duración (de Mayor a Menor)");
        servPeli.ordenarPor(peliculas, Comparadores.duracionMayorAMenor);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Películas ordenadas de acuerdo a su duración (de Menor a Mayor)");
        servPeli.ordenarPor(peliculas, Comparadores.duracionMenorAMayor);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Películas ordenadas alfabéticamente de acuerdo a su título:");
        servPeli.ordenarPor(peliculas, Comparadores.tituloAaZ);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Películas ordenadas alfabéticamente de acuerdo a su Director:");
        servPeli.ordenarPor(peliculas, Comparadores.directorAaZ);

        
    }
    
}
