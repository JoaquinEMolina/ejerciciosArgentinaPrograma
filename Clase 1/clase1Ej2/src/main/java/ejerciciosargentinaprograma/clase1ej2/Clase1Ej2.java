/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejerciciosargentinaprograma.clase1ej2;

/**
 *
 * @author Joaquin
 */
public class Clase1Ej2 {

    public static void main(String[] args) {
      double ingresosMensuales = 156995.23;
    int vehiculos=2, inmuebles=1, embarcaciones=0, aeronavesLujo=0;
    boolean activosSocietarios=false;
    
    
    
    if( ingresosMensuales>=489083 ||
        vehiculos>=3 ||
        inmuebles>=3 ||
        embarcaciones>=1 || aeronavesLujo>=1 || activosSocietarios==true
    ){
    
    System.out.println("Pertenece al segmento de ingresos altos");
    }else{
    System.out.println("No pertenece al segmento de ingresos altos");
    }   
    }
}
