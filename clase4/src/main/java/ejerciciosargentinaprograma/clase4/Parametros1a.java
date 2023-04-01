package ejerciciosargentinaprograma.clase4;

//Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String

import sun.security.util.Length;

public class Parametros1a {
    private String cadena;
    private char letra;

    public Parametros1a() {
    }

    public Parametros1a(String cadena, char letra) {
        this.cadena = cadena;
        this.letra = letra;
    }
    
    public String calculaLetras(){
        int fin = cadena.length();
        char let = letra;
        int cuenta=0;
        
        
        for (int j = 0; j < fin ; j++) {
            if (let==cadena.charAt(j)){
                cuenta++;
            }
            
        }
        
        String strLet = String.valueOf(let);
        String strCuenta = String.valueOf(cuenta);
        
        String salida = "El numero de veces que se encontró la letra " + "'" + strLet + "'" + " en la cadena de texto fue: " + strCuenta;
        
        return salida;
    }
    
}
