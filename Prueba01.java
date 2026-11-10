import java.util.Scanner;

public class Prueba01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int fila, columna;
        int i = 0;
        String palabra;
        System.out.println("Filas: ");
        fila = entrada.nextInt();
        System.out.println("Columna: ");
        columna = entrada.nextInt();
        System.out.println("Palabra: ");
        palabra = entrada.next();
        for(int f = 0; f < fila; f++){
            for(int c = 0; c < columna; c++){
                System.out.printf("%c ",palabra.charAt(i));
                i = (i +1) % palabra.length();
            }
        }
    }
}
