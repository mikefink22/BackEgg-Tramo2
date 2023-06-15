package main;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> perros = new ArrayList(); //nombre del Array 
        String respuesta;
        boolean ciclo = true;
        System.out.println("Ingresando razas de perros");
        System.out.println("Ingrese la raza:");
        perros.add(leer.next());

        do {
            System.out.println("desea agregar otro perro?");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Ingrese otra raza");
                perros.add(leer.next());
            } else {
                System.out.println("Saliendo del ciclo");
                ciclo = false;
            }

        } while (ciclo);
        System.out.println("-----------------------------");
        System.out.println("Listado de razas ingresadas:");

        for (String perro : perros) {
            System.out.println(perro);
        }

/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
        System.out.println("Ingrese la raza de perro a buscar:");
        String razaEsta = leer.next();
        int cont = 0;
        Iterator<String> razasPerro = perros.iterator();
        while (razasPerro.hasNext()) {
            if (razasPerro.next().equalsIgnoreCase(razaEsta)) {
                System.out.println("Eliminando " + razaEsta + " de la lista");
                razasPerro.remove();
                System.out.println("Nueva lista:");
                cont++;
                break;
            }
        }
        Collections.sort(perros);

        if (cont > 0) {
            for (String perro : perros) {
                System.out.println(perro);
            }

        } else {
            System.out.println("-------------------------------------------------------");
            System.out.println("La raza de perro ingresado no se encuentra en la lista");
            System.out.println("La lista de perros es: ");
            for (String perro : perros) {
                System.out.println(perro);
            }
        }

    }

}
