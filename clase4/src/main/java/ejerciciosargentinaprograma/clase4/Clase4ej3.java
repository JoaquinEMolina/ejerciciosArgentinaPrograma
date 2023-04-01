
package ejerciciosargentinaprograma.clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Clase4ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String archivo1 = "C:\\Users\\Joaquin\\Documents\\GitHub\\ejerciciosArgentinaPrograma\\clase4\\src\\main\\java\\ejerciciosargentinaprograma\\clase4\\textoEntrada.txt";
        String archivo2 = "C:\\Users\\Joaquin\\Documents\\GitHub\\ejerciciosArgentinaPrograma\\clase4\\src\\main\\java\\ejerciciosargentinaprograma\\clase4\\textoSalida.txt";
        String texto="";
        
        
        try{
                for (String linea: Files.readAllLines(Paths.get(archivo1))){
                    texto = linea;
                }
                System.out.println("Este programa codifica y decodifica un texto");
                
                System.out.println("Que desea hacer? 1 CODIFICAR, 2 DECODIFICAR");
                int accion = teclado.nextInt();
                System.out.println("Ingrese la cantidad de desplazamientos usados para codificar (ej 1, 2, 3)");
                int despl = teclado.nextInt();

                ParametrosCodificacion par = new ParametrosCodificacion(texto, accion, despl);
                String textoResolucion = par.resolucionCodificado();
               
                Files.write(Paths.get(archivo2), textoResolucion.getBytes(), StandardOpenOption.APPEND);
                
                System.out.println("El texto codificado es: " + textoResolucion);
        } catch (IOException e){
            System.out.println ("El error es: " + e.getMessage());
        }
        
    }
}
