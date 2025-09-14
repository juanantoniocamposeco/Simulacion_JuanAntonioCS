import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int secreto = rand.nextInt(50) + 1;
        int intento;

        System.out.println("Adivina el número entre 1 y 50:");
        do {
            intento = sc.nextInt();
            if (intento < secreto) {
                System.out.println("El número es mayor.");
            } else if (intento > secreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Siiii! El número era " + secreto);
            }
        } while (intento != secreto);
    }
}
