//Daniel Ruiz Atuesta

package tema2;

import java.util.Scanner;

public class UT2Problema4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100);
        int playerTry, tries;

        System.out.println("""
                ------------------------------
                --     ADIVINA EL NÚMERO    --
                ------------------------------
                """);

        System.out.print("¿De cuántos intentos quieres disponer?[1-10]: ");
        while (!sc.hasNextInt() || (tries = sc.nextInt()) < 1 || tries > 10) {
            sc.nextLine();
            System.out.println("ERROR. Dato no válido");
            System.out.print("¿De cuántos intentos quieres disponer?[1-10]: ");
        }
        sc.nextLine();
        for (int i = 1; i <= tries; i++) {
            System.out.printf("Intento %s: ", i);
            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("ERROR. Intento no válido.");
                System.out.printf("Intento %s: ", i);
            }
            playerTry = sc.nextInt();
            sc.nextLine();
            if (i == tries && playerTry != randomNumber) {
                System.out.println("Lástima, el número era " + randomNumber + ". Más suerte la próxima vez");
                break;
            }
            if (playerTry == randomNumber) {
                System.out.println("Enhorabuena, has acertado.");
                break;
            } else if (playerTry > randomNumber && (playerTry - randomNumber) <= 5) {
                System.out.println("El número introducido es mayor (Caliente)");
            } else if (playerTry < randomNumber && (randomNumber - playerTry) <= 5) {
                System.out.println("El número introducido es menor (Caliente)");
            } else if (playerTry > randomNumber && (playerTry - randomNumber) <= 15) {
                System.out.println("El número introducido es mayor (Templado)");
            } else if (playerTry < randomNumber && (randomNumber - playerTry) <= 15) {
                System.out.println("El número introducido es menor (Templado)");
            } else if (playerTry > randomNumber && (playerTry - randomNumber) > 15) {
                System.out.println("El número introducido es mayor (Frío)");
            } else if (playerTry < randomNumber && (randomNumber - playerTry) > 15) {
                System.out.println("El número introducido es menor (Frío)");
            }
        }
        }
    }

