
package com.mycompany.ejerciciospractica;

import java.util.Scanner;


public class ejercicio5 {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        double A;
        double i = 1;
        double Divisor = -1;
        double Tsuma = 0;
        double Total;
        
        while ( i > 0 ){
            
            System.out.println("Ingrese un numero");
            A = teclado.nextInt();
            
            Tsuma = Tsuma + A;
            
            Divisor++;
            
            if ( A == 0) {
                
                i = A;
                
                Total = Tsuma / Divisor; 
                
                //System.out.println(Tsuma + " " + " " + Divisor); //Para mirar los resultados de la suma total y del divisor
                
                System.out.println("La media de los numeros que lleva es: " + Total);
                
                System.out.println("Finalizado");
            }
        } 
    } 
}
