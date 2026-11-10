import java.util.Scanner;

public class GananciasEmpresa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Tabla con las ganancias de los 12 meses del año (Valores Aleatorios)
        double[] ganancias = {1200.50, 1500.00, 1300.20, 1700.00, 1600.00, 2100.00, 
                              1900.00, 2200.00, 1750.00, 1800.00, 1950.00, 2500.00};

        
        int[] mesesDe30 = {3, 5, 8, 10};       // Abril, Junio, Septiembre, Noviembre
        int[] mesesDe31 = {0, 2, 4, 6, 7, 9, 11}; // Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre

        double total30 = 0.0;
        double total31 = 0.0;
        double totalFebrero = 0.0;

        
        for (int i = 0; i < mesesDe31.length; i++) {
            int mes = mesesDe31[i];
            total31 = total31 + ganancias[mes];
        }

        
        for (int i = 0; i < mesesDe30.length; i++) {
            int mes = mesesDe30[i];
            total30 = total30 + ganancias[mes];
        }

       
        totalFebrero = ganancias[1];

        
        System.out.println("--- Resumen de Ganancias ---");
        System.out.println("Total en los meses de 31 días: " + total31);
        System.out.println("Total en los meses de 30 días: " + total30);
        System.out.println("Total en el mes de Febrero: " + totalFebrero);
    }
}