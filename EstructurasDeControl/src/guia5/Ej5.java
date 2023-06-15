/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice 
que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas 
(o viceversa).
 */
package guia5;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        //int [] [] matriz1 = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matriz1 = {{0, 3, 9}, {-3, 0, 5}, {-9, -5, 0}};

        //llenarMatriz(matriz1);
        System.out.println("***************************");
        System.out.println("Matriz 1");
        mostrarMatriz(matriz1);
        System.out.println("***************************");
        /*System.out.println("Traspuesta Matriz 1");
        imptraspuestaMatriz(matriz1);*/
        System.out.println("***************************");
        System.out.println("Matriz 2");
        matriz2 = traspuestaMatriz(matriz1, matriz2);
        mostrarMatriz(matriz2);
        String resultado = esAntisimetrica(matriz1, matriz2);
        System.out.println(resultado);
    }

    public static void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 19 - 10);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {

        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }

    public static String esAntisimetrica(int[][] matriz1, int[][] matriz2) {
        String esAntiS;
        esAntiS = "Es Antisimétrica";
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                if ((i == 0 || j == 0 || i == matriz1.length - 1 || j == matriz1.length - 1)
                        && matriz1[i][j] != -matriz2[i][j]) {
                    esAntiS = "no es Antisimétrica";
                    break;
                }
            }
            if (esAntiS.equals("no")) {
                break;
            }
        }

        return esAntiS;
    }

    public static int[][] traspuestaMatriz(int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz2[i][j] = matriz1[j][i];

            }
        }
        return matriz2;
    }
}
