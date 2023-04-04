package ejerciciosargentinaprograma.clase6;


public class Main {

    public static void main(String[] args) throws Exception {
        double unNumero=0, otroNumero=0;
        
        Calculadora calc = new Calculadora(unNumero, otroNumero);
        
        System.out.println(calc.sumar(unNumero, otroNumero));
        System.out.println(calc.restar(unNumero, otroNumero));
        System.out.println(calc.multiplicar(unNumero, otroNumero));
        System.out.println(calc.dividir(unNumero, otroNumero));
        
        



    }
    
}
