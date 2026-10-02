import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] mutiplo){
        Scanner entrada = new Scanner(System.in);
        boolean bisiesto;
        int anio;
        System.out.println("Introduce el año:" );
        anio = entrada.nextInt();
        System.out.println("Año:" + anio );

        bisiesto = (anio % 400 == 0) || (anio % 4 == 0) && (anio % 100 != 0);
        System.out.println("Bisiesto: " + bisiesto);
    }
}