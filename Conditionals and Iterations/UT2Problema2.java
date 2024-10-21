//Daniel Ruiz Atuesta

import java.util.Scanner;

public class UT2Problema2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double imc, imcOxf;
        double weightUser, heightUser;

        System.out.println("CALCULADORA DEL IMC");
        System.out.println("-------------------");

        System.out.print("Introduce tu peso en kg: ");
        if (input.hasNextDouble()) {
            weightUser = input.nextDouble();

            if (weightUser <= 0) {
                System.out.println("ERROR");
                return;
            }

        } else {
            System.out.println("ERROR");
            return;
        }
        System.out.print("Introduce tu altura en cm: ");
        if (input.hasNextDouble()) {
            heightUser = input.nextDouble();
            heightUser *= 0.01;
            if (heightUser <= 0) {
                System.out.println("ERROR");
                return;
            }

        } else {
            System.out.println("ERROR");
            return;
        }


        imc = weightUser / Math.pow(heightUser, 2);
        imcOxf = (1.3 * weightUser) / Math.pow(heightUser, 2.5);

        double descompensation;
        if (imc >= imcOxf) {
            descompensation = imc - imcOxf;

        } else {
            descompensation = imcOxf - imc;
        }

        if (imcOxf < 18.5 && descompensation > 1) {
            System.out.printf("Tu IMC (Oxford 2003) es %.2f (Falta de peso descompensado)", imcOxf);
        } else if (imcOxf < 18.5) {
            System.out.printf("Tu IMC (Oxford 2003) es %.2f (Falta de peso)", imcOxf);
        }
        if ((imcOxf >= 18.5 && imcOxf < 25) && descompensation > 1) {
            System.out.printf("Tu IMC (Oxford 2003) es %.2f (Normal descompensado)", imcOxf);
        } else if (imcOxf >= 18.5 && imcOxf < 25) {
            System.out.printf("Tu IMC (Oxford 2003) es %.2f (Normal)", imcOxf);
        }
        if ((imcOxf >= 25 && imcOxf < 30) && descompensation > 1) {
            System.out.printf("Tu IMC (Oxford 2003) es %.2f (Sobrepeso descompensado)", imcOxf);
        } else if (imcOxf >= 25 && imcOxf < 30) {
            System.out.printf("Tu IMC (Oxford 2003) es %.2f (Sobrepeso)", imcOxf);
        }
        if ((imcOxf >= 30 && descompensation > 1)) {
            System.out.printf("Tu IMC (Oxford 2003) es %.2f (Obeso descompensado)", imcOxf);
        } else if (imcOxf >= 30) {
            System.out.printf("Tu IMC (Oxford 2003) es %.2f (Obeso)", imcOxf);
        }
    }
}
