
package com.argprograma.clase1;

import java.util.Scanner;


public class Clase1Ej1 {

    public static void main(String[] args) {
        boolean esPar=false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el numero de inicio: ");
        int numeroInicio = scan.nextInt();
        System.out.println("Introduzca el numero de fin: ");
        int numeroFin = scan.nextInt();
        
        while (numeroInicio>numeroFin){
            System.out.printf("El numero de inicio: "+numeroInicio+" es mayor que el numero de fin: "+numeroFin,numeroInicio, numeroFin);
            System.out.println("Introduzca nuevamente el numero de inicio :");
            numeroInicio = scan.nextInt();
        }

        // Se deberían mostrar los números: 5,6,7,8,9,10,11,12,13,14
        int i=numeroInicio+1;
        
        //Ejercicio 1) a) : 
        System.out.println("Ejercicio 1) a) : ");
        System.out.println("Los numeros intermedios son:");
        while (i>numeroInicio && i<numeroFin){
            if (i<numeroFin){
            System.out.printf(i+",", i);
            } else{
                System.out.printf(""+i, i);
            }
            i++;
        }
        
        i=numeroInicio++;
        //Ejercicio 1) b)
        i=numeroInicio;
        System.out.println("\nEjercicio 1) b) : ");
        System.out.println("Los numeros intermedios pares son:");
        
        while (i>=numeroInicio && i<numeroFin){
            esPar = i%2 == 0;
            
            if (esPar == true){
            System.out.printf(i+",", i);
            
           
            }
            i++;
        }
        
        i = numeroInicio;
        //Ejercicio 1) c)    
        System.out.println("\nEjercicio 1) c) : ");
    
        System.out.println("Si desea que muestre numeros pares ingrese P, si desea impar ingrese I: ");
               
        String opcion = scan.next();
        
        if ("P".equals(opcion) || "p".equals(opcion)){
            System.out.println("Los numeros intermedios pares son:");

            while (i>=numeroInicio && i<numeroFin){
                esPar = i%2 == 0;
            
                if (i<numeroFin && esPar==true){
                System.out.printf(i+",", i);
            
               
                }
                i++;
            }
        }
        
        if ("I".equals(opcion) || "i".equals(opcion)){
            System.out.println("Los numeros intermedios impares son:");

            while (i>=numeroInicio && i<numeroFin){
                esPar = i%2 == 0;
            
                if (i<numeroFin && esPar==false){
                System.out.printf(i+",", i);
            
                }
                i++;
            }
        }
        
        
        //Ejercicio 1) d)    
        System.out.println("\nEjercicio 1) d) : ");
        System.out.println("Los numeros intermedios son: ");
        
        for (int h = numeroFin; h > numeroInicio; h--) {
            
            System.out.printf(h-1+",", h);
        }
        
        
        
        
    }
}
