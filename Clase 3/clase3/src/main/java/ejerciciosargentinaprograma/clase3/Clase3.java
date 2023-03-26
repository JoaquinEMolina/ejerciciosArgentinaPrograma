
package ejerciciosargentinaprograma.clase3;

import java.util.Arrays;
import java.util.Scanner;
import sun.security.util.Debug;


public class Clase3 {

    public static void main(String[] args) {
        int num1,num2,num3,orden;
        Scanner teclado = new Scanner(System.in);
        String cadena;

        char unChar;
        
        System.out.println("----------------------------");       
        System.out.println("Ejercicio 1 A:");
        System.out.println("----------------------------");
        System.out.println("Ingrese una cadena de texto:");
        cadena = teclado.nextLine();
        System.out.println("Ingrese un char a buscar en la cadena:");
        unChar = (teclado.nextLine()).charAt(0);
        Parametros1a par1a = new Parametros1a(cadena,unChar);
        System.out.println(par1a.calculaLetras());
        
        System.out.println("----------------------------");       
        System.out.println("Ejercicio 1 B:");
        System.out.println("----------------------------");
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = teclado.nextInt();
        System.out.println("Para que los numeros queden de mayor a menor ingrese 0.");
        System.out.println("Para que los numeros queden de menor a mayor ingrese 1.");
        System.out.println("Orden deseado:");
        orden = teclado.nextInt();
        
        
        Parametros1b par1b = new Parametros1b(num1, num2, num3, orden);
        
        System.out.println( Arrays.toString(par1b.ordenarVector()));
        
        
    }
}
