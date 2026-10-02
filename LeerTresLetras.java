import java.util.Scanner;

public class LeerTresLetras {
    public static void main(String[] lectura) {
        Scanner entrada = new Scanner(System.in);
        String palabra, linea;
        System.out.println("Escribe tres letras separadas: ");
        palabra = entrada.next();
        System.out.println(" 1: " + palabra.charAt(0));
        palabra = entrada.next();
        System.out.println(" 2: " + palabra.charAt(0));
        palabra = entrada.next();
        System.out.println(" 3: " + palabra.charAt(0));

        System.out.println("Escribe tu linea: ");
        entrada.nextLine();
        linea = entrada.nextLine();
        System.out.println(" .- " +linea );

    }
}
