package ejerciciosargentinaprograma.clase7;


public abstract class Descuento {
    private float valor;

    public float getValorDesc() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public abstract float valorFinal(float valorInicial);
    
}
