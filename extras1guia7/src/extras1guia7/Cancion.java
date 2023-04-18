/*Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá definir además dos constructores: uno vacío que inicializa el título
y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor
de la canción. Se deberán además definir los métodos getters y setters correspondientes. */
package extras1guia7;

import java.util.Scanner;

/**
 *
 * @author luvac1422
 */
public class Cancion {

    private String titulo;
    private String autor;

    public Cancion() {
    }

    public String getTitulo() {
        return titulo;
    }

//    @Override
//    public String toString() {
//        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
//    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public Cancion(String titulo) {
        this.titulo = titulo;

    }

    public void cancion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el titulo de la cancion");
        this.titulo = leer.next(titulo);
        this.autor = leer.next();
    }

}
