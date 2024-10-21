//Daniel Ruiz Atuesta

package tema2;

import java.util.Scanner;

public class UT2Problema3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int year = 0;
        String horoscope = "";
        
        System.out.print("Introduce el año (dC) para saber tu horóscopo chino: ");
        if(sc.hasNextInt()) {
            year = sc.nextInt();
            
            if (year <= 0) {
                System.out.println("ERROR");
                return;
            }
                    
        } else {
            System.out.println("ERROR");
            return;
        }
        
        
        int rest = year % 12;
        
        switch(rest) {
            case 0: horoscope = "Mono";
                break;
            case 1: horoscope = "Gallo";
                break;
            case 2: horoscope = "Perro";
                break;
            case 3: horoscope = "Cerdo";
                break;
            case 4: horoscope = "Rata";
                break;
            case 5: horoscope = "Buey";
                break;
            case 6: horoscope = "Tigre";
                break;
            case 7: horoscope = "Conejo";
                break;
            case 8: horoscope = "Dragón";
                break;
            case 9: horoscope = "Serpiente";
                break;
            case 10: horoscope = "Caballo";
                break;
            case 11: horoscope = "Cabra";
                break;
        } 
        
        System.out.println("Tu horóscopo chino corresponde a " + horoscope);
        
        

    }

}
