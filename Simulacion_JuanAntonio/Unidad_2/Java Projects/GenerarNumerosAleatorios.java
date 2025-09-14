import java.util.Random;

public class GenerarNumerosAleatorios {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("10 números aleatorios entre el numero 1 y 100:");
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(100) + 1; // 1 a 100
            System.out.print(num + " ");
        }
    }
}
