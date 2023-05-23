/*
Ejercicio min. 2:48 de https://www.youtube.com/watch?v=rqHBXAZ9F9k&ab_channel=pildorasinformaticas
 */
package entidad;

public class Cliente {

    private String nombre;
    private int nºCuenta;
    private double saldo;
    private static int nºCuentaSig = 1; // de este modo asigna automáticamente el número de cuenta
    //(supongo que cada cliente que es cargado es un nuevo cliente)

    public Cliente() {
    }

    public Cliente(String nombre, double saldo) {
        this.nombre = nombre;
        this.nºCuenta = nºCuentaSig;
        this.saldo = saldo;
        nºCuentaSig++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNºCuenta() {
        return nºCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getNºCuentaSig() {
        return nºCuentaSig;
    }
        
  public static String mostrarIdSiguiente() {
        return "El siguiente número de cuenta es " +nºCuentaSig;
    }
    
}


