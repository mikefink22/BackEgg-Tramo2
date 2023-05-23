package main;

import servicio.PaisesServicio;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisesServicio ps = new PaisesServicio();
        ps.cargarPaises();
        ps.mostrarPaises();
        ps.eliminarPais();
        System.out.println("");
        ps.mostrarPaises();
    }
    
}

