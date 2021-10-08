import java.util.ArrayList;
import java.util.Scanner;

//        Santiago Hirochi Cibriano Trejo
//        Christian Dayana De La Cruz López
//        Gaspar Emiliano Euan Puc
//        Elias Uriel Xool Feria

//    7.- Elabora una clase que genere un arreglo para N números, cada uno de los cuales debe estar
//    entre 10 y 100 inclusive. A medida que se lea cada número, solo se pondrá en el arreglo si no es un
//    duplicado de un número que ya se haya leído. Considerar el caso de que los N números son
//    diferentes.

public class Ejer07 {



    public Ejer07() {

    }

    public static void main(String[] args) {
        //Atributos
        Scanner s = new Scanner(System.in);
        int nNum, w = 0, datos;
        boolean condicional = true;



        ArrayList numeros = new ArrayList();
//        int [] numeros = new int[5];

        do {
            System.out.println("Cuantos numeros desea que sea la lista?");
            nNum = s.nextInt();

            while (w < nNum) {
                System.out.println((w + 1) + ".Ingrese un numero");
                datos = s.nextInt();
                if (datos >= 10 && datos <=100) {
                    if (numeros.contains(datos)) {
                        System.out.println("Este numero ya esta guardado. Intente nuevamente");
                    } else {
                        numeros.add(datos);
                        System.out.println("Anotado!");
                        w++;
                    }
                } else {
                    System.out.println("ERROR");
                    System.out.println("Ingrese un numero entre el rango de 10 a 100\n");
                }
                condicional = false;
            }
            System.out.println("Listado de numeros: " + numeros);
        }while (condicional);



    }
}