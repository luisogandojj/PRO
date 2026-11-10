import java.util.Scanner;

public class CalcularMedia10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;

        System.out.println("Introduce 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            suma += numeros[i];
        }

        double media = suma / 10.0;

        boolean coincide = false;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == media) {
                coincide = true;
                break;
            }
        }

        if (coincide) {
            System.out.println("La media es " + media + " y COINCIDE con uno de los números introducidos.");
        } else {
            System.out.println("La media es " + media + " y NO COINCIDE con uno de los números introducidos.");
        }

    }

}
