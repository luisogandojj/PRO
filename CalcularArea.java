import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] area) {
        Scanner entrada = new Scanner(System.in);
        float altura, base;
        System.out.println("Introduce la Altura:");
        altura = entrada.nextFloat();
        System.out.println("Altura: " + altura);
        System.out.println("Introduce la Base:");
        base = entrada.nextFloat();
        System.out.println("Base: " + base);
        double resultado = altura * base / 2;
        System.out.println("El resultado del area es:" + resultado);
    }
}
