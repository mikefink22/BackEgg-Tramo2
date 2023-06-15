//
 
package servicios;

import entidad.Cliente;


public class ServiciosCliente {
  public String mostrarDatos(Cliente cliente){
      return "El nombre es "+cliente.getNombre()+", su número de cuenta es "+cliente.getNºCuenta()+" y su Saldo es: "+cliente.getSaldo();
  }
  
/*public static String mostrarSiguienteId(Cliente cliente) { //como puedo hacer para que este método no tenga argumentos??
return "El siguiente id es "+cliente.getNºCuentaSig();
}*/
    
}
