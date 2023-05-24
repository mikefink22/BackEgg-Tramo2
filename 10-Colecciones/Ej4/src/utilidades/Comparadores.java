/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidad.Pelicula;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> duracionMayorAMenor= (Pelicula p1, Pelicula p2) -> p2.getDuración().compareTo(p1.getDuración());
    /*equivale a:
    public static Comparator<Pelicula> duracionMayorAMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuración().compareTo(p2.getDuración());
        }
    } ;*/
    public static Comparator<Pelicula> duracionMenorAMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuración().compareTo(p1.getDuración());
        }
    } ;    // reducido equivale a: public static Comparator<Pelicula> duracionMenorAMayor= (Pelicula p1, Pelicula p2) -> p1.getDuracion().compareTo(p2.getDuracion());

      public static Comparator<Pelicula> directorAaZ = (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector()) ;      
            
            public static Comparator<Pelicula> tituloAaZ= (Pelicula p1, Pelicula p2) -> p2.getTítulo().compareTo(p1.getTítulo());
            


}
