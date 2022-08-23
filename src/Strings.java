public class Strings {
    public static void main(String[] args) {

        String cadena = "Hola mundo";
        String newCadena = "";
        int contVocales;

        char letra = cadena.charAt(5);
        int cadenaLen = cadena.length();
        boolean result = cadena.startsWith("hol");
        if (result) {
            System.out.println("Empieza por lo buscado");
        } else {
            System.out.println("No empieza por lo que quiero");
        }
        System.out.println(letra);
        System.out.println(cadenaLen);

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Caracter actual: " + cadena.charAt(i));
        }

        for (int i = cadena.length() - 1; i >= 0; i--) {
            newCadena = newCadena + cadena.charAt(i);
            System.out.println(newCadena);
        }

        System.out.println(cantVocales("holaaaaaaaaaa"));
    }

    public static int cantVocales(String cadena) {
        int cont = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letraActual = cadena.charAt(i);
            if (esVocal(letraActual)) cont++;
        }
        return cont;
    }
    private static boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }


}
