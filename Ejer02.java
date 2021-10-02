import java.util.Scanner;

public class Ejer02 {

    public Ejer02(){

    }

    public static void main(String[] args) {
        //Atributos
        Scanner s= new Scanner(System.in);
        int nFila, nNumero,f,c;

        //Llave para acceder a los metodo
        Ejer02 Day = new Ejer02();

        //Entrada de datos de fila y columna
        System.out.println("Indique la dimension de la fila: ");
        nNumero = s.nextInt();


//        System.out.println(centro);

        //Matriz principal
        char [][] Eliawood = new char[nNumero][nNumero];
        //Mitad de la matriz
//        int centro = ((nFila*nColumna)/2)+1;

        //Contador para posicionamiento de asteriscos
        char astetisco [] = {'x'};
        //Creando matriz
        char letras = '*';
        for (f = 0; f < nNumero; f++)
            for(c=0; c <nNumero; c++){
                if (f ==c){
                    Eliawood[f][c]= astetisco[0];
                }
            }

        for(f = 0; f < nNumero; f++){
            System.out.println();
            {
                for (c = 0; c < nNumero; c++)
                    System.out.print(+Eliawood[f][c]+ " ");

            }
        }
    }

}
