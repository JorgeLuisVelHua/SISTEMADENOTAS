package SISTEMADENOTA;
import java.util.Scanner;

public class PARCIAL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String buc;

        do {
            System.out.println("Ingrese el nombre del alumno: ");
            String nom = sc.next();

            System.out.println("Ingrese la nota 1: ");
            double n1 = sc.nextDouble();

            System.out.println("Ingrese la nota 2: ");
            double n2 = sc.nextDouble();

            System.out.println("Ingrese la nota 3: ");
            double n3 = sc.nextDouble();

            System.out.println("Ingrese la nota 4: ");
            double n4 = sc.nextDouble();

            System.out.println("Ingrese la nota 5: ");
            double n5 = sc.nextDouble();

            System.out.println("Curso: ");
            String cur= sc.next();

            System.out.println("Participo en las clases de practica?: ");
            String ext = sc.next();

            if (ext.equalsIgnoreCase("Si")){

            }

            //RESULTADO

            System.out.println("El nombre del alumno es: "+nom);
            System.out.println("El curso promediado es: "+cur);
            System.out.println("El promedio final es: "+calcularnota(n1,n2,n3,n4,n5));
            System.out.println("El estado del alumno es: "+estado(n1,n2,n3,n4,n5));

            System.out.println("Desea calcular notas de otro alumno?: ");
            buc=sc.next();

        } while (buc.equalsIgnoreCase("Si"));
        System.out.println("Fin del sistema");
    }

    public static double calcularnota(double n1,double n2, double n3,double n4,double n5){
        double prom = (n1+n2+n3+n4+n5)/5;

        return prom;

    }

    public static String estado(double n1, double n2, double n3, double n4, double n5){
        String est;
        double prom = (n1+n2+n3+n4+n5)/5;

        if (prom>=13){
            est="Aprobado";
        } else {
            est="Desaprobado";
        }

        return (est);
    }




}
