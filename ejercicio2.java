
package com.mycompany.ejerciciospractica;

import java.util.Scanner;

public class ejercicio2 {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int A, B, C;
        
        System.out.println("Indique el valor para A");
        A = teclado.nextInt();
        
        System.out.println("Indique el valor para B");
        B = teclado.nextInt();
        
        System.out.println("Indique el valor para C");
        C = teclado.nextInt();
        
        if ( C == A + B){
            
            System.out.println("La suma de A y B es igual a C = " + C);
        }
        
        else {
            
            if ( C == A + C){
                
                System.out.println("La suma de A y C es igual a C = " + C);
            }
            
            else {
                
                if (C == B + C){
                    
                    System.out.println("La suma de B y C es igual a C = " + C);
                }
                
                else {
                    
                    System.out.println("No hay suma que por resultado de C = " + C);
                }
            }
        }
    }  
}
