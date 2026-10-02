import java.util.Scanner;

public class Caracteres {
    public static void main(String[] caracteres) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Nombre: " + nombre);

        System.out.println("Tu nombre tiene " + nombre.length() + " caracteres");
    }
}