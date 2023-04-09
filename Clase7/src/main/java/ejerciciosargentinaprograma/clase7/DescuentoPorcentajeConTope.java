package ejerciciosargentinaprograma.clase7;

public class DescuentoPorcentajeConTope extends Descuento {
    @Override
    public float valorFinal(float valorInicial) {
        float valor = valorInicial - (valorInicial * this.getValorDesc() / 100);
        if (valorInicial * this.getValorDesc() / 100 > 2000){
            valor = valorInicial - 2000;
        }
        return valor;
    
    }
}
