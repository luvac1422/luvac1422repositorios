/* Leer la altura de N personas y determinar el promedio de estaturas 
    que se encuentran por debajo de 1.60 mts. y el promedio de estaturas 
    en general. */
package ejercicio6guia3;
import java.util.Scanner;
/**
 *
 * @author luvac1422
 */
public class Ejercicio6guia3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        
        double alturasMenores = 0, alturasGenerales = 0, altura, promedioGeneral, promedioMenor;
        int cantAlturasMenores = 0;
        
        System.out.println("¿Cuántas alturas quiere ingresar?");
        int cantidadDeAlturas = scanner.nextInt();
        
        for (int i = 0; i < cantidadDeAlturas; i++) {
            altura = 1 + Math.random();
            System.out.println(altura);
            alturasGenerales += altura;
            
            if (altura < 1.6) {
                alturasMenores += altura;
                cantAlturasMenores++;
            }
        }
        System.out.println("");
        System.out.println("");
        if (cantidadDeAlturas != 0) {
            promedioGeneral = alturasGenerales / cantidadDeAlturas;
            System.out.println("Promedio de estaturas en general: " + promedioGeneral);
        }
        if (cantAlturasMenores != 0) {
            promedioMenor = alturasMenores / cantAlturasMenores;
            System.out.println("Promedio de estaturas que se encuentran por debajo de 1.60 m: " + promedioMenor);
        }
    }
    }
    

