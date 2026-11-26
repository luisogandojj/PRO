import java.util.Random;

public class Ejercicios02 {

    public static double mediaEdades(int[] edades) {
        int suma = 0;

        for (int i = 0; i < edades.length; i++) {
            if (edades[i] < 0) {
                throw new RuntimeException("Edad Negativa");
            }
            suma = suma + edades[i];
        }

        return (double) suma / edades.length;
    }

    public static int[] generarEdades(int cantidad) {
        Random random = new Random();
        int[] edades = new int[cantidad];

        for (int i = 0; i < edades.length; i++) {
            edades[i] = random.nextInt(136);
        }
        return edades;
    }

    public static void main(String[] args) {
        int[] edades = generarEdades(10);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad " + (i + 1) + ": " + edades[i]);
        }

        try {
            double media = mediaEdades(edades);
            System.out.println("La media es: " + media);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
