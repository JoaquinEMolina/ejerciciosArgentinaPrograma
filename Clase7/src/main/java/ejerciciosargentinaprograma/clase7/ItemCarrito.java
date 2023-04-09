package ejerciciosargentinaprograma.clase7;


/* Se tendrán las siguientes características producto y la cantidad del mismo. */

public class ItemCarrito {
    Producto producto;
    int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public float getSubtotal(){
        int cant = this.getCantidad();
        float precio = this.getProducto().getPrecio();
        float subtotal = cant * precio;
        
        return subtotal;
       
    }
    
    
    
    
}
