
package com.mycompany.ejerciciospractica;


public class ejercicio7 {


    public static void main(String[] args) {
        
        int i = 0;
        int A = 0;
        int Cuadrado = 0;
        int Suma = 0;
        
        while ( i < 100){
            
            A++;
            
            Cuadrado = A * A * A * A;
            
            System.out.println(Cuadrado);
            
            Suma = Suma + Cuadrado;
            
            i++;
        }
        
        System.out.println("Resultado: " + Suma);
    }
}
