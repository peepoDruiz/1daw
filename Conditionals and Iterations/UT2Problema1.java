//Daniel Ruiz Atuesta
import java.util.Scanner;

public class UT2Problema1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double monthSalary;
        double taxes;
        double help = 1500;

        System.out.println("CALCULADORA DE IMPUESTOS");
        System.out.println("------------------------");

        System.out.print("Introduce tu salario bruto mensual en euros: ");
        monthSalary = input.nextDouble();
        input.nextLine();

        double anualSalary = monthSalary * 12;

        if (anualSalary > 40000) {
            taxes = anualSalary * 0.30;
            System.out.printf("Tu sueldo anual es de %.2f€\n", anualSalary);
            System.out.printf("Te toca pagar %.2f€ y no recibes ninguna ayuda\n", taxes);

        } else if (anualSalary > 10000 && anualSalary <= 40000) {
            taxes = anualSalary * 0.2;

            if (anualSalary < 15000) {

                System.out.printf("Tu sueldo anual es de %.2f€\n", anualSalary);
                System.out.printf("Te toca pagar %.2f€ y recibes una ayuda de %.2f€\n", taxes, help);

            } else if (anualSalary >= 15000){
                System.out.printf("Tu sueldo anual es de %.2f€\n", anualSalary);
                System.out.printf("Te toca pagar %.2f€ y no recibes ninguna ayuda\n", taxes);
            }

        } else if (anualSalary > 0) {
            taxes = 0;
            System.out.printf("Tu sueldo anual es de %.2f€\n", anualSalary);
            System.out.printf("Te toca pagar %.2f y recibes una ayuda de %.2f€\n", taxes, help);

        } else {
            if (anualSalary == 0) {
                System.out.println("ERROR");
            }
        }
    }
}

