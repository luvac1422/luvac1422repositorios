/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Wendy
 */
public class Persona {
    private String name;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String name, Date fechaNacimiento) {
        this.name = name;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
            
}
