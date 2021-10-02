import java.util.Scanner;

public class Calificaciones {

    // Atributos de la clase
    public float c1,c2,c3,c4,c5;

    public Calificaciones(){

    }

    public float HacerIncA(){
        float respuesta;
        Scanner s = new Scanner(System.in);
        System.out.println("Dar Calificaciones:");
        respuesta = s.nextFloat();
        return(respuesta);
    }

    public float HacerIncB(float b1,float b2, float b3, float b4, float b5){
        float prom;
        prom = (b1+b2+b3+b4+b5)/5;
        return(prom);
    }

    public int HacerIncC(float cu,float cd,float ct,float cc,float ccd){
        int contador = 0;
        if(cu>=70){
            contador++;
        }
        if(cd>=70){
            contador++;
        }
        if(ct>=70){
            contador++;
        }
        if(cc>=70){
            contador++;
        }
        if(ccd>=70){
            contador++;
        }
        return(contador);
    }

    public int HacerIncD(float ru,float rd,float rt,float rc,float rrd){
        int contador = 0;
        if(ru<=70){
            contador++;
        }
        if(rd<=70){
            contador++;
        }
        if(rt<=70){
            contador++;
        }
        if(rc<=70){
            contador++;
        }
        if(rrd<=70){
            contador++;
        }
        return(contador);
    }
    public void HacerIncE(float z1, int z2 , int z3) {
        System.out.println("El promedio es: " + z1);
        System.out.println("Cantidad de aprobados: " + z2);
        System.out.println("Cantidad de reprobados: " + z3);
        return;
    }

    public static void main(String[]args){

        //Atributos del main
        Calificaciones llave = new Calificaciones();
        float prom;
        int aprob,reprob;

        //Inciso a
        llave.c1 = llave.HacerIncA();
        llave.c2 = llave.HacerIncA();
        llave.c3 = llave.HacerIncA();
        llave.c4 = llave.HacerIncA();
        llave.c5 = llave.HacerIncA();

        //Inciso b
        prom = llave.HacerIncB(llave.c1,llave.c2,llave.c3,llave.c4,llave.c5);

        //inciso c
        aprob = llave.HacerIncC(llave.c1,llave.c2,llave.c3,llave.c4,llave.c5);

        //Inciso d
        reprob = llave.HacerIncD(llave.c1,llave.c2,llave.c3,llave.c4,llave.c5);

        //Inciso e
        llave.HacerIncE(prom,aprob,reprob);

        }
}



