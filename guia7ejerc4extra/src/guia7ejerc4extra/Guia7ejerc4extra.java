package guia7ejerc4extra;

import java.util.Scanner;

/**
 *
 * @author luvac1422
 */
public class Guia7ejerc4extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cocina r1 = new Cocina();
        int opc;
        String salir;
        int fin = 0;
        while (fin != 1) {

            System.out.println("MENU");
            System.out.println("1. Crear lista recetas");
            System.out.println("2. Actualizar lista de recetas");
            System.out.println("3. Buscar recetas que contengan un ingrediente especifico");
            System.out.println("4. Mostrar lista de recetas");
            System.out.println("5. SALIR");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    r1.CrearRecetas();
                    break;
                case 2:
                    r1.ActualizarRecetas();
                    break;
                case 3:
                    r1.BuscarIngrediente();
                    break;
                case 4:
                    r1.MostrarRecetas();
                    break;
                case 5:
                    System.out.println("Para confimar, ingrese (SI/NO)");
                    salir = leer.next();
                    salir = salir.toLowerCase();
                    if (null == salir) {
                        System.out.println("Ingreso Invalido, regresando al menu");
                    } else switch (salir) {
                case "si":
                    System.out.println("CERRANDO SESION");
                    fin = 1;
                    break;
                case "no":
                    System.out.println("Regresando al menu");
                    break;
                default:
                    System.out.println("Ingreso Invalido, regresando al menu");
                    break;
            }
                    break;
                default:
                    System.out.println("Ingreso Invalido");
                    break;
            }
        }
    }

}
