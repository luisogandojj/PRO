import java.util.Scanner;

public class MediaMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad, i, contador;
        double numeroAnterior, numeroActual, suma, media;
        
        suma = 0.0;
        contador = 0;

        System.out.println("¿Cuántos números quieres introducir?");
        cantidad = entrada.nextInt();

        if (cantidad > 0) {

            System.out.println("Introduce el número 1:");
            numeroAnterior = entrada.nextDouble();
            


            for (i = 2; i <= cantidad; i++) {
                System.out.println("Introduce el número " + i + ":");
                numeroActual = entrada.nextDouble();

                
                if (numeroActual > numeroAnterior) {
                    suma = suma + numeroActual;
                    contador = contador + 1; 
                }

                
                numeroAnterior = numeroActual;
            }

            
            if (contador > 0) {
                media = suma / contador;
                System.out.println("La media de los números que son mayores que el anterior es: " + media);
            } else {
                System.out.println("Ningún número fue mayor que el anterior.");
            }
        } else {
            System.out.println("Cantidad no válida.");
        }
    }
}