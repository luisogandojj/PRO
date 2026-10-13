import java.util.Scanner;

public class Menu {
     public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1,num2,menu;
        double resultado;
        String ciudad;


        System.out.println("Pulse un numero del 1 al 5 para un menú, a continuación se mostraran las opciones");
        System.out.println("1.- Leer un número y mostrar el doble");
        System.out.println("2.- Leer dos números y mostrar el producto");
        System.out.println("3.- Leer dos números y mostrar la suma");
        System.out.println("4.- Leer dos números y el primero elevado al segundo");
        System.out.println("5.- Leer una ciudad y la mostrará en mayúsculas");
        menu = entrada.nextInt();


       switch (menu) {
           case 1:
               System.out.println("Escriba un numero: ");
                num1 = entrada.nextInt();  
               System.out.println("El doble de este número es: " +num1*2);
            break;
            case 2:
               System.out.println("Escriba dos números: ");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
               System.out.println("El producto es: " +num1 * +num2);
            break;
            case 3:
               System.out.println("Escriba dos números");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                System.out.println("La suma es: " +(num1 + num2));
            break;
            case 4:
               System.out.println("Escriba dos números");
               num1 = entrada.nextInt();
               num2 = entrada.nextInt();
               resultado = Math.pow(num1, num2);
               System.out.println("El número elevado es: " +resultado);
            break;
            case 5:
               System.out.println("Escriba una ciudad");
               ciudad = entrada.next();
               System.out.println("Tu ciudad es: " +ciudad.toUpperCase());
            break;


           default:
               System.out.println("Número no valido");
            break;
       }


    }
}
