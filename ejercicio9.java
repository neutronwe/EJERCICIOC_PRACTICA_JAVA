package ejerciciospractica;

import java.util.Scanner;


public class ejercicio9 {
    
    static Scanner teclado = new Scanner (System.in);
    static int opcionaux = 0;

    public static void main(String[] args) {
        
        int opcion = 0;
        
        do {
            
            System.out.println("\n--EJERCICIOS DE PRACTICA PROGRAMACION EN JAVA--");
            System.out.println(" | Ejercicio 1 |");
            System.out.println(" | Ejercicio 2 |");
            System.out.println(" | Ejercicio 3 |");
            System.out.println(" | Ejercicio 4 |");
            System.out.println(" | Ejercicio 5 |");
            System.out.println(" | Ejercicio 6 |");
            System.out.println(" | Ejercicio 7 |");
            System.out.println(" | Ejercicio 8 |");
            System.out.println(" | Salir --> 9 |");
            
            System.out.println("\nDigite el numero del Ejercicio que quiere mirar:");
            opcion = teclado.nextInt();
            
            switch (opcion){
            
            case 1 :
                Ejercicio1();
                break;
                
            case 2 :
                Ejercicio2();
                break;
                
            case 3 :
                Ejercicio3();
                break;
              
            case 4 :
                Ejercicio4();
                break;
            
            case 5 :
                Ejercicio5();
                break;
                
            case 6 :
                Ejercicio6();
                break;
                
            case 7 :
                Ejercicio7();
                break;
                
            case 8 :
                Ejercicio8();
                break;  
            }
        }
        
        while ( opcion != 9);
        
        System.out.println("PROGRAMA FINALIZADO");
    }
    
    static void Ejercicio1(){ 
        
        int A, B, C;
        
        System.out.println("Indique el valor para A");
        A = teclado.nextInt();
        
        System.out.println("Indique el valor para B");
        B = teclado.nextInt();
        while (B == A){
            
            System.out.println("¡Los valores no pueden ser iguales!");
            System.out.println("Indique otra vez el valor de B");
            B = teclado.nextInt();
        }
        
        System.out.println("Indique el valor para C");
        C = teclado.nextInt ();
        while (C == A){
            
            System.out.println("¡Los valores no pueden ser iguales!");
            System.out.println("Indique otra vez el valor de C");
            C = teclado.nextInt();
            while ( C == B){
            System.out.println("¡Los valores no pueden ser iguales!");
            System.out.println("Indique otra vez el valor de C");
            C = teclado.nextInt();
            }
        }
        
        System.out.println(A + " / " + B + " / " + C + " El valor del centro es: " + B );
        
        System.out.println("\nQuiere volver a ejecutar el Ejercicio 1");
        System.out.println("Ponga 1 para si y 0 Para volver al menu");
        opcionaux = teclado.nextInt();
        if ( opcionaux == 1 ){
                    
            Ejercicio1();        
        }
    }
    
    static void Ejercicio2(){
        
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
                    
                    System.out.println("No hay suma que por resultado de el valor de C = " + C);
                }
            }
        }
        
        System.out.println("\nQuiere volver a ejecutar el Ejercicio 2");
        System.out.println("Ponga 1 para si y 0 Para volver al menu");
        opcionaux = teclado.nextInt();
        if ( opcionaux == 1 ){
            
            Ejercicio2();
        }
    }
    
    static void Ejercicio3(){
        
        int A = 0;
        int i = 0;
        int num1 = 0 , num2 = 1, numeroFibonnacci;
        
        System.out.println("Cuantos numeros de la secuencia quiere que se generen");
        A = teclado.nextInt();
        A = A - 2;
        
        System.out.println("\n0");
        System.out.println("-");
        System.out.println("1");
      
        while (i < A ){
            
            numeroFibonnacci = num1 + num2;
            System.out.println("-");
            System.out.println(numeroFibonnacci);
            num1 = num2;
            num2 = numeroFibonnacci;
            
            i++;
        }
        
        System.out.println("\nQuiere volver a ejecutar el Ejercicio 3");
        System.out.println("Ponga 1 para si y 0 Para volver al menu");
        opcionaux = teclado.nextInt();
        if ( opcionaux == 1 ){
            
            Ejercicio3();
        }
    }
    
    static void Ejercicio4(){
        
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
        
        System.out.println("\nQuiere volver a ejecutar el Ejercicio 4");
        System.out.println("Ponga 1 para si y 0 Para volver al menu");
        opcionaux = teclado.nextInt();
        if ( opcionaux == 1 ){
            
            Ejercicio4();
        }
    }
    
    static void Ejercicio5(){
        
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
        
        System.out.println("\nQuiere volver a ejecutar el Ejercicio 5");
        System.out.println("Ponga 1 para si y 0 Para volver al menu");
        opcionaux = teclado.nextInt();
        if ( opcionaux == 1 ){
            
            Ejercicio5();
        }
    }
    
    static void Ejercicio6(){
        
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
        
        System.out.println("\nQuiere volver a ejecutar el Ejercicio 6");
        System.out.println("Ponga 1 para si y 0 Para volver al menu");
        opcionaux = teclado.nextInt();
        if ( opcionaux == 1 ){
            
            Ejercicio6();
        }
    }
    
    static void Ejercicio7(){
        
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
        
        System.out.println("\nQuiere volver a ejecutar el Ejercicio 7");
        System.out.println("Ponga 1 para si y 0 Para no");
        opcionaux = teclado.nextInt();
        if ( opcionaux == 1 ){
            
            Ejercicio7();
        }
    }
    
    static void Ejercicio8(){
        
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
        
        System.out.println("Resultado de la suma de los datos negativos es: " + suma);
        
        System.out.println("\nQuiere volver a ejecutar el Ejercicio 8");
        System.out.println("Ponga 1 para si y 0 Para volver al menu");
        opcionaux = teclado.nextInt();
        if ( opcionaux == 1 ){
            
            Ejercicio8();
        }
    }
}
