import java.util.InputMismatchException;

public class Principal01 {
    public static void main (String[] args){
        boolean termina;
        do{
        try{
            System.out.println("Retorna: " + Ejercicios01.leerEntero(10));
            termina = true;
        } catch(InputMismatchException e){
            System.out.println("El dato no se corresponde con un numero");
            termina = false;
        } catch(Exception e){
            System.out.println("ERROR: Problemas en la aplicación");
            termina = false;
        }
        
    } while(!termina);
    }
}
