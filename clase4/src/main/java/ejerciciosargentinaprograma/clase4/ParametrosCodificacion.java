
package ejerciciosargentinaprograma.clase4;


public class ParametrosCodificacion {
    String abecedario = "abcdefghijklmnñopqrstuvwxyz";
    String texto;
    int accion;
    int despl;

    public ParametrosCodificacion(String texto, int accion, int despl) {
        this.texto = texto;
        this.accion = accion;
        this.despl = despl;
    }
        
    public String resolucionCodificado(){
        if (accion == 1){
            return codificarTexto();
        }
        if (accion == 2){
            return decodificarTexto();
        }
        return null;
    }
    public String codificarTexto(){
        int dimTexto = texto.length();
        String textoCodificado = "";
        char letra;
        for (int i=0; i<dimTexto; i++){
             letra = texto.charAt(i);
             for(int j=0;j<abecedario.length();j++){
                 if (abecedario.charAt(j)==letra){
                     textoCodificado += abecedario.charAt(j+despl);
                 }
             }            
         }
        return textoCodificado;
    }

    private String decodificarTexto() {
        int dimTexto = texto.length();
        String textoDecodificado = "";
        char letra;
        for (int i=0; i<dimTexto; i++){
             letra = texto.charAt(i);
             for(int j=0;j<abecedario.length();j++){
                 if (abecedario.charAt(j)==letra){
                     textoDecodificado += abecedario.charAt(j-despl);
                 }
             }            
         }
        return textoDecodificado;
    }
}