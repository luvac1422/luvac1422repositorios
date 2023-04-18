package guia7ejerc5;

import java.util.Scanner;

/**
 *
 * @author luvac1422
 */
public class Guia7ejerc5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        String usuario;
        int op;
        int fin = 0;
        String salir;
        System.out.println("Ingrese su nombre de usuario");
        usuario = leer.nextLine();
        cuenta.setTitutar(usuario);
        System.out.println("Bienvenido " + cuenta.getTitular());
        while (fin != 1) {
            System.out.println("MENU");
            System.out.println("1. Depositar saldo");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Retirar saldo");
            System.out.println("4. SALIR");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    cuenta.DepositarDinero();
                    break;
                case 2:
                    System.out.println("El saldo de su cuenta es de: " + cuenta.getSaldo() + "$");
                    break;
                case 3:
                    cuenta.RetirarDinero();
                    break;
                case 4:
                    System.out.println("Para confimar, ingrese (SI/NO)");
                    salir = leer.next();
                    salir = salir.toLowerCase();
                    if ("si".equals(salir)) {
                        System.out.println("CERRANDO SESION");
                        fin = 1;
                    } else if ("no".equals(salir)) {
                        System.out.println("Regresando al menu");
                    } else {
                        System.out.println("Ingreso Invalido, regresando al menu");
                    }
                    break;
                default:
                    System.out.println("Ingreso Invalido");
                    break;
            }
        }
    }

}
