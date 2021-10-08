import java.util.Scanner;

//        Santiago Hirochi Cibriano Trejo
//        Christian Dayana De La Cruz López
//        Gaspar Emiliano Euan Puc
//        Elias Uriel Xool Feria

//9.- Se debe rellenar una matriz, de tal forma que su contenido sea un número que se irá
//        incrementando en una unidad por fila. Debe pedirse el número inicial, con el cual se comenzará a
//        rellenar el arreglo. Realizar el mismo procedimiento en otra matriz, para que el contenido sea un
//        número que se irá incrementando en una unidad por columna.

public class Ejer09 {

    public static void main(String[] args) {
        //Atributos
        int f, c, f2, c2, i = 0;
        int dimension,dimensionT;
        Scanner s = new Scanner(System.in);
        final int nNum, nNum2;
        int nNum1;

        //Solicitando dimension
        System.out.println("Digite la dimension de la matriz");
        dimension = s.nextInt();

        //Extendiendo la dimension para poder almacenar en dos matrices
        dimensionT= dimension*2;

        //Primera matriz
        int[][] matrizU = new int[dimensionT][dimensionT];

        //Segunda matriz
        int[][] matrizD = new int[dimensionT][dimensionT];

        //Solicitando la unidad que va ocupar la primera posicion para luego incrementar en +1
        System.out.println("Ingrese una cifra:");
        nNum1 = s.nextInt();


        //Creando matriz 1
        for (f = 0; f < dimensionT; f++) {
            for (c = 0; c < dimensionT; c++){
                if(c<dimension){
                    matrizU[f][c] = nNum1;
                } else {
                    matrizD[f][c] = nNum1;
                }
                nNum1++;
            }
        }

        //Imprimiendo la primera matriz
        System.out.print("\n");
        System.out.print("Primera matriz");
        for (f = 0; f < dimension; f++) {
            System.out.println();
            for (c = 0; c < dimension; c++) {
                System.out.print( matrizU[f][c] + " ");
            }
        }


        //Imprimiendo la segunda matriz
        System.out.println("\n");
        System.out.print("Segunda matriz");
        for (f = 0; f < dimension; f++) {
            System.out.println();
            for (c = dimension; c < dimensionT; c++) {
                System.out.print( matrizD[f][c] + " ");
            }
        }
    }
}
