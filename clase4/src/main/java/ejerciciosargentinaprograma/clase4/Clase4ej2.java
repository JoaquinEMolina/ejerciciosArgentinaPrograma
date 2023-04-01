
package ejerciciosargentinaprograma.clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Clase4ej2 {
    public static void main(String[] args){
        int num1=0, num2=0;
        String operacion;
        String archivo = "C:\\Users\\Joaquin\\Documents\\GitHub\\ejerciciosArgentinaPrograma\\clase4\\src\\main\\java\\ejerciciosargentinaprograma\\clase4\\numeros.txt";
        
        try{
            for (String numeros: Files.readAllLines(Paths.get(archivo)))
            {
                num1 = Integer.parseInt(numeros.split(";")[0]);
                num2 = Integer.parseInt(numeros.split(";")[1]);
                
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println("Los numeros leidos en el archivo son: "+ num1 + " y " + num2 );
        System.out.println("Ingrese la operacion deseada: + (suma) o * (multiplicacion)");
        
        Scanner tec = new Scanner(System.in);
        
        operacion = tec.next();
        Operaciones op = new Operaciones(num1, num2, operacion);
        
        System.out.println("El resultado es: " + op.resultado());
        
        
        
    }

    
    
}
