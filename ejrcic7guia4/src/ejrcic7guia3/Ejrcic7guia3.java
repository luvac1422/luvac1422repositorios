
package ejrcic7guia3;
import java.util.Scanner;
/**
 @author luvac1422
 */
public class Ejrcic7guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de números que se solicitarán");
        int n = leer.nextInt();

        int valorMaximo = 100, valorMinimo = 1, contador = 0;
        double promedio = 0;
        int num;
        while (contador < n) {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            if (contador == 0) {
                valorMaximo = num;
                valorMinimo = num;
            }
            if (valorMaximo < num) {
                valorMaximo = num;
            } else if (valorMinimo > num) {
                valorMinimo = num;
            }
            promedio += num;
            contador++;
        }
        promedio /= n;
        System.out.println("El número más grande es: " + valorMaximo);
        System.out.println("El número más chico es: " + valorMinimo);
        System.out.println("El promedio de los números es: " + promedio);
    }
    }
    

