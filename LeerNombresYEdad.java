import java.util.Scanner;

public class LeerNombresYEdad {
    public static void main(String[] media) {
        Scanner entrada = new Scanner(System.in);
        String nombre1, nombre2, nombre3, nombre4, nombre5;
        System.out.println("Introduce 5 nombres: ");
        nombre1 = entrada.nextLine();
        System.out.println(" Nombre: " + nombre1);
        nombre2 = entrada.nextLine();
        System.out.println(" Nombre: " + nombre2);
        nombre3 = entrada.nextLine();
        System.out.println(" Nombre: " + nombre3);
        nombre4 = entrada.nextLine();
        System.out.println(" Nombre: " + nombre4);
        nombre5 = entrada.nextLine();
        System.out.println(" Nombre: " + nombre5);

        int edad1, edad2, edad3, edad4, edad5;

        System.out.println("Introduce 5 edades: ");
        edad1 = entrada.nextInt();
        System.out.println(" Edad: " + edad1);
        edad2 = entrada.nextInt();
        System.out.println(" Edad: " + edad2);
        edad3 = entrada.nextInt();
        System.out.println(" Edad: " + edad3);
        edad4 = entrada.nextInt();
        System.out.println(" Edad: " + edad4);
        edad5 = entrada.nextInt();
        System.out.println(" Edad: " + edad5);

        System.out.println(" Nombre y edad primera persona: " + nombre1 + " y " + edad1 + " años ");
        System.out.println(" Nombre y edad segunda persona: " + nombre2 + " y " + edad2 + " años ");
        System.out.println(" Nombre y edad tercera persona: " + nombre3 + " y " + edad3 + " años ");
        System.out.println(" Nombre y edad cuarta persona: " + nombre4 + " y " + edad4 + " años ");
        System.out.println(" Nombre y edad quinta persona: " + nombre5 + " y " + edad5 + " años ");

        int resultado = edad1 + edad2 + edad3 + edad4 + edad5;

        System.out.println("Edad media de los usuarios: " + resultado / 5.0);
    }
}
