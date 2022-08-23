
import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        System.out.println(vector);

        vector.remove(1);
        System.out.println(vector);

        System.out.println("Tamanio: " + vector.size() + " - Capacidad: " + vector.capacity());

        Vector<Integer> vector2 = new Vector(15);
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector2.add(4);
        vector2.add(5);
        vector2.add(6);
        vector2.add(7);
        vector2.remove(1);

        System.out.println("Tamanio: " + vector2.size() + " - Capacidad: " + vector2.capacity());
        vector2.trimToSize();
        System.out.println("Tamanio: " + vector2.size() + " - Capacidad: " + vector2.capacity());

        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales? " + resultado);

        /*for (int i : vector){
            System.out.println("Valor actual del vector: " + i);
        }*/
        for (int i = 0; i < vector.size(); i++){
            if(i % 2 == 0) {
                vector.remove(i);
            }
        }
        System.out.println(vector);

    }
}
