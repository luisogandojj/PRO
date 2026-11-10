import java.util.Scanner;

public class InvertirOrden {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador;
        double[] numeros;
        numeros = new double[10];
        for (contador = 0; contador < 10; contador++) {
            System.out.println("Escribe un número");
            numeros[contador] = entrada.nextDouble();
        }
        System.out.println("Los números en orden inverso son:");


        for (contador = 9; contador >= 0; contador--) {
            System.out.println(numeros[contador]);
        }
    }

}
