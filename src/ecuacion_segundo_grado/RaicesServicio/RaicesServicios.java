/*
Vamos a realizar una clase llamada Raices, donde representaremos 
los valores de una ecuación de 2º grado. 
Tendremos los 3 coeficientes como atributos, 
llamémosles a, b y c. Hay que insertar estos 3 valores 
para construir el objeto a través de un método constructor.
Luego, en RaicesServicio las operaciones que se podrán realizar 
son las siguientes:

Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c.

Método tieneRaices(): devuelve un booleano indicandosi tiene dos soluciones, para que esto ocurra, el discriminante 
debe ser mayor o igual que 0.

Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, 
el discriminante debe ser igual que 0.

Método obtenerRaices(): llama a tieneRaices() y si devolvió true, 
imprime las 2 posibles soluciones.

Método obtenerRaiz(): llama a tieneRaiz() y si devolvió
true imprime una única raíz. Es en el caso en que se tenga 
una única solución posible.

Método calcular(): este método llamara tieneRaices() y a tieneRaiz(),
y mostrara por pantalla las posibles soluciones que tiene 
nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(),
según lo que devuelvan nuestros métodos y en caso de no existir solución,
se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) 
Solo varía el signo delante de -b
 */
package ecuacion_segundo_grado.RaicesServicio;

;

import ecuacion_segundo_grado.Entidades.Raices;
import java.util.Scanner;



public class RaicesServicios {

    Scanner Leer = new Scanner(System.in);

    public Raices Guardar_Parametros() {

        double a = 0;
        double b = 0;
        double c = 0;
        while (a == 0) {
            System.out.println("Ingrese el numero a");
            a = Leer.nextDouble();
        }
        while (b == 0) {
            System.out.println("Ingrese el numero b");
            b = Leer.nextDouble();
        }
        while (c == 0) {
            System.out.println("Ingrese el numero c");
            c = Leer.nextDouble();
        }
        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices r1) {
        double a = r1.getA();
        double b = r1.getB();
        double c = r1.getC();
        double discriminante;
        return discriminante = (Math.pow(b, 2) - (4 * a * c));
    }

    public boolean tieneRaices(Raices r1) {
        double discriminante = getDiscriminante(r1);
        boolean tieneRaices;
        if (discriminante > 0) {
            //System.out.println("El valor del discrimannte es " + discriminante + "y tiene raices");
            tieneRaices = true;
        } else {
            tieneRaices = false;
        }
        return tieneRaices;
    }

    public boolean tieneRaiz(Raices r1) {
        double discriminante = getDiscriminante(r1);
        boolean tieneRaiz;
        if (discriminante == 0) {
            tieneRaiz = true;
        } else {
            tieneRaiz = false;
        }
        return tieneRaiz;
    }

    public void obtenerRaices(Raices r1) {
        boolean tieneRaices = tieneRaices(r1);
        double discriminante = getDiscriminante(r1);
        double a = r1.getA();
        double b = r1.getB();
        double c = r1.getC();
        int decimales = 4;

        double raiz1 = ((-b + Math.sqrt(discriminante)) / (2 * a));
        raiz1 = formatearDecimales(raiz1, decimales);
        double raiz2 = ((-b - Math.sqrt(discriminante)) / (2 * a));
        raiz2 = formatearDecimales(raiz2, decimales);
        if (tieneRaices) {
            System.out.println("La ecuación tiene 2 posibles soluciones: ");
            System.out.println("la Primera raiz es {" + raiz1+"}");
            System.out.println("la Segunda raiz es {" + raiz2+"}");
        }
    }

    public void obtenerRaiz(Raices r1) {
        boolean tieneRaiz = tieneRaiz(r1);
        double discriminante = getDiscriminante(r1);
        double a = r1.getA();
        double b = r1.getB();
        double c = r1.getC();

        if (tieneRaiz) {
            System.out.println("La unica raiz de la ecuación es {" + (-b) / (2 * a)+"}");

        }
    }

    public void calcular(Raices r1) {
        double discriminante = getDiscriminante(r1);
        if (discriminante < 0) {
            System.out.println("La ecuación no tiene solución en los números reales");
        } else if (discriminante == 0) {
            obtenerRaiz(r1);
        } else {
            obtenerRaices(r1);
        }
    }

    public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }
}
