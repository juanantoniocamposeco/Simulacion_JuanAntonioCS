import java.util.Random;

public class ContraseñaAleatoria {
    public static void main(String[] args) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder pass = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int pos = rand.nextInt(caracteres.length());
            pass.append(caracteres.charAt(pos));
        }

        System.out.println("La Contraseña generada es: " + pass.toString());
    }
}
