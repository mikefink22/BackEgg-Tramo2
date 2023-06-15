
package ejerciciosextra;
        
import java.util.Random;

public class GenerarVectorAleatorio {
    public static void main(String[] args) {
        int[] vector = new int[100];
        Random random = new Random();

        for (int i = 0; i < vector.length; i++) {
            int numeroAleatorio = random.nextInt(99999) + 1;
            vector[i] = numeroAleatorio;
        }

        System.out.println("Vector generado:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
