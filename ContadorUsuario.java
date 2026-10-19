import java.util.Scanner;

public class ContadorUsuario {
    public static void main(String[] arg) {
        Scanner entrada = new Scanner(System.in);
        int num, sumar;
        System.out.println("Introduce un numero: ");
        num = entrada.nextInt();
        sumar = 0;
        while (num != 999) {
            sumar += num;
            System.out.println("Introduce un numero: ");
            num = entrada.nextInt();

        }
        System.out.println("El resto es: " + sumar);

    }
}
