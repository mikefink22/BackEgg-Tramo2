/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Rigenk
 */
public class Raices {
    
    private int coeficienteA;
    private int coeficienteB;
    private int coeficienteC;

    public Raices() {
    }

    public Raices(int coeficienteA, int coeficienteB, int coeficienteC) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }

    public int getCoeficienteA() {
        return coeficienteA;
    }

    public int getCoeficienteB() {
        return coeficienteB;
    }

    public int getCoeficienteC() {
        return coeficienteC;
    }

    public void setCoeficienteA(int coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    public void setCoeficienteB(int coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public void setCoeficienteC(int coeficienteC) {
        this.coeficienteC = coeficienteC;
    }    
    
}
