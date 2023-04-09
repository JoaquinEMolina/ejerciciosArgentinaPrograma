package ejerciciosargentinaprograma.clase7;

public class DescuentoPorc extends Descuento {

    @Override
    public float valorFinal(float valorInicial) {
        return valorInicial - (valorInicial * this.getValorDesc() / 100);
    
    }
    
}
