/*
1)Método para crear cuenta pidiéndole los datos al usuario.
2)Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará 
al saldo actual.
3)Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará 
el máximo posible hasta dejar la cuenta en 0.
4)Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que 
el usuario no saque más del 20%.
5)Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
6)Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package servicios;

import entidad.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicios {
    public CuentaBancaria ingresarCuenta() {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese su n° de cuenta");
        int cuenta= leer.nextInt();
        System.out.println("ingrese su DNI");
        long dni=leer.nextLong();
        System.out.println("ingrese su saldo");
        double saldo=leer.nextDouble();  
        System.out.println("su saldo es " + saldo);
        return new CuentaBancaria(cuenta, dni, saldo);
       }
public void ingresar(CuentaBancaria Cuenta){

}
  
}
