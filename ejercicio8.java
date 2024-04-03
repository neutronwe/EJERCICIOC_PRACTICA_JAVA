
package com.mycompany.ejerciciospractica;

import java.util.Scanner;


public class ejercicio8 {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int val1;
        int i = 0;
        int suma = 0;
        
        while ( i < 10){
            
            System.out.println("Escribe un valor numerico");
            val1 = teclado.nextInt();
            
            if ( val1 < 0){
                
                suma = suma + val1;
            }
            
            i++;
        }
        
        System.out.println("Resultado de la suma de los datos negativos: " + suma);  
    } 
}
