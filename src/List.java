import java.util.ArrayList;
import java.util.Objects;

public class List {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList();

        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        System.out.println(lista);
        lista.remove("Elemento B");
        System.out.println(lista);
        lista.add("Elemento C");

        for (int j = 0; j < lista.size(); j++){
            System.out.println(lista.get(j));
        }
            // Convertir un array list en un array


        String array[] = new String[lista.size()];
        for (int k =0; k < lista.size(); k++){
            array[k] = lista.get(k);
            System.out.println(array[k]);
        }

        for (Object arrayObjeto: lista.toArray()){
            System.out.println(arrayObjeto.toString());
        }


    }
}
