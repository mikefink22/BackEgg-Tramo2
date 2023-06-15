import entidades.Juego;

/**
 *
 * @author Hogar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego G = new Juego();
        
        G.llenarJuego();
        G.ronda();
    }
    
}
