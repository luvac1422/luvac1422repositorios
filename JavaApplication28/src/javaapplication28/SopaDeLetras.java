
package javaapplication28;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author luvac1422
 */
public class SopaDeLetras {

   public static void main(String[] args) {




 
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        
        String[] palabras = new String[5];
        for (int i = 0; i < palabras.length; i++) {
            System.out.printf("INGRESE PALABRA DE 3 A 5 CARACTERES N°"+ (i + 1) + ": ");
            palabras[i] = leer.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("ERROR, INGRESE NUEVAMENTE");
                palabras[i] = leer.nextLine();
            }
        }

        char[][] sopa = new char[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = (char) (aleatorio.nextInt(10) + '0');
            }
        }

        
        int fila = aleatorio.nextInt(20);
        int col = 0;
        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length(); i++) {
                sopa[fila][(col + i)] = palabra.charAt(i);
            }
            col += palabra.length();
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
}
    
    

