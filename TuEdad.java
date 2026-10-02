/*Solicitar edad*/

import java.util.Scanner;

public class TuEdad {
    public static void main(String[] edad){
        Scanner entrada = new Scanner(System.in);
        int num;

        // Decir al usuario qué quiero que haga...
        System.out.print("Cuantos años tienes: ");
        num = entrada.nextInt();
        System.out.println(" Tienes: " + num + " años. ");
    }
}
