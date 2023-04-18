
package ejercicio5_persona;

import Entidades.Persona;
import ejercicio5_persona.Service.PersonaService;
import java.util.Scanner;

/**
 *
 * @author luvac1422
 */
public class Ejercicio5_Persona {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService ps1 = new PersonaService();
        
        Persona p1 = ps1.crearPersona();
        ps1.mostrarPersona(p1);
               
    }


}
