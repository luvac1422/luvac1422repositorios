package operacion;

import java.util.Scanner;

/**
 *
 * @author luvac1422
 */
public class Operaciones {

    private double nun1;
    private double num2;

    public Operaciones() {
    }

    public Operaciones(double nun1, double num2) {
        this.nun1 = nun1;
        this.num2 = num2;
    }

    public double getNun1() {
        return nun1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNun1(double nun1) {
        this.nun1 = nun1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los numeros");
        this.nun1 = leer.nextDouble();
        this.num2 = leer.nextDouble();

    }

    public double suma() {
        return this.nun1 + this.num2;

    }

    public double resta() {
        return this.nun1 - this.num2;
    }

    public double multiplicacion() {
        if (this.nun1 == 0 || this.num2 == 0) {
            System.out.println("existe un 0");
            return 0;
        } else {
            return this.nun1 * this.num2;
        }
    }

    public double division() {
        if (this.nun1 == 0 || this.num2 == 0) {
            System.out.println("existe un 0");
            return 0;
        } else {
            return this.nun1 / this.num2;
        }
    }

    @Override
    public String toString() {
        return "numeros ingresados " + nun1 + " y " + num2 + "\n"+
                 " la suma es igual a " + suma() + "\n"+
                 "la resta es igual a " + resta() + "\n"+
                 "la multiplicacion es igual a " + multiplicacion() + "\n"+
                 "la division es igual a " + division() + "\n";

    }

}
