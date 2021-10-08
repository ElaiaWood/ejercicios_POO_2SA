import java.util.Arrays;
import java.util.Scanner;

//        Santiago Hirochi Cibriano Trejo
//        Christian Dayana De La Cruz López
//        Gaspar Emiliano Euan Puc
//        Elias Uriel Xool Feria

//1.- Elabora una clase que utilice un arreglo unidimensional, lea N números y realice lo siguiente: a)
//        almacene los números ascendentemente, b) almacene los números descendentemente, c) almacene
//        los números pares, d) almacene los números impares, e) desplegar los resultados obtenidos.


public class Ejer01 {
    //Atributos
    int i;

    //Constructor nulo
    public Ejer01(){

    }

    public static void main(String[] args) {
        //Atributos de main
        int entradaNumeros, i;

        Scanner s = new Scanner(System.in);
        //Llave para llamar los metodos
        Ejer01 llave = new Ejer01();

        //Pidiendo N numeros
        System.out.println("Digite la cantidad de numeros que desea: ");
        entradaNumeros = s.nextInt();


        //Creando arreglo de N numeros
        int[] numerosElias = new int[entradaNumeros];

        //Guardando elementos del arreglo
        for (i = 0; i < entradaNumeros; i++) {
            System.out.println((i + 1) + ".Digite el numero: ");
            numerosElias[i] = s.nextInt();
        }

        //Llamada de los metodos
        llave.numAscendentes(numerosElias);
        llave.numDescendentes(numerosElias);
        llave.numPar(numerosElias);
        llave.numImpar(numerosElias);

    }

        //Metodo para ordenar los numeros ascendentes
        public void numAscendentes(int ArregloA[]){
            Arrays.sort(ArregloA);
            System.out.println("\nNumeros ascendentes");
            for(i=0; i < ArregloA.length; i++){
                System.out.println(""+ArregloA[i]);
            }
    }

        //Metodo para ordenar los numeros de forma descendente
        public void numDescendentes(int ArregloB[]){
            Arrays.sort(ArregloB);
            System.out.println("\nNumeros descendentes");
            for(int i = ArregloB.length-1; i >= 0; i--){
                System.out.println(""+ArregloB[i]);
            }
    }


        //Metodos para los numeros pares
        public void numPar(int ArregloC[]){
            int par;
            Arrays.sort(ArregloC);
            System.out.println("\nNumeros pares");
            for(i=0;i < ArregloC.length; i++){
                 if(ArregloC[i]%2==0){
                    par = ArregloC[i];
                    System.out.println(par);
                }
            }
    }

        //Metodos para los numeros impares
        public void numImpar(int ArregloD[]){
            int impar;
            Arrays.sort(ArregloD);
            System.out.println("\nNumeros impares");
            for(i=0;i < ArregloD.length; i++){
                if(ArregloD[i]%2!=0){
                    impar = ArregloD[i];
                    System.out.println(impar);
                }
            }
    }


}
