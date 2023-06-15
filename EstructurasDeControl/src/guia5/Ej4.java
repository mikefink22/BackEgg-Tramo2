/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5;

public class Ej4 {
    public static void main(String[] args) {
       
   
        int [][] matriz = new int[4][4];
        llenarMatriz( matriz);
        mostrarMatriz(matriz);
        System.out.println("***************************");
        traspuestaMatriz(matriz);
        
}
    public static void llenarMatriz(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random()*10+1); 
                
            }
        }
    }
    
    public static void mostrarMatriz(int [][]matriz){
      
        for (int[] fila: matriz) {
            for (int elemento:fila) { 
                System.out.print(elemento + "\t"); 
            }
            System.out.println();              
        }
    }
        
        public static void traspuestaMatriz(int[][]matriz){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[j][i]+ "\t");
                    
                } 
                System.out.println();
            }
        }
}