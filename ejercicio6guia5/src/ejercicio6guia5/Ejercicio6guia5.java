/*Realice un programa que compruebe si una matriz dada
es antisimétrica. Se dice que una matriz A es antisimétrica 
cuando ésta es igual a su propia traspuesta, pero cambiada 
de signo. Es decir, A es antisimétrica si A = -AT. La matriz
traspuesta de una matriz A se denota por AT y se obtiene
cambiando sus filas por columnas (o viceversa).*/
//MATRIZ TRASPUESTA ANTISIMETRICA

package ejercicio6guia5;

/**
 *
 * @author luvac1422
 */
public class Ejercicio6guia5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int matriz[][] = { { 0, -2, 4 }, { 2, 0, 2 }, { -4, -2, 0 } };
     
boolean aux = true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    System.out.println("la matriz no es antisimetrica");
                    i=matriz.length;
                    j=matriz[0].length;
                    aux = false;
                }
            }
        }
        if (aux) {
            System.out.println("la matriz es antisimetrica");
        }
    }
}
