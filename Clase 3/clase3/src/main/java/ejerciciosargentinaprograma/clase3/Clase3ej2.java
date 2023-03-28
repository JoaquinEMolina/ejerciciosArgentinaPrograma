
package ejerciciosargentinaprograma.clase3;

import java.util.Scanner;

public class Clase3ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa codifica y decodifica un texto");
        
        System.out.println("Ingrese el texto:");
        String texto = teclado.nextLine();
        System.out.println("Que desea hacer? 1 CODIFICAR, 2 DECODIFICAR");
        int accion = teclado.nextInt();
        System.out.println("Ingrese la cantidad de desplazamientos usados para codificar (ej 1, 2, 3)");
        int despl = teclado.nextInt();
        
        ParametrosCodificacion par = new ParametrosCodificacion(texto, accion, despl);
        String textoResolucion = par.resolucionCodificado();
        
        
        System.out.println("El texto codificado es: " + textoResolucion);
        
        
    }
}
