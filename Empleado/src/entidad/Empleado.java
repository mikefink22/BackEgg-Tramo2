/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado 
en función de su edad y salario actual. El aumento salarial debe ser del 10% si el 
empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Empleado {

    String nombre;
    int edad;
    double salario;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void cargarEmpleado() {
        String respuesta;
        do {
            System.out.println("Datos del empleado:");
            System.out.println("Ingrese su nombre:");
            nombre = leer.next();
            System.out.println("Ingrese su edad:");
            edad = leer.nextInt();
            System.out.println("Ingrese su salario");
            salario = leer.nextDouble();
            System.out.println("Desea cargar un nuevo empleado?si/no");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("si"));

        /*System.out.println("Datos del empleado:");
        System.out.println("Ingrese su nombre:");
        nombre = leer.next();
        System.out.println("Ingrese su edad:");
        edad = leer.nextInt();
        System.out.println("Ingrese su salario");
        salario = leer.nextDouble();*/
    }

    public void calcularAumento() {
        if (edad >= 30) {
            System.out.println("El empleado " + getNombre() + " tiene " + getEdad() + " años");
            System.out.println("El aumento de salario de es de " + 0.1 * salario);
            System.out.println("Salario total " + 1.1 * salario);
        } else {
            System.out.println("El empleado " + getNombre() + " tiene " + getEdad() + " años");
            System.out.println("El aumento de salario es de " + 0.05 * salario);
            System.out.println("Salario total " + 1.05 * salario);
        }

    }

}
