import java.util.Locale;
import java.util.Scanner;

//        Santiago Hirochi Cibriano Trejo
//        Christian Dayana De La Cruz López
//        Gaspar Emiliano Euan Puc
//        Elias Uriel Xool Feria

//8.- Se proporcionan N nombres que se encuentran cada uno en un arreglo de objetos String. Se
//        desea: a) imprimir el nombre en mayúsculas, b) imprimir el nombre en minúsculas, c) cambiar las
//        vocales de cada nombre por “X”, d) cambiar los espacios en blanco por “+”, e) imprimir cada una de
//        las respuestas halladas.


public class Ejer08 {
    public Ejer08(){

    }

    public static void main(String[] args) {
        //Atributos
        Scanner s = new Scanner(System.in);
        int nNombres;

        //Llave
        Ejer08 Day = new Ejer08();

        //Solicitar n nombres
        System.out.println("Cuantos nombres le gustaria ingresar:");
        nNombres = s.nextInt();

        //Creando el arreglo de nombres
        String [] nombres = new String[100000];

        //Ingresando nombres
        for(int i=0; i < nNombres; i++){
            System.out.println((i+1)+".Ingrese el nombre:");
            nombres[i] = s.next();
        }

        System.out.println("");
        System.out.print("Nombres ingresados: ");
        for (int i=0; i <nNombres;i++){
            System.out.print((i+1)+"."+nombres[i]+ " ");
        }
        System.out.println("");

        Day.MetodoA(nombres,nNombres);
        System.out.println(" ");

        Day.MetodoB(nombres,nNombres);
        System.out.println(" ");

        Day.MetodoC(nombres,nNombres);
        System.out.println(" ");

//        Day.MetodoD(nombres,nNombres);
    }

    //a) Convertir los nombres a mayusculas
    public void MetodoA(String[] mayusculas, int cont){
        System.out.println(" ");
        System.out.println("MAYUSCULAS");
        for (int i=0; i < cont;i++){
            System.out.print((i+1)+"."+mayusculas[i].toUpperCase(Locale.ROOT) +" ");
        }
        System.out.println(" ");
    }

    //b)
    public void MetodoB(String[] minusculas, int cont){
        System.out.println("minusculas");
        for (int i=0; i < cont;i++){
            System.out.print((i+1)+"."+minusculas[i].toLowerCase(Locale.ROOT)+" ");
        }
        System.out.println(" ");

    }

    //c)
    public void MetodoC(String[] substitucion, int cont){
        System.out.println("Substitucion de las vocales por una X");
        for (int i=0; i < cont;i++){
            System.out.print((i+1)+"."+substitucion[i].replaceAll("[aeiouAEIOU]","x")+" ");
        }
        System.out.println(" ");

    }

//    d)Pendiente
//    public void MetodoD(String[] espacios, int cont){
//        System.out.println("Substitucion del espacio por un +");
//        for (int i=0; i < cont;i++){
//        }
 }

