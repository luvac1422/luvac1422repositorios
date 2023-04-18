/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
Crear un programa que permita introducir un cuadrado por teclado y determine si 
este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.*/

package ejercicio6_1guia5;
import java.util.Scanner;
/**
 *
 * @author luvac1422
 */
public class Ejercicio6_1guia5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer=new Scanner(System.in);
      
        //Scanner leer = new Scanner(System.in);
        //System.out.println("Ingrese los 9 numeros para el cuadrado mágico");
        //int matriz[][] = new int[3][3];
        int matriz[][] = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};

        //for (int i = 0; i < 3; i++) {
        //    for (int j = 0; j < 3; j++) {
        //        int num = leer.nextInt();
        //        matriz[i][j]= num;                
        //    }
        //}
        int vector[] = new int[8];
        for (int i = 0; i < 8; i++) {
            vector[i] = 0;
        }
        int sumaDiag1 = 0;
        int sumaDiag2 = 0;
        for (int i = 0; i < 3; i++) {
            int suma = 0;
            int sumaCol = 0;
            sumaDiag1 += matriz[i][i];
            vector[6] = sumaDiag1;
            sumaDiag2 += matriz[i][2 - i];
            vector[7] = sumaDiag2;
            for (int j = 0; j < 3; j++) {
                suma += matriz[i][j];
                vector[i] = suma;
                sumaCol += matriz[j][i];
                vector[i + 3] = sumaCol;
            }
        }
            for (int j = 0; j < 3; j++) {
                System.out.println("La fila " + j + " suma : " + vector[j]);
                System.out.println("La columna " + j + " suma : " + vector[j+3]);
            }
            System.out.println("La diagonal principal suma : " + vector[6]);
            System.out.println("La diagonal secundaria suma : " + vector[7]);

        boolean comp = true;
        for (int i = 0; i < 8; i++) {
            //System.out.println(vector[i]);
            if (vector[i] != 15) {
                comp = false;
            }
        }
        if (comp) {
            System.out.println("La Matriz es MAGICA");
        } else {
            System.out.println("La Matriz NO ES MAGICA");
        }
    } 
    }
    

