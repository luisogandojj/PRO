import java.util.Scanner;
public class Caracteres_02 {
    public static void main(String[] caracteres) {
        Scanner entrada = new Scanner(System.in);
        String nombre, nombreM;
        int diferencia;
        System.out.println("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Introduce el nombre de tu madre: ");
        nombreM = entrada.nextLine();
        diferencia = nombre.length() - nombreM.length();
        System.out.println("Tienes esta diferencia de caracteres " + diferencia);
    }

}
