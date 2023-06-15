/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1;

import servicios.CuentaBancariaServicios;


public class Guia8Ej1 {

    public static void main(String[] args) {
        
  CuentaBancariaServicios c1= new CuentaBancariaServicios();
  c1.ingresarCuenta();
        System.out.println(c1.toString());
  
     
  
    }
    
}
