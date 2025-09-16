import java.util.Random;

public class AleatoriedadJava {
    public static void main(String[] args) {
        Random rand = new Random();
        int total = 20;

        System.out.println("Lanzamiento de un dado:");
        for (int i = 1; i <= total; i++) {
            int dado = rand.nextInt(6) + 1; // genera entre 1 y 6
            System.out.println("Lanzamiento " + i + ": " + dado);
        }
    }
}
