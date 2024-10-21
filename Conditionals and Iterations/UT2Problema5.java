//Daniel Ruiz Atuesta
package tema2;

import java.util.Scanner;

public class UT2Problema5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double studentMark;
        double minMark = 10, maxMark = 0, totalMark = 0, totalMarkPassed = 0, totalMarkFailed = 0;
        int totalStudents = 0, totalPassed = 0, totalFailed = 0;

        System.out.println("------------------------------\n" + "--   ESTADÍSTICA DE NOTAS   --\n" + "------------------------------\n");

        while (true) {
            System.out.print("Introduce una nota (valor negativo para finalizar): ");

            if (!sc.hasNextDouble() || (studentMark = sc.nextDouble()) > 10) {
                sc.nextLine();
                System.out.println("ERROR: Nota inválida.");
                continue;
            }

            if (studentMark < 0)
                break;

            totalMark += studentMark;
            totalStudents++;

            if (studentMark >= 5) {
                totalPassed++;
                totalMarkPassed += studentMark;
            } else {
                totalFailed++;
                totalMarkFailed += studentMark;
            }

            minMark = minMark < studentMark ? minMark : studentMark;
            maxMark = maxMark < studentMark ? studentMark : maxMark;
        }

        if (totalStudents == 0)
            System.out.println("No se ha introducido ninguna nota");
        else 
            System.out.printf("\n- Se han evaluado un total de %d alumnos\n", totalStudents);

            System.out.printf("- La nota media del curso ha sido %.2f\n", totalMark / totalStudents);
            System.out.printf("- Han aprobado %d alumnos, lo que supone un %.2f%% del total\n", totalPassed, (double) ((totalPassed * 100) / totalStudents));

            if (totalPassed > 0)
                System.out.printf("- La nota media de los alumnos aprobados es %.2f\n", totalMarkPassed / totalPassed);
            else
                System.out.println("- La nota media de los alumnos aprobados es inexistente, porque nadie ha aprobado");
            

            System.out.printf("- Han suspendido %d alumnnos, lo que supone un %.2f%% del total\n", totalFailed, (double) (totalFailed * 100) / totalStudents);

            if (totalFailed > 0) {
                System.out.printf("- La nota media de los alumnos suspendidos es %.2f\n", totalMarkFailed / totalFailed);
            } else {
                System.out.println("- La nota media de los alumnos suspendidos es inexistente, porque nadie ha suspendido");
            }

            System.out.printf("- La nota más alta ha sido %.2f\n", maxMark);
            System.out.printf("- La nota más baja ha sido %.2f\n", minMark);

        

    }
}
