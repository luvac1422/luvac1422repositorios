
package ejercicio5_persona.Service;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author luvac1422
 */
public class PersonaService {
    
   private Scanner leer = new Scanner(System.in);
        public Persona crearPersona (){
        System.out.println("Ingrese nombre de la persona.");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su fecha de nacimiento:");
        Date fN = fechaNacimiento();
            return new Persona(nombre, fN);
}
    
    public Date fechaNacimiento(){
        System.out.println("Día (DD):");
        int dia = leer.nextInt();
        System.out.println("Mes (MM):");
        int mes = leer.nextInt()-1;
        System.out.println("Año (AAAA):");
        int anio = leer.nextInt()-1900;
            return new Date(anio, mes, dia);
    }
    
    public Date fechaActual(){
            return new Date();
    }
    
    public Date fechaCumple(Persona p1){
        Date fechaActual = fechaActual();
        int day = p1.getFechaNacimiento().getDate(); //NO ES .getDay
        int month = p1.getFechaNacimiento().getMonth();
        int year = fechaActual.getYear();
        //System.out.println("Su cumpleaños es el " + (1900+year) + "/" + (1+month) + "/" + day);
            return new Date(year, month, day);
    }
    
    public int calcularEdad(Date fechaActual, Persona p1){
        double edad;
        //Si todavía falta para el cumpleaños
        if (fechaActual.getTime() < p1.getFechaNacimiento().getTime()){ 
            edad = (Math.floor(Math.round((fechaActual.getTime() - p1.getFechaNacimiento().getTime())/3.154e+10)-1));
        } else {      
            edad = (Math.floor(Math.round((fechaActual.getTime() - p1.getFechaNacimiento().getTime())/3.154e+10)));
        }
        return (int) edad;
    }
    
    public boolean menorQue(Persona p1){
        System.out.println("Ingrese la edad base");
        int edadBase = leer.nextInt();
        boolean menorque = false;
        Date hoy = fechaActual();
        int edad = calcularEdad(hoy,p1);
        if (edad < edadBase){
           return menorque = true;
        } else {
            return menorque = false;
        }
    }
    
    public String mostrarFechas(Date x){
        int dia = x.getDate(); // x.getDay es la posición del día (lunes, martes...)
        int mes = (x.getMonth()+1);
        int anio = (x.getYear()+1900);
      String fecha = (dia + "/" + mes + "/" + anio);
      return fecha; 
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println("Datos Personales");
        System.out.println("Nombre: " +p1.getName());
        String fN = mostrarFechas(p1.getFechaNacimiento());
        System.out.println("Fecha de nacimiento: " + fN);
        Date hoy = fechaActual();
        int edad = calcularEdad(hoy,p1);
        
        System.out.println("Edad: " + edad + " años.");
        if(menorQue(p1) == true){
            System.out.println(p1.getName() + " es menor.");
        }else{
            System.out.println(p1.getName() + " no es menor.");
        }
    } 
            
}

