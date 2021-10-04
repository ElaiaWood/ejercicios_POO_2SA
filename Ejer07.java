import java.util.ArrayList;
import java.util.Scanner;

public class Ejer07 {
    public Ejer07() {

    }

    public static void main(String[] args) {
        //Atributos
        Scanner s = new Scanner(System.in);
        int nNum, w = 0, datos;
        boolean condicional = true;

        ArrayList numeros = new ArrayList();

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
