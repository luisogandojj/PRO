public class EjerciciosO2 {
    public static double mediaEdades(int[] edades) {
        int sum = 0;
        double avg;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] > 135 || edades[i] < 0)
                throw new RuntimeException("Una edad es inválida");
            sum += edades[i];
        }
        if (edades.length == 0)
            throw new ArithmeticException();
        avg = sum / (double) edades.length;
        return avg;
    }

    public static int find(String frase, char ch) {
        int i = 0;
        while (i < frase.length() && frase.charAt(i) != ch) {
            i++;
        }
        if (i < frase.length())
            return i; // salimos porque lo encontramos
        return -1; // salimos porque se acabó el string
    }
}
