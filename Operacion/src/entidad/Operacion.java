/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
 */
package entidad;

import java.util.Scanner;

public class Operacion {

    Scanner leer = new Scanner(System.in);
    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese el primer número: ");
        numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número:");
        numero2 = leer.nextDouble();
        System.out.println("Número 1:" + numero1);
        System.out.println("Número 2:" + numero2);
    }

    public void sumar() {
        System.out.println("La suma es igual a " + (numero1 + numero2));
    }

    public void restar() {
        System.out.println("La resta es igual a " + (numero1 - numero2));
    }

    public void multiplicar() {
        System.out.println("La multiplicación es igual a " + (numero1 * numero2));
    }

    public void dividir() {
        if (numero2 == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            System.out.println("La división es igual a " + (numero1 / numero2));
        }
    }
}
