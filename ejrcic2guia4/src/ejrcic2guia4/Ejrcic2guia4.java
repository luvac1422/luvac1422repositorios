/*Diseñe una función que pida el nombre y la edad de N personas
e imprima los datos de las personas ingresadas por teclado e indique
si son mayores o menores de edad. Después de cada persona, 
el programa debe preguntarle al usuario si quiere seguir mostrando
personas y frenar cuando el usuario ingrese la palabra “No”. */

package ejrcic2guia4;
import java.util.Scanner;
/**
 *
 * @author luvac1422
 */
public class Ejrcic2guia4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in) .useDelimiter("\n");
        String nombre, opcion;
        Boolean bandera=null;
        int N, edad;
       //      System.out.println(" Escriba el nombre de la persona");
             System.out.println("ingrese la cantidad de personas ");
             N=leer.nextInt();
        for (int  i =0; i<N; i++){
           System.out.println(" Escriba el nombre de la persona");  
            nombre=leer.next();
            System.out.println("ingrese la edad de la persona");
            edad=leer.nextInt();
        if (edad>=18){
            System.out.println(nombre+" es mayor de edad");
           } else{
            System.out.println(nombre+" es menor de edad");
           
        }
        if (i!=N-1){
            do{
               System.out.println("desea seguir si/no?"); 
               opcion= leer.next();
               if (opcion.equals("si")){
                bandera=true;
            }else{
                   if (opcion.equals("no")){
                       bandera=false;
                   }else{
                       System.out.println("opcion incorrecta");
                   }
               }
            }while(bandera==null);
        }
        if (bandera==false){
            break;
        }
        
            //System.out.println("desea seguir si/no?"); 
        
        
        }
        
        }
    
}
