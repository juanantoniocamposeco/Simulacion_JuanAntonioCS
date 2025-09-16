import java.util.Random;

public class UniformidadJava {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] frecuencias = new int[10]; // 10 intervalos (0–9)

        int total = 1000; // aqui muestra la cantidad de números a generar

        for (int i = 0; i < total; i++) {
            int numero = rand.nextInt(10); // genera numeros entre 0 y 9
            frecuencias[numero]++;
        }

        System.out.println("Distribución uniforme de 1000 números aleatorios (Java):");
        for (int i = 0; i < frecuencias.length; i++) {
            System.out.println("Número " + i + ": " + frecuencias[i] + " veces");
        }
    }
}
