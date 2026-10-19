public class Contador {
    public static void main(String[] arg){
        int num, sumar;
        System.out.println("Los numeros son:");
        num = 1;
        sumar = 0;
        while (num<=10) {
            System.out.println(num);
            sumar = sumar + num;
            num++;
            
        }
        System.out.println("Su suma total es: " + sumar  );
    }
}
