package main;

import entidad.Pelicula;
import java.util.ArrayList;
import service.ServicioPelicula;

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
        
    }
    
}
