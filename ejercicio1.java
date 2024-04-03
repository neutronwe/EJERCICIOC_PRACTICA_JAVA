
package com.mycompany.ejerciciospractica;

import java.util.Scanner;


public class ejercicio1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int A, B, C;
        
        System.out.println("Indique el valor para A");
        A = teclado.nextInt();
        
        System.out.println("Indique el valor para B");
        B = teclado.nextInt();
        
        System.out.println("Indique el valor para C");
        C = teclado.nextInt ();
        
        System.out.println("El valor del centro es: " + B );    
    }
}
