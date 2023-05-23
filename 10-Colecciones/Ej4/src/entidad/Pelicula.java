/*
 Clase Pelicula con el título, director y duración de la película (en horas).
 */
package entidad;


public class Pelicula {
    private String título;
    private String director;
    private int duración;
    
    public Pelicula(){}

    public Pelicula(String título, String director, int duración) {
        this.título = título;
        this.director = director;
        this.duración = duración;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }
    @ Override
    public String toString() {
        return "Película{" + "Título: " + título + ", Director: " + director + ", Duración: " + duración + " horas"+'}';
    
}
}
