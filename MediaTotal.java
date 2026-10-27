import java.util.Scanner;

public class MediaTotal {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int cnum , i;
        double num, acumulacion, media;
        acumulacion = 0;

        System.out.println("Introduce la cantidad de numeros que quieres poner: ");
        cnum = entrada.nextInt();

        for(i = 1; i <= cnum; i++){
            System.out.println("Introduce el numero: ");
            num = entrada.nextDouble();

            acumulacion = acumulacion + num;

            if (num == 0) {
                System.out.println("Este numero no esta permitido: ");
                break;
            }
        }
        System.out.println(acumulacion);
        media = acumulacion / cnum;
        System.out.println(media);
        System.out.println("Fin del programa");
    }
}