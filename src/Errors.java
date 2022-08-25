import java.io.IOException;
import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 2 numeros: ");

            int numeroA = scanner.nextInt();
            int numeroB = scanner.nextInt();
        try {
            int resultado = numeroA / numeroB;
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("BOOM: excepcion es: " + e.getClass());
        } finally {
            System.out.println("Finally");
        }
        try {
            divide(4, 0);
        } catch (ArithmeticException e){
            System.out.println("AAA");
        }
    }

    public static int divide (int A, int B) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = A/B;
        } catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        return resultado;
    }
}
