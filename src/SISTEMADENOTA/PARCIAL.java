package SISTEMADENOTA;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class PARCIAL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double notaext1,notaext2,notaext3;
        double n1,n2,n3,n4,n5;
        boolean cond=false;
        String buc;

        do {
            System.out.println("Ingrese el nombre del alumno: ");
            String nom = sc.next();

            do {
                System.out.print("Ingrese la nota 1: ");
                n1 = sc.nextDouble();

                System.out.print("Ingrese la nota 2: ");
                n2 = sc.nextDouble();

                System.out.print("Ingrese la nota 3: ");
                n3 = sc.nextDouble();

                System.out.print("Ingrese la nota 4: ");
                n4 = sc.nextDouble();

                System.out.print("Ingrese la nota 5: ");
                n5 = sc.nextDouble();

                if (n1 > 20 || n2 > 20 || n3 > 20 || n4 > 20 || n5 > 20){
                    cond=true;
                } else {
                    cond=false;
                }

                if (cond){
                    System.out.println("La nota máxima es 20, repita");
                }

            }while (cond);


            System.out.println("Curso: ");
            String cur= sc.next();

            System.out.println("Participo en las clases de practica?: ");
            String ext = sc.next();

            if (ext.equalsIgnoreCase("Si")){
                System.out.println("Ingrese la nota extra 1:");
                notaext1= sc.nextDouble();

                System.out.println("Ingrese la nota extra 2:");
                notaext2= sc.nextDouble();

                System.out.println("Ingrese la nota extra 3:");
                notaext3= sc.nextDouble();

                //RESULTADOS 1

                System.out.println("El nombre del alumno es: "+nom);
                System.out.println("El curso promediado es: "+cur);
                System.out.println("Los puntos extras son: "+puntosextras(notaext1,notaext2,notaext3));

                System.out.println("El promedio final es: "+calcularnota(n1,n2,n3,n4,n5,notaext1,notaext2,notaext3));
                System.out.println("El estado del alumno es: "+estado(n1,n2,n3,n4,n5,notaext1,notaext2,notaext3));

            } else {
                //RESULTADOS 2
                System.out.println("El nombre del alumno es: "+nom);
                System.out.println("El curso promediado es: "+cur);
                System.out.println("El promedio final es: "+calcularnota(n1,n2,n3,n4,n5,notaext1=0,notaext2=0,notaext3=0));
                System.out.println("El estado del alumno es: "+estado(n1,n2,n3,n4,n5,notaext1,notaext2,notaext3));
            }

            System.out.println("Desea calcular notas de otro alumno?: ");
            buc=sc.next();

        } while (buc.equalsIgnoreCase("Si"));
        System.out.println("Fin del sistema");
    }

    public static double calcularnota(double n1,double n2, double n3,double n4,double n5,double notaext1,double notaext2,double notaext3){

        double puntos= puntosextras(notaext1,notaext2,notaext3);
        double puntajefin;
        double prom = (n1+n2+n3+n4+n5)/5;

        if (puntos>=0){
            puntajefin = puntosextras(notaext1,notaext2,notaext3)+prom;
        } else {
            puntajefin = prom;
        }

        return Math.min(puntajefin,20);

    }

    public static String estado(double n1, double n2, double n3, double n4, double n5,double notaext1,double notaext2,double notaext3){
        String est;
        double puntos1= puntosextras(notaext1,notaext2,notaext3);
        double punfin;
        double prom = (n1+n2+n3+n4+n5)/5;

        if (puntos1>=0){
            punfin=prom+puntos1;
        } else {
            punfin=prom;
        }

        if (punfin>=13){
            est="Aprobado";
        } else {
            est="Desaprobado";
        }

        return (est);
    }

    public static double puntosextras(double notaext1, double notaext2,double notaext3){
        double cpe=(notaext1+notaext2+notaext3)/3;
        double cpef=cpe;
        double punext;

        if (cpef>=0&&cpef<=10) {
            punext=0;
        } else if (cpef>=13&&cpef<=15) {
            punext=1;
        }else if (cpef>=15&&cpef<=18) {
            punext=2;
        } else if (cpef>=19&&cpef<=20){
            punext=3;
        }else {
            punext=0;
        }

        return punext;
    }


}
