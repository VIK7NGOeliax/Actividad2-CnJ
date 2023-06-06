import java.util.Scanner;

public class Promedio1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double calificacion1,calificacion2,calificacion3,calificacion4,calificacion5,promedio;
        String alumno;

        System.out.println("Nombre del alumno: ");
        alumno=teclado.nextLine();
        System.out.println("Calificacion 1: ");
        calificacion1=teclado.nextDouble();
        System.out.println("Calificacion 2: ");
        calificacion2=teclado.nextDouble();
        System.out.println("Calificacion 3: ");
        calificacion3=teclado.nextDouble();
        System.out.println("Calificacion 4: ");
        calificacion4=teclado.nextDouble();
        System.out.println("Calificacion 5: ");
        calificacion5=teclado.nextDouble();
        promedio=(calificacion1+calificacion2+calificacion3+calificacion4+calificacion5)/5;
        System.out.println("El promedio final del estudiante: "+alumno+" es de: "+promedio);


    }
}
