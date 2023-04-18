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
package ecuacion_segundo_grado;

;

import ecuacion_segundo_grado.Entidades.Raices;
import ecuacion_segundo_grado.RaicesServicio.RaicesServicios;
import java.util.Scanner;



public class Ecuacion_segundo_grado {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        RaicesServicios Servicio = new RaicesServicios();

        Raices Cuadratica = Servicio.Guardar_Parametros();

        Servicio.calcular(Cuadratica);

    }

}
