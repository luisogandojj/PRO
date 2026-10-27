import java.util.Scanner;

public class AdivinaLaLetra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frases;
        StringBuilder fraseoculta;
        char caracter;
        int i, intentos; 
        intentos = 0;    
        System.out.println("Introduce la frase oculta: ");
        frases = entrada.nextLine();
        
        fraseoculta = new StringBuilder();
        for (i = 0; i < frases.length(); i++) {
            if (Character.isLetter(frases.charAt(i)))
                fraseoculta.append('*');
            else
                fraseoculta.append(frases.charAt(i));
        }

        System.out.println("Introduce una letra (o '.' si quieres salir): ");
        caracter = entrada.nextLine().trim().charAt(0);

        while (caracter != '.') {
            intentos = intentos + 1; 

            int aciertos = 0;

            for (i = 0; i < frases.length(); i++) {
                if (frases.charAt(i) == caracter) {
                    fraseoculta.setCharAt(i, caracter);
                    aciertos = aciertos + 1;
                }
            }

            if (aciertos > 0) {
                System.out.println("¡Has acertado! La letra '" + caracter + "' está en la frase.");
            } else {
                System.out.println("Esa letra no es correcta.");
            }

            System.out.println("Frase actual: " + fraseoculta);

            if (fraseoculta.toString().equals(frases)) {
                System.out.println("¡Enhorabuena! Has adivinado la frase entera:");
                System.out.println(frases);
                System.out.println("¡Lo has conseguido en " + intentos + " intentos!"); 
                break;
            }

            System.out.println("Introduce otra letra (o '.' si quieres salir): ");
            caracter = entrada.nextLine().trim().charAt(0);
        }
        
        System.out.println("¡Programa finalizado!");
    }
}