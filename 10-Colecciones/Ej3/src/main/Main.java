package main;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import service.ServiciosAlumnos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosAlumnos servAl = new ServiciosAlumnos();
        servAl.ingresarAlumno(alumnos);
        servAl.notaFinal(alumnos);
    }

}
