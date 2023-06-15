/*
Los profesores del curso de programación de Egg necesitan llevar un registro de 
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados 
y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos 
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
* Primer trabajo práctico evaluativo 10%
* Segundo trabajo práctico evaluativo 15%
* Primer Integrador 25%
* Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final 
del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
igual al 7 de sus notas del curso.

 */
package guia5;

import java.util.Scanner;


public class EjEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos");
        int alumnos = leer.nextInt();
        int nota1TP; int nota2TP; int notaPI; int notaSI; // notas validas entre 1 y 100
        double prom [] = new double [alumnos];
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Ingrese la nota del primer práctico evaluativo del alumno "+(i+1));
            nota1TP = leer.nextInt();
            System.out.println("Ingrese la nota del segundo práctico evaluativo del alumno "+(i+1));
            nota2TP = leer.nextInt();
            System.out.println("Ingrese la nota del primer integrador del alumno "+(i+1));
            notaPI = leer.nextInt();
            System.out.println("Ingrese la nota del segundo integrador del alumno "+(i+1));
            notaSI = leer.nextInt();
            prom[i] = 0.1*nota1TP+0.15*nota2TP+0.25*notaPI+0.5*notaSI;
        }
        mostrar(prom,alumnos);
        System.out.println("------------------------");
        for (int i = 0; i < alumnos; i++) {
            if (prom[i] > 7) {
                System.out.println("Alumno "+(i+1)+ " aprobado!");
                 
            }else{
            System.out.println("Alumno "+(i+1)+ " desaprobado!");
            }
        }
    }
   public static void mostrar(double vector[], int N){
        for (int i = 0; i < N; i++) {
            System.out.println("Promedio alumno["+(i+1)+"] "+vector[i]);
                    }
     
    
    }
}
