/*Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el título
y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción.
Se deberán además definir los métodos getters y setters correspondientes. */
package guia7ejerc1extra;

import java.util.Scanner;

/**
 *
 * @author luvac1422
 */
public class Cancion {

    public String titulo;
    public String autor;

    public Cancion() {
        this.titulo = "";
        this.autor = "";

    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        
        
    }
public void ingresoCancion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el nombre del titulo");
        this.titulo = leer.next();
        System.out.println("ingrese el nombre del autor");
        this.autor = leer.next();
}
    
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;

    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }

}
