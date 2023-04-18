/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
negativo después de realizar una transacción de retiro.*/

package guia7ejerc5;

import java.util.Scanner;

/**
 *
 * @author luvac1422
 */
public class Cuenta {
    public int saldo;
    public String titular;

    public Cuenta() {
    }
    
    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTitutar(String titular) {
        this.titular = titular;
    }
    
    public void DepositarDinero() {
        Scanner le = new Scanner(System.in);
        this.saldo = saldo;
        int dinero;
    }

    void RetirarDinero() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
