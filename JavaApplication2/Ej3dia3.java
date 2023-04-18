/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3dia3;

import java.util.Scanner;


 /*Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java. */
public class Ej3dia3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String palabra;
        do{ System.out.println("Escriba una palabra");
        palabra=teclado.next();
        if (palabra.length() == 8 ) {
            System.out.println("SHE BIEN");
            
        }else {
            System.out.println("TODO MAL LOCO");
        }
        } while (palabra.length()!=8);
        
      
        
        
    }
    
}
