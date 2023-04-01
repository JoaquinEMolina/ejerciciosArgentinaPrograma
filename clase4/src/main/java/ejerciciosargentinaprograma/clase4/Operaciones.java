package ejerciciosargentinaprograma.clase4;


public class Operaciones {
    int num1, num2, resultado;
    String operacion;

    public Operaciones(int num1, int num2, String operacion) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
    }
    

    public int suma(){
        resultado = num1 + num2;
        return resultado;
    }
    
    public int multiplicacion(){
        resultado = num1 * num2;
        return resultado;
    }
    
    public int resultado(){
        
        if (operacion.equals("+")){
                resultado = this.suma();
            }
        if (operacion.equals("*")){
                resultado = this.multiplicacion();
        }
        
        return resultado;
        
    }
    
    
    
}
