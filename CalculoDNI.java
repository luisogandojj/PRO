import java.util.Scanner;

public class CalculoDNI {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dni, pos;
        char letra;
        System.out.println("Introduce el numero de tu dni sin letra: ");
        dni = entrada.nextInt();
        pos = dni % 23;
        letra = letras.charAt(pos);
        System.out.println("La letra de tu dni es: " +  letra);
    }
}
