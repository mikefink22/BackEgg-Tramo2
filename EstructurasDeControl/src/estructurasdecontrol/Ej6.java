/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre 
 por pantalla el siguiente menú:
 El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
 por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se 
 elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en 
 vez de salir del programa directamente, se debe mostrar el siguiente de confirmación: 
 ¿Está seguro que desea salir del programa (S/N)? 
 Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario 
 se vuelve a mostrar el menú.
 */
package estructurasdecontrol;

import java.util.Scanner;

public class Ej6 {

    /**
     *
     * @param args
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros positivos:");
        int num1 = 0;
        int num2 = 0;
        do {
            System.out.print("Ingrese el primer numero mayor a cero: ");
            num1 = leer.nextInt();

        } while (num1 < 0);
        do {

            System.out.print("Ingrese el segundo número mayor a cero: ");
            num2 = leer.nextInt();

        } while (num2 < 0);

        System.out.println("Primer número: " + num1);
        System.out.println("Segundo número: " + num2);

        int menu;
        String decision;
        decision = "n";
        System.out.println("|------MENU-----|");
        System.out.println("|1. Sumar       |");
        System.out.println("|2. Restar      |");
        System.out.println("|3. Multiplicar |");
        System.out.println("|4. Dividir     |");
        System.out.println("|5. Salir       |");
        System.out.println("----------------");

        do {
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Suma entre " + num1 + " y " + num2);
                    int suma = num1 + num2;
                    System.out.println("La suma es igual a " + suma);
                    break;
                case 2:
                    System.out.println("Resta entre " + num1 + " y " + num2);
                    int resta = num1 - num2;
                    System.out.println("La resta es igual a " + resta);
                    break;
                case 3:
                    System.out.println("Multiplicación entre " + num1 + " y " + num2);
                    int producto = num1 * num2;
                    System.out.println("El producto es igual a " + producto);
                    break;
                case 4:
                    System.out.println("Divisón entre " + num1 + " y " + num2);
                    int cociente = num1 / num2;
                    System.out.println("La división es igual a " + cociente);
                    break;
                case 5:
                    System.out.println("¿Desea Salir? s/n");
                    decision = leer.next();
                    if ("s".equalsIgnoreCase(decision)) {
                        break;
                    } else {
                        break;
                    }

                default:
                    System.out.println("No ha definido una opción disponible en el menú");
                    ;
            }
            System.out.println("|------MENU-----|");
            System.out.println("|1. Sumar       |");
            System.out.println("|2. Restar      |");
            System.out.println("|3. Multiplicar |");
            System.out.println("|4. Dividir     |");
            System.out.println("|5. Salir       |");
            System.out.println("----------------");
        } while ("n".equals(decision));
        System.out.println("El programa ha finalizado");
    }
}
