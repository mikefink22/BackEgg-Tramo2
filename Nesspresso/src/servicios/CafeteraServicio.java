/*
1) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
2) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño 
de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad 
actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará 
al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
3) Método vaciarCafetera(): pone la cantidad de café actual en cero. 
4) Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe 
y se añade a la cafetera la cantidad de café indicada.

 */
package servicios;

import entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
//Metodo llenarCafetera()
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera() {
        Cafetera cafe1 = new Cafetera();
        System.out.println("Ingrese la capacidad de la cafetera (en mililitros)");
        cafe1.setCapacidadMaxima(leer.nextInt());
        cafe1.setCantidadActual(cafe1.getCapacidadMaxima());
        System.out.println("La cafetera está llena con "+cafe1.getCapacidadMaxima()+" ml., ¿qué desea hacer?");
        return cafe1;
    }

    public void ServirTaza(Cafetera cafe1) {
        int taza;
        System.out.println("Ingrese la capacidad de la taza en ml");
        taza = leer.nextInt();
        if (taza > cafe1.getCantidadActual()) {
            System.out.println("No hay suficiente café para llenar la taza");
            System.out.println("Se sirve lo que queda en la cafetera: " + cafe1.getCantidadActual() + " ml");
            cafe1.setCantidadActual(0);
        } else {
            cafe1.setCantidadActual(cafe1.getCantidadActual() - taza);
            System.out.println("Se llenó la taza");
            System.out.println("A la cafetera le quedan "+cafe1.getCantidadActual()+ " ml");
        }
    }

    public void vaciarCafetera(Cafetera cafe1) {
        cafe1.setCantidadActual(0);
        System.out.println("Se vació la cafetera");
    }

    public void agregarCafe(Cafetera cafe1) {
        int cantCafe;
        System.out.println("Ingrese la cantidad de café a rellenar en la cafetera");
        cantCafe = leer.nextInt();
        if (cantCafe + cafe1.getCantidadActual() <= cafe1.getCapacidadMaxima()) {
            cafe1.setCantidadActual(cantCafe + cafe1.getCantidadActual());
            System.out.println("La cafetera tiene ahora "+cafe1.getCantidadActual() +"ml");
        } else {
            System.out.println("La cantidad ingresada es mayor a la capacidad de la cafetera");
            System.out.println("por lo que se llenó hasta la capacidad máxima");
            cafe1.setCantidadActual(cafe1.getCapacidadMaxima());
            System.out.println("Se llenó la cafetera");
        }
    }

}
