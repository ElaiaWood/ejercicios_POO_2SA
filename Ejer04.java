import java.util.Scanner;

//        Santiago Hirochi Cibriano Trejo
//        Christian Dayana De La Cruz López
//        Gaspar Emiliano Euan Puc
//        Elias Uriel Xool Feria

//4.- Elabora una clase que genere un arreglo multidimensional, y que obtenga: a) la suma de la
//        diagonal principal, b) el promedio de los elementos que están arriba de la diagonal principal, c) el
//        promedio de los elementos que están abajo de la diagonal principal.

public class Ejer04 {

    public Ejer04(){

    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        //Atributos
        int numerosFila,numerosColumna, datos;
        int f,c,x,i=0;

        //Llave para acceder a los metodos
        Ejer04 Naybelin = new Ejer04();

        //Pidiendo N numeros
        System.out.println("Digite la cantidad de numeros que desea para la primera matriz: ");
        numerosFila = s.nextInt();

        System.out.println("Digite la cantidad de numeros que desea para la primera matriz: ");
        numerosColumna = s.nextInt();

        //Matriz principal
        int Joffrey[][] =new int[numerosFila][numerosColumna];

        //Creando matriz
        if (numerosFila == numerosColumna){

            for (f = 0; f < numerosFila; f++)
                for(c=0; c < numerosColumna; c++){
                    System.out.println((f+1)+","+(c+1)+".Capture el elemento de la matriz");
                    Joffrey[f][c]= s.nextInt();
                }
            for(f = 0; f < numerosFila; f++){
                System.out.println();
                {
                    for (c = 0; c < numerosColumna; c++)
                        System.out.print(+Joffrey[f][c]+ "  ");

                }
            }

            //Llamada de los metodos
            Naybelin.MetodoA(Joffrey,numerosFila,numerosColumna);
            Naybelin.MetodoB(Joffrey,numerosFila,numerosColumna);
            Naybelin.MetodoC(Joffrey,numerosFila,numerosColumna);

        } else {
            System.out.println("Error de matriz");
            System.out.println("La matriz tiene que ser de las mismas dimensiones");
            System.out.println("Intente con dimensiones iguales");
        }

    }

    //a) la suma de los números en la diagonal principaL
    public void MetodoA(int incisoA[][], int numA, int  numB){
        int f,c,diagonal =0;
        for (f = 0;f < numA; f++)
            for(c=0; c <numB; c++){
                if (f == c){
                    diagonal = diagonal + incisoA[f][c];
                }
            }
        System.out.println("");
        System.out.println("La suma de la diagonal fue "+ diagonal);
    }

    public void MetodoB(int incisoB[][], int numA, int numB){
        int f,c,arriba =0,denominador=0,promedioArriba;
        for (f = 0;f < numA; f++)
            for(c=0; c <numB; c++){
                if(f <c){
                    arriba = arriba + incisoB[f][c];
                    denominador++;
                }
            }
        promedioArriba = arriba/denominador;
        System.out.println("El promedio de los numeros de la diagonal de arriba es: "+ promedioArriba);
    }

    public void MetodoC(int incisoB[][], int numA, int numB){
        int f,c,abajo =0,denominador=0,promedioAbajo;
        for (f = 0;f < numA; f++)
            for(c=0; c <numB; c++){
                if(f >c){
                    abajo = abajo + incisoB[f][c];
                    denominador++;
                }
            }
        promedioAbajo = abajo/denominador;
        System.out.println("El promedio de los numeros de la diagonal de abajo es: "+ promedioAbajo);
    }

}