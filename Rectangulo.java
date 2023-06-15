/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para
crear el rectángulo con los datos del Rectángulo dados por el usuario. También 
incluirá un método para calcular la superficie del rectángulo y un método para 
calcular el perímetro del rectángulo. Por último, tendremos un método que 
dibujará el rectángulo mediante asteriscos usando la base y la altura. Se 
deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package Entidades;

import java.util.Scanner;


public class Rectangulo {
    
    private double base;
    private double altura;
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        
    }
    
    public Rectangulo(){
        
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese la base del rectangulo");
        this.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        this.setAltura(leer.nextDouble());
    }
    public double superficie(){
        return this.getAltura() * this.getBase();
    }
    public double perimetro(){
        return (this.getBase() * this.getAltura()) * 2;
    }
    public void dibujarRectangulo(){
        for (int i = 0; i < this.getAltura(); i++) {
            for (int j = 0; j < this.getBase(); j++) {
                if (i==0 || i==this.getAltura()-1|| j == 0 || j == this.getBase()-1) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
