
package ejerciciosargentinaprograma.clase3;



import java.util.Arrays;


public class Parametros1b {
    int [] vector = new int [3];
    int orden;
    
    
     
    public Parametros1b(int num1, int num2, int num3, int orden) {
       
        this.vector[0] = num1;
        this.vector[1] = num2;
        this.vector[2] = num3;
        this.orden = orden;
    }

    public int [] getVector(){
        return vector;
    }
    
    public int [] getVectorOrdenAsc(){
        ordenarAscendente();
        
        return vector;
    }
    
    public void ordenarAscendente(){
        Arrays.sort(vector);
    }
    
    public int [] ordenarVector(){
        if (orden==0){
            return getVectorOrdenAsc();
        }
        if (orden ==1){
            ordenarAscendente();
            int [] vectorDescentente;
            vectorDescentente = new int [3];
            
            for (int i=0, j=2; i<2; i++, j--){
            vectorDescentente[i] = this.vector[j];
            }
            return vectorDescentente;
        }
        return null;
        
    }

   
    
    
        
}
