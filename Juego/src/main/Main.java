/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Juego;

public class Main {
    public static void main(String[] args) {
        Juego adivinaAdivinador = new Juego();
        adivinaAdivinador.preguntarNombres();
        adivinaAdivinador.iniciar_juego();
    }
}
