import java.util.Scanner;

public class Ejercicios01 {

    // public static int leerEntero(int tope){
    // int num;
    // Scanner teclado = new Scanner(System.in);
    // do {
    // num = teclado.nextInt();
    // teclado.nextLine();
    // } while (num >= tope || num < 0);
    // return num;
    // }
    public static int leerEntero(int tope) {
        return leerEntero(0, tope);
    }

    public static int leerEntero(int desde, int tope) {
        int num;
        Scanner teclado = new Scanner(System.in);
        do {
            num = teclado.nextInt();
            teclado.nextLine();
        } while (num < desde || num >= tope);
        return num;
    }
}
