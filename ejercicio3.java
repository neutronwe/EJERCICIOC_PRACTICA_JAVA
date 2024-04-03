
package com.mycompany.ejerciciospractica;

import java.util.Scanner;


public class ejercicio3 {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int A = 0;
        int i = 0;
        int num1 = 0 , num2 = 1, numeroFibonnacci;
        
        System.out.println("Cuantos numeros de la secuencia quiere que se generen");
        A = teclado.nextInt();
      
        while (i < A ){
            
            numeroFibonnacci = num1 + num2;
            System.out.println("-");
            System.out.println(numeroFibonnacci);
            num1 = num2;
            num2 = numeroFibonnacci;
            
            i++;
        }        
    }
}
