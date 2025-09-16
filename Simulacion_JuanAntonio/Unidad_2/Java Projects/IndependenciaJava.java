import java.util.Random;

public class IndependenciaJava {
    public static void main(String[] args) {
        Random rand = new Random();
        int total = 20;

        System.out.println("Lanzamientos consecutivos de dos dados");
        for (int i = 1; i <= total; i++) {
            int dado1 = rand.nextInt(6) + 1; // dado 1
            int dado2 = rand.nextInt(6) + 1; // dado 2
            System.out.println("Par " + i + ": (" + dado1 + ", " + dado2 + ")");
        }
    }
}
