import java.util.Scanner;

public class BuscarAltura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        float[] alturas = {1.65f, 1.75f, 1.80f, 1.75f, 1.60f, 1.90f};
        String[] nombres = {"Ana", "Carlos", "Elena", "David", "Lucía", "Mateo"};


        System.out.println("Introduce una altura límite (ej. 1.78):");
        float alturaBuscada = entrada.nextFloat();

        float mayorAlturaEncontrada = -1.0f;
        int indiceEncontrado = -1;


        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] <= alturaBuscada) {
                if (alturas[i] > mayorAlturaEncontrada) {
                    mayorAlturaEncontrada = alturas[i];
                    indiceEncontrado = i;
                }
            }
        }

        
        if (indiceEncontrado != -1) {
            System.out.println("La persona más alta que no sobrepasa los " + alturaBuscada + " metros es:");
            System.out.println("Nombre: " + nombres[indiceEncontrado] + " (Altura: " + alturas[indiceEncontrado] + "m)");
        } else {
            System.out.println("No se ha encontrado ninguna persona con una altura menor o igual a " + alturaBuscada + ".");
        }
    }
}