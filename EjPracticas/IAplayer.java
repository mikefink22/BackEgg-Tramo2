
package servicios;

import entidades.Carta;
import entidades.Jugador;
import java.util.ArrayList;

public class IAplayer {
    
    public boolean puedeLevantar(Jugador jugador, ArrayList<Carta> cartasEnMesa){
        for (Carta carta : jugador.getMisCartasEnJuego()) {
            int num = Integer.parseInt(carta.getNumero());
                if ( num > 7 ){
                    num = num - 2;
                }
            do {
                
            } while (true);
        }
        return false;
    }
}
