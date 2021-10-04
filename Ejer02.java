import java.util.Scanner;

public class Ejer02 {

    public Ejer02(){

    }

    public static void main(String[] args) {
        //Atributos
        Scanner s= new Scanner(System.in);
        int nNumero,f,c;

        //Llave para acceder a los metodo
        Ejer02 Day = new Ejer02();

        //Entrada de datos de fila y columna
        System.out.println("Indique la dimension de la matriz: ");
        nNumero = s.nextInt();

        //Matriz principal
        char [][] Eliawood = new char[nNumero][nNumero];
        //Mitad de la matriz
        int centro = ((nNumero*nNumero)/2)+1;
        int i =1;

        //Contador para posicionamiento de asteriscos
        char astetisco = '*';

        //Creando los posicionamientos de los asteriscos
        int iLinea = (nNumero/2)+1;
        int pLineaI = (nNumero/2)-1;
        int dLinea = (nNumero/2)+1;
        int pLineaD = (nNumero/2)+1;

        //Creando la piramide
        for (f = 0; f < nNumero; f++){
            for(c=0; c <nNumero; c++){
                //Posicionar el asterisco en el centro
                if (i ==centro){
                    Eliawood[f][c]= astetisco;
                }else /*Dejar espacios en blanco cuando no se requieran asteriscos*/{
                    Eliawood[f][c]= ' ';
                }
                //Posicionar los asteriscos en la ultima fila
                if (f==nNumero-1){
                    Eliawood[f][c]= astetisco;
                }
                //Posicionar dos asteriscos en la fila de la izquierda
                if(f== iLinea){
                     if(c == pLineaI){
                        Eliawood[f][c]= astetisco;
                        pLineaI--;
                         iLinea++;
                     }
                }

                //Posicionar los astericos en la fila de en la derecha
                if(f== dLinea){
                    if(c == pLineaD){
                        Eliawood[f][c]= astetisco;
                        pLineaD++;
                        dLinea++;
                    }
                }
                i++;
            }
        }
        //Imprimiendo la piramide
        for(f = 0; f < nNumero; f++){
            System.out.println();
                for (c = 0; c < nNumero; c++){
                    System.out.print((char)Eliawood[f][c]+ " ");

            }
        }
    }

}
