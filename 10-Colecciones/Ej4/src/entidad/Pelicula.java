/*
 Clase Pelicula con el título, director y duración de la película (en horas).
 */
package entidad;


public class Pelicula {
    private String título;
    private String director;
    private Integer duración;
    
    public Pelicula(){}

    public Pelicula(String título, String director, Integer duración) {
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

    public Integer getDuración() {
        return duración;
    }

    public void setDuración(Integer duración) {
        this.duración = duración;
    }
    @ Override
    public String toString() {
        return "Película{" + "Título: " + título + ", Director: " + director + ", Duración: " + duración + " horas"+'}';
    
}
}
