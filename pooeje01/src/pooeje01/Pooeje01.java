package pooeje01;

import entidad.Persona;
import java.util.Scanner;


/**
 *
 * @author luvac1422
 */
public class Pooeje01 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       Persona primerapersona=new Persona("jorge", "alvarez","argentino",33333333);
//       primerapersona.nombre=leer.next("alva");
      // primerapersona.apellido=leer.next();
       //primerapersona.nacionalidad=leer.next();
       //primerapersona.numdedocumento=leer.nextInt();
        System.out.println(primerapersona);
    }
    
}
