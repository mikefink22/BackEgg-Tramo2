/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Raices;

/**
 *
 * @author Rigenk
 */
public class RaicesServicio {

    Raices raiz1 = new Raices(4, -4, 0);

    public double getDiscriminante() {
        double aux1;
        aux1 = ((raiz1.getCoeficienteB() * (raiz1.getCoeficienteB()) - (4 * raiz1.getCoeficienteA() * raiz1.getCoeficienteC())));
        return aux1;
    }

    public boolean tieneRaices() {
        boolean raicesT;

        if (getDiscriminante() >= 0) {
            raicesT = true;
        } else {
            raicesT = false;
        }
        return raicesT;
    }

    public boolean tieneRaiz() {
        boolean raizT;

        if (getDiscriminante() == 0) {
            raizT = true;            
        } else {
            raizT = false;
        }
        return raizT;
    }

    public void obtenerRaices() {
        double aux;

        double r1;
        double r2;

        aux = Math.sqrt((((raiz1.getCoeficienteB() * (raiz1.getCoeficienteB()) - (4 * raiz1.getCoeficienteA() * raiz1.getCoeficienteC())))));

        r1 = ((-raiz1.getCoeficienteB() - aux) / (2 * raiz1.getCoeficienteA()));
        r2 = ((-raiz1.getCoeficienteB() + aux) / (2 * raiz1.getCoeficienteA()));

        if (tieneRaices()) {
            if (r1 == r2) {
                obtenerRaiz();
            } else {
                System.out.println("Raiz 1: " + r1);
                System.out.println("Raiz 2: " + r2);
            }
        }
    }

    public void obtenerRaiz() {
        double aux;

        aux = Math.sqrt((((raiz1.getCoeficienteB() * (raiz1.getCoeficienteB()) - (4 * raiz1.getCoeficienteA() * raiz1.getCoeficienteC())))));
        if (tieneRaiz()) {
            System.out.println("Tiene una unica raiz:  " + (-raiz1.getCoeficienteB() + aux) / (2 * raiz1.getCoeficienteA()));
        }
    }

    public void calcular() {

        if (tieneRaices()) {
            System.out.println("");
            obtenerRaices();

        } else {
            System.out.println("");
            System.out.println("No tiene raices, o no existe solución.");
        }

    }
}
