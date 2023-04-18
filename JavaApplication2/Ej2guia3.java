/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia3;

import java.util.Scanner;

/**
 *
 * @author lored
 * 
 /* Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java. */ 



public class Ej2guia3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String palabra;
          do { 
          System.out.println(" escriba la contraseña");   
          palabra = teclado.next();
          if (palabra.equalsIgnoreCase("eureka")){ 
              System.out.println("La contraseña es correcta");
             } else { System.out.println("La contraseña es incorrecta");
                  }
        } while ( !palabra.equalsIgnoreCase("eureka"));
          
        }}
    

