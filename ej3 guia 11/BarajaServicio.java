/*
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.

Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas).
 */
package servicio;

import entidad.Baraja;
import entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;

public class BarajaServicio {

    Baraja baraja = new Baraja();
    Carta cartas = new Carta();
    ArrayList<Carta> mazo = new ArrayList();
     String[] palos = {"espada", "oro", "basto", "copa"};
     
    public ArrayList<Carta> crearMazo() {

        for (int i = 0; i < palos.length; i++) {

            for (int j = 1; j <= 12; j++) {
                if (j == 8 || j == 9) {

                } else {
                    mazo.add(new Carta(j, palos[i]));                    
                }
            }
        }        
        return mazo;
    }

    
    public void crearBaraja() {
        baraja.setMazoCartas(mazo);
        
        System.out.println(baraja);

    }

    
    //barajar(): cambia de posición todas las cartas aleatoriamente.

    public void barajar(){
        Collections.shuffle(mazo);  
        
       // System.out.println(mazo);
    }
    
//    siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//  se haya llegado al final, se indica al usuario que no hay más cartas.
    public void siguienteCarta(){
        
        
    }
    
//    public void siguienteCarta(Baraja baraja) {
//        ArrayList<Carta> monton = baraja.getMonton();
//        if (baraja.getMazo().size() > 1) {
//            System.out.println("Se entregó " + baraja.getMazo().get(0));
//            monton.add(baraja.getMazo().remove(0));
//        } else if (baraja.getMazo().size() == 1) {
//            System.out.println("Se entregó " + baraja.getMazo().get(0));
//            monton.add(baraja.getMazo().remove(0));
//            System.out.println("No quedan más cartas");
//        } 
//    }
    
    
//    private void siguienteCarta() {
//        if (barajaN1.getMazo().size() > 1)
//        {
//            System.out.println("La carta se entrego. " + barajaN1.getMazo().get(0));
//            monton.add(barajaN1.getMazo().get(0));
//            barajaN1.getMazo().remove(0);
//        } else if (barajaN1.getMazo().size() == 1)
//        {
//            System.out.println("La carta se entrego. " + barajaN1.getMazo().get(0));
//            monton.add(barajaN1.getMazo().remove(0));
//            // otra forma de realizar el ejercicio pero solo utizando la baraja y el get
////            barajaN1.getMontonCartas().add(barajaN1.getMazo().remove(0));
//            System.out.println("NO QUEDAN MAS CARTAS!!!");
//        }
//    }
    
}
