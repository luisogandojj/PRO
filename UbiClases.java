import java.util.Scanner;

public class UbiClases {
    public static void main(String[] ubi){
        Scanner entrada = new Scanner(System.in);
        int clase;
        System.out.println("Introduce el numero de tu clase: ");
        clase = entrada.nextInt();
        int pabellon = (clase / 100);
        int piso = (clase / 10) % 10;
        int aula = (clase % 10);
        if (clase < 100 || clase > 999  || pabellon == 0 || piso == 0 || aula == 0) {
            System.out.println("Tu numero no es valido");
        }
        else{
            System.out.println("EL pabellon de tu clase es el: " + pabellon);
            System.out.println("El piso de tu clase es el: " + piso);
            System.out.println("El aula es la: " + aula );
        }
    }
}
