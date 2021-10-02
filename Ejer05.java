import java.util.Scanner;

public class Ejer05 {

    //Cambiar el nombre de los arreglos y llaves
    //Crear el metodo de impresion
    //Cambiar de int a float

    public Ejer05()
    {

    }

    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        //Atributos
        int entradaNumeros, datos;
        int f,c,x,i=0;

        //Llave para acceder a los metodos
        Ejer05 Dayana = new Ejer05();

        //Pidiendo N numeros
        System.out.println("Digite la cantidad de numeros que desea: ");
        entradaNumeros = s.nextInt();

        //Matriz principal
        int Emi[][] =new int[entradaNumeros][entradaNumeros];

        //Creando matriz
        for (f = 0; f < entradaNumeros; f++)
            for(c=0; c <entradaNumeros; c++){
                System.out.println((f+1)+","+(c+1)+".Capture el elemento de la matriz");
                Emi[f][c]= s.nextInt();
            }

        //Llamando a los metodos
        Dayana.metodoA(Emi,entradaNumeros);
        Dayana.metodoB(Emi,entradaNumeros);
        Dayana.metodoC(Emi,entradaNumeros);
        Dayana.metodoD(Emi,entradaNumeros);
        Dayana.metodoE(Emi,entradaNumeros);
        Dayana.metodoF(Emi,entradaNumeros);

    }

    //a) la suma de los números en la diagonal principaL
    public void metodoA(int incisoA[][], int numeros){
        int f,c,diagonal =0;
        for (f = 0;f < numeros; f++)
            for(c=0; c <numeros; c++){
                if (f == c){
                    diagonal = diagonal + incisoA[f][c];
                }
            }
        System.out.println("La suma de la diagonal fue "+ diagonal);
    }

    //b) La suma de los números que están “arriba” de la diagonal principal
    public void metodoB(int incisoB[][], int numeros){
        int f,c,arriba =0;
        for (f = 0;f < numeros; f++)
            for(c=0; c <numeros; c++){
                if(f <c){
                   arriba = arriba + incisoB[f][c];
                }
    }
        System.out.println("La suma de los numeros de arriba de la diagonal es: "+ arriba);
    }

    //c) La suma de los números que están “abajo” de la diagonal principal
    public void metodoC(int incisoC[][], int numeros){
        int f,c,abajo =0;
        for (f = 0;f < numeros; f++)
            for(c=0; c <numeros; c++){
                if(f >c){
                    abajo = abajo + incisoC[f][c];
                }
            }
        System.out.println("La suma de los numeros de abajo de la diagonal es: "+ abajo);
    }

    //d) El mayor de los números del inciso a
    public void metodoD(int incisoD[][], int numeros){
        int f,c,mayor,mayorDiagonal = 0;
        for (f = 0;f < numeros; f++)
            for(c=0; c <numeros; c++){
                if (f == c){
                    mayor =  incisoD[f][c];
                    if(mayor > mayorDiagonal){
                        mayorDiagonal=mayor;
                    }
                }
            }
        System.out.println("El numero mayor de la diagonal es: "+ mayorDiagonal);
    }

    //e) El menor de los números del inciso b
    public void metodoE(int incisoE[][], int numeros){
        int f,c,arriba =0,menor,menorSuperior=99999999;
        for (f = 0;f < numeros; f++)
            for(c=0; c <numeros; c++){
                if(f <c){
                    menor =  incisoE[f][c];
                    if(menor < menorSuperior){
                        menorSuperior=menor;
                }
            }
        }
        System.out.println("El menor de los numeros del metodo B es: "+ menorSuperior);
    }

    //f) El promedio de los números del inciso c
    public void metodoF(int incisoF[][], int numeros){
        int f,c,abajo =0, denominador = 0;
        float promedio;
        for (f = 0;f < numeros; f++)
            for(c=0; c <numeros; c++){
                if(f >c){
                    abajo = abajo + incisoF[f][c];
                    denominador++;
                }
            }
        promedio = abajo/denominador;
        System.out.println("El promedio de los numeros del metodo C es: "+ promedio);
    }

}