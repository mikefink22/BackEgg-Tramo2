/*
Atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
Agregar constructor vacío, con parámetros, getters y setters.

 */
package entidad;


public class CuentaBancaria {
private int numCuenta;
private long dniCliente;
private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numCuenta, long dniCliente, double saldo) {
        this.numCuenta = numCuenta;
        this.dniCliente = dniCliente;
        this.saldo = saldo;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldo() {
        return saldo;
    }
@Override
    public String toString() {
        return "Cuenta Bancaria{" + "numCuenta=" + numCuenta + ", dniCliente=" + dniCliente + ", saldo=" + saldo +'}';
    }
}

    

    
