/*
* Una obra social tiene tres clases de socios:
* - Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
* en todos los tipos de tratamientos.
* - Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
* para los mismos tratamientos que los socios del tipo A.
* - Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
* dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un 
valor real que represente el costo del tratamiento (previo al descuento) y determine 
el importe en efectivo a pagar por dicho socio.

 */
package estructurasdecontrol;

import java.util.Scanner;

public class EjEx5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String tipoCliente;
        double total;
        double totalDescuento = 0;
                
        System.out.println("A(50%) - B(35%) - C(cuack)" );
        tipoCliente = leer.next();
        tipoCliente = tipoCliente.toUpperCase();
        
        System.out.println("Costo Tratamiento: ");
        total = leer.nextFloat();
        
        switch (tipoCliente) {
            case "A":
                totalDescuento = total - total*0.5;
                break;
            case "B":
                totalDescuento = total - total*0.35;
                break;
            case "C":
                totalDescuento = total;
                break;
        }
        
        System.out.println("Tipo cliente : " + tipoCliente);
        System.out.println("Total c/descuento: " + totalDescuento);
        
        
    }
}


