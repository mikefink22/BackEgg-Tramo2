/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado 
en función de su edad y salario actual. El aumento salarial debe ser del 10% si el 
empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package main;

import entidad.Empleado;

/**
 *
 * @author Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        //Empleado empleado2 = new Empleado();
        System.out.println("Cargando datos de empleado...");
        empleado1.cargarEmpleado();
        System.out.println("Cargando datos de empleado...");
        //empleado2.cargarEmpleado();
        empleado1.calcularAumento();
        //empleado2.calcularAumento();
    }
    
}
