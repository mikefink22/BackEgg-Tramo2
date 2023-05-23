package main;


import entidad.Cliente;
import java.util.Scanner;
import servicios.ServiciosCliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de empleados");
        int n = leer.nextInt();
        Cliente[] cliente = new Cliente[n];
        for (int i = 0; i < cliente.length; i++) {
            System.out.println("Ingrese el nombre");
            String nombre = leer.next();
            int nºCuenta;

            System.out.println("Ingrese el saldo");
            Double saldo = leer.nextDouble();
            cliente[i] = new Cliente(nombre, saldo);
        }
        ServiciosCliente c1 = new ServiciosCliente();
        for (int i = 0; i < cliente.length; i++) {
            System.out.println(c1.mostrarDatos(cliente[i]));
        }
        System.out.println(Cliente.mostrarIdSiguiente());
                
    }

}
