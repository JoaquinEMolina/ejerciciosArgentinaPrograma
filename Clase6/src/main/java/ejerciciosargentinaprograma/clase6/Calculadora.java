package ejerciciosargentinaprograma.clase6;


public class Calculadora {
    private double unNumero, otroNumero, resultado;

    public Calculadora(double unNumero, double otroNumero) throws Exception {
        this.unNumero = unNumero;
        this.otroNumero = otroNumero;
    }
    
    public double sumar(double unNumero, double otroNumero) throws Exception {
        resultado = unNumero + otroNumero;
        
        return resultado;
    }
    
    public double restar(double unNumero, double otroNumero) throws Exception {
        resultado = unNumero - otroNumero;
        
        return resultado;
    }
    
    public double multiplicar(double unNumero, double otroNumero) throws Exception {
        resultado = unNumero * otroNumero;
        
        return resultado;
    }
    
    public double dividir(double unNumero, double otroNumero){
        resultado = unNumero / otroNumero;
        
        return resultado;
    }
    
    
}
