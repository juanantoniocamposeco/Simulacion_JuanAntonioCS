import java.util.Random;

public class LanzamientoDeDado {
    public static void main(String[] args) {
        Random rand = new Random();

        int dado = rand.nextInt(6) + 1; // 1 a 6
        System.out.println("El dado cayó en: " + dado);
    }
}
