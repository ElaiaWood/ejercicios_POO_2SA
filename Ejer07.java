import java.util.ArrayList;
import java.util.Scanner;

public class Ejer07 {
    public Ejer07(){

    }

    public static void main(String[] args) {
        //Atributos
        Scanner s = new Scanner(System.in);
        int nNum,w=0,datos;
        boolean condicional = true;

        ArrayList numeros = new ArrayList();

        do{
            System.out.println("Cuantos numeros desea que sea la lista?");
            nNum = s.nextInt();
            if(nNum>=10 && nNum<+100){
                while (w<nNum){
                    System.out.println((w+1)+".Ingrese un numero");
                    datos = s.nextInt();
                    if(numeros.contains(datos)){
                        System.out.println("Este numero ya esta guardado. Intente nuevamente");
                    } else{
                        numeros.add(datos);
                        System.out.println("Anotado!");
                        w++;
                    }
                }
                System.out.println("Listado de numeros: "+ numeros);
                condicional = false;
            } else {
                System.out.println("ERROR");
                System.out.println("Ingrese un numero entre el rango de 10 a 100\n");
            }

        } while (condicional);
    }
}
