import java.util.Scanner;

public class MasAltoYBajo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int TAM = 100; // 10
        String[] nombres = new String[TAM];
        float[] alturas = new float[TAM];
        int posMayor = 0;
        int posMenor = 0;
        for (int i = 0; i < nombres.length; i++) {
            System.err.println("Introduce el nombre de la persona " + (i + 1) + ":");
            nombres[i] = entrada.nextLine();

            System.err.println("Introduce la altura de " + nombres[i] + ":");
            alturas[i] = entrada.nextFloat();

            entrada.nextLine();
        }

        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] > alturas[posMayor]) {
                posMayor = i;
            }
            else if (alturas[i] < alturas[posMenor]) {
                posMenor = i;
            }
        }
        System.out.println("La persona más alta es: " + nombres[posMayor] + " con " + alturas[posMayor] + "m");
        System.out.println("La persona más baja es: " + nombres[posMenor] + " con " + alturas[posMenor] + "m");

        entrada.close();
    }
}