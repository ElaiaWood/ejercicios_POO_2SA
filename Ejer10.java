import java.util.Scanner;
//Cambiar el nombre de los arreglos y llaves
//Crear el metodo de impresion
public class Ejer10 {

    public Ejer10(){

    }

    public static void main(String[] args ) {
        //Atributos
        Scanner s = new Scanner(System.in);
        int numero;

        //Llave de metodos
        Ejer10 Jorvik = new Ejer10();

        //Solicitando N numero
        System.out.println("Ingrese una cantidad:");
        numero = s.nextInt();

        //Llamada de los metodos
        Jorvik.metodoA(numero);
        Jorvik.metodoB();

    }

    // a) El enésimo término, introduciendo el valor de n para calcularlo
    public void metodoA(int nNum){
        int n1=0,n2=1,n3=0;

        for(int i=0; i< nNum; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("El enesimo numero es: "+n3);
    }

    // b) El número más grande que se puede calcular
    public void metodoB(){
        int n1=0,n2=1,n3=0;

        for(int i=0; i>= 0; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("El numero mas grande que se puede calcular es: "+n3);
    }
}
