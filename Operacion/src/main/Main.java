
package main;

import entidad.Operacion;

/**
 *
 * @author Clinica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion primera = new Operacion();
        primera.crearOperacion();
        primera.sumar();
        primera.restar();
        primera.multiplicar();
        primera.dividir();
    }

 
}
