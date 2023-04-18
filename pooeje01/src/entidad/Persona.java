package entidad;

/**
 *
 * @author luvac1422
 */
public class Persona {
    public String nombre;
    public String apellido;
    public String nacionalidad;
    public int numdedocumento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String nacionalidad, int numdedocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.numdedocumento = numdedocumento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", numdedocumento=" + numdedocumento + '}';
    }
    
}
