import java.io.*;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileInputStream;

public class InputOutput {
    public static void main(String[] args) throws FileNotFoundException {


        try {

            boolean ok = false;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingresa dos numero: ");
                scanner.reset();
                try {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("Numeros invalidos");
                }
            } while (!ok);
        } finally {
            System.out.println("Fin de proceso");
        }

        PrintStream info = new PrintStream("copia.txt");
        info.println("hola");







    }
}

            /*
            InputStream fichero = new FileInputStream("/etc/passwd");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
            try {
                int dato = ficheroBuffer.read();
                while (dato != -1){
                    System.out.print((char)dato);
                    dato = ficheroBuffer.read();
                }
                //for (int dato : datos){
                    //System.out.print((char)dato);
                //}
            }catch (IOException e){
                System.out.println("No se puede leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e ){
                System.out.println(e.getMessage());
            }
    }
*/
