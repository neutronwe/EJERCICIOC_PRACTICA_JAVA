
package com.mycompany.ejerciciospractica;


public class ejercicio6 {


    public static void main(String[] args) {
        
        int A = 0;
        int B = 0;
        int C = 0;
        int i = 1;
        int tSumPares = 0, tSumImpares = 0;
        int mediaPar = 0, mediaImpar = 0;
        
        
        while (i <= 200) {
            
            A++;
            
            if ( A % 2 == 0){
                
                B = A;
                
                tSumPares = tSumPares + B;
             
                mediaPar = tSumPares / 100;
                
                //System.out.println(B);
            }
            
            else {
                
                C = A;
                
                tSumImpares = tSumImpares + C;
                
                mediaImpar = tSumImpares / 100;
                
                //System.out.println(C);
            }
            
            i++;
        }
        
        System.out.println("El total de la suma de los pares es: " + tSumPares + " y El total de la suma de los impares es: " + tSumImpares);
        
        System.out.println("El resultado de la media de los pares es: " + mediaPar + " y El resultado de la media de los impares es: " + mediaImpar);
    }  
}

        