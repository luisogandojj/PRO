public class BucleWhile4 {
    public static void main(String[] tabla) {
        int num = 1;
        System.out.println("Tabla de multiplicar del 4 WHILE");
        while (num <= 10) {

            System.out.println(4 + "x" + num + "=" + 4 * num);
            num++;
        }

        System.out.println("Tabla de multiplicar del 4 FOR");
        for (num = 1; num <= 10; num++)
            System.out.println(4 + "x" + num + "=" + 4 * num);
    }
}
