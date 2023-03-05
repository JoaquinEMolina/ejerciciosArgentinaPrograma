
package com.argprograma.clase1;

import java.util.Scanner;


public class Clase1 {

    public static void main(String[] args) {
        
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
        int i=numeroInicio;
        
        //Ejercicio 1) a) : 
        System.out.println("Ejercicio 1) a) : ");
        System.out.println("Los numeros intermedios son:");
        while (i>=numeroInicio && i<=numeroFin){
            if (i<numeroFin){
            System.out.printf(i+",", i);
            } else{
                System.out.printf(""+i, i);
            }
            i++;
        }
        
        i=numeroInicio;
        System.out.println("\nEjercicio 1) b) : ");
        System.out.println("Los numeros intermedios pares son:");
        while (i>=numeroInicio && i<=numeroFin){
            if (i<numeroFin && (i%2)==0){
            System.out.printf(i+",", i);
            } else{
                if((i%2)==0){
                System.out.printf(""+i, i);
                }
            }
            i++;
        }
        
        
        
        

    }
}
