import java.util.Scanner;

public class Invertir {
    public static void main(String[] invert){
        Scanner entrada = new Scanner(System.in);
        int num, centenas, decenas, unidades;
        int numF;
        System.out.println("Ingresa un numero: ");
        num = entrada.nextInt();
        centenas = (num / 100);
        decenas = (num / 10) % 10;
        unidades = (num % 10);
        numF = unidades*100 + decenas*10 + centenas;

        System.out.println("Tu numero invertido es: " + numF);

    }
}
