
package com.mycompany.ejerciciospractica;

import java.util.Scanner;


public class ejercicio4 {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int i = 1, e = 1;
        int numeros = 0;
        int siNo = 0;
        int h;

        System.out.println("Si quiere empezar a generar los numeros escriba | 1 | si no escriba | 0 |");
        siNo = teclado.nextInt();
        
        if (siNo == 1){
            
            i = 1;
        }
        
        else {
            
            i = 51;
            
            System.out.println("Finalizado");
        }
        
        while (i <= 50){
            
            e = 1;
            
            while (e <= 20){
                
                numeros++;
                System.out.println(numeros);
                e++;
            }
            
            System.out.println("Si quiere continuar escriba | 1 | si no escriba | 0 |");
            h = teclado.nextInt();
            
            if ( h == 0){
                
                i = 51;
                
                System.out.println("Finalizado");
            }
            
            i++;
            
            if (numeros == 1000) {
                
                System.out.println("Finalizado");
            }
        }
    } 
}