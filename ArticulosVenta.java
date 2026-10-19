import java.util.Scanner;

public class ArticulosVenta {
    public static void main(String[] arg) {
        Scanner entrada = new Scanner(System.in);
        String articulos;
        int unidades;
        float precio;
        double porcentaje, precioTotal, porcentajeTotal, precioFinal;
        porcentaje = 0.0;
        System.out.println("Introduce el articulo: ");
        articulos = entrada.nextLine();
        while (!articulos.equals("")) {
            System.out.println("Introduce el precio: ");
            precio = entrada.nextFloat();
            System.out.println("Introduce la cantidad: ");
            unidades = entrada.nextInt();
            entrada.nextLine(); // Limpia el buffer del falso enter
            
            if (unidades == 1) {
                porcentaje = 0.0;
                System.out.println("Precio restar por unidad es: " + porcentaje);

            } else if (unidades >= 2 && unidades <= 4) {
                porcentaje = precio * 0.10;
                System.out.println("Precio restar por unidad es: " + porcentaje);

            } else if (unidades >= 5) {
                porcentaje = precio * 0.30;
                System.out.println("Precio restar por unidad es: " + porcentaje);
            }

            precioTotal = precio * unidades;
            porcentajeTotal = porcentaje * unidades;
            precioFinal = precioTotal - porcentajeTotal;

            System.out.println("El precio final es: " + precioFinal);
            System.out.println("----------------------------------");

            System.out.println("Introduce el siguiente articulo o pulsa enter para salir: ");
            articulos = entrada.nextLine();

        }

    }
}
