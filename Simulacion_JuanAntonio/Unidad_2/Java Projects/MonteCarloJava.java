import java.util.Random;

public class MonteCarloJava {
    public static void main(String[] args) {
        Random rand = new Random();
        int total = 100000;
        int dentro = 0;

        for (int i = 0; i < total; i++) {
            double x = rand.nextDouble(); // 0 <= x < 1
            double y = rand.nextDouble(); // 0 <= y < 1
            if (x*x + y*y <= 1) {
                dentro++;
            }
        }

        double pi = 4.0 * dentro / total;
        System.out.println("Aproximación de π con Monte Carlo (Java): " + pi);
    }
}
