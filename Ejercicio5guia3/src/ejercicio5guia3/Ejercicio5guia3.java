/*Escriba un programa en el cual se ingrese un valor límite positivo, y a
ontinuacion solicite numeros al usuario hasta que la suma de los
numeros introducidos supere el límite inicial.*/
package ejercicio5guia3;

import java.util.Scanner;

/**
 *
 * @author luvac1422
 */
public class Ejercicio5guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un valor positivo");
        int valor = leer.nextInt();
        System.out.println("ingres los numeros a sumar");
        int num;

        int suma = 0;
        while (suma <= valor) {
            num = leer.nextInt();
            suma = suma + num;
        }
        System.out.println("el valor de la suma es" + suma);

        // TODO code application logic here
    }

}
