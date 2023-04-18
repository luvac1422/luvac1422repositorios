
package javaapplication29;
import java.util.Scanner;
/**
 *
 * @author luvac1422
 */
public class JavaApplication29 {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una secuencia de caracteres");
        String frase = leer.nextLine();

        System.out.println(fraseNueva(frase));

    }
    
    public static String fraseNueva(String frase) {

        String fraseNueva="";

        for (int i = 0; i < frase.length(); i++) {

            char letra;
            letra = frase.charAt(i);

            switch (letra) {
                case 'a':
                    fraseNueva = fraseNueva.concat("@");
                    break;

                case 'E', 'e';
                    fraseNueva = fraseNueva.concat("#");
                    break;

                case 'I', 'i':
                    fraseNueva = fraseNueva.concat("$");
                    break;

                case 'O', 'o':;
                    fraseNueva = fraseNueva.concat("%");
                    break;

                case 'U', 'u':
                    fraseNueva = fraseNueva.concat("*");
                    break;

                default:
                    fraseNueva = fraseNueva.concat(String.valueOf(letra));
                    break;
            }
        }
        return fraseNueva;
    }
}
    
    

