/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

public class Persona {
  // Atributos privados
  private String nombre;
  private int edad;
  private double peso;
  private double altura;

  // Constructor público
  public Persona(String nombre, int edad, double peso, double altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.peso = peso;
    this.altura = altura;
  }

  // Métodos públicos
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  // Método privado
  private double calcularIMC() {
    return peso / (altura * altura);
  }
  
    // Método público para mostrar el IMC
  public double mostrarIMC() {
    return calcularIMC();
  }


}
