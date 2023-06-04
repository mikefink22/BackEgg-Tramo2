package main;

import entidad.Alumno;
import entidad.Curso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Alumno alumno1 = new Alumno();
        List<Alumno>alumnos;
        System.out.println("Ingrese la cantidad de alumnos");
        int n = leer.nextInt();
        alumnos = new ArrayList(n);
      
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese nombre del alumno");
            String alumno = leer.next();
            System.out.println("Ingrese apellido del alumno");
            String apellido = leer.next();
           Alumno alumno1 = new Alumno(alumno,apellido);
        alumnos.add(alumno1);
        }
        
        Curso curso = new Curso();
        curso.setAlumnos(alumnos);
         
        System.out.println(curso.toString());
        System.out.println("---------");
        
    }
    
}
