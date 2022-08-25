import java.util.HashMap;
import java.util.Map;

public class Maps {

    // @SuppressWarnings("rawtypes")

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("clave1", 10);
        map.put("clave2", 20);
        map.put("clave3", 30);
        System.out.println(map.get("clave1"));
        System.out.println(map);
        map.remove("clave2");
        System.out.println(map);

        for (Map.Entry <String, Integer> elemento : map.entrySet()){
            System.out.println("Elemento clave, valor es: " + elemento.getKey() +" = "+elemento.getValue() );
        }


    }
}
