public class Arrays {
    public static void main(String[] args) {

        int arrayUno[] = new int[5];
        int arrayDos[] = {1, 2, 3, 4, 5};
        for (int i : arrayDos) {
            System.out.println(i);
        }

        String nombres[] = {
                "Gonzalo",
                "Delfina",
                "Ciro",
                "Benjamin"
        };

        System.out.println("Longitud del array: " + nombres.length);
        for (String i : nombres){
            System.out.println(i);
        }

        for (int i = 0; i < nombres.length; i++){
            System.out.println("Nombre actual: " + nombres[i] + "en la posicion: " + i);
        }

        int arrayBidi[][] = new int [2][4];
        arrayBidi[0][0] =1;
        arrayBidi[0][1] =2;
        arrayBidi[0][2] =3;
        arrayBidi[0][3] =4;

        arrayBidi[1][0] =10;
        arrayBidi[1][1] =20;
        arrayBidi[1][2] =30;
        arrayBidi[1][3] =40;

        int arrayBidi2 [][] = {
            {1,2,3,4},
            {10,20,30,40}
        };

        for(int j = 0; j < arrayBidi.length; j++ ){
            for (int k = 0; k < arrayBidi[j].length ; k++){
                System.out.println("Estamos en: " + j + " " + k);
                System.out.println(arrayBidi[j][k]);
            }
        }



    }
}
