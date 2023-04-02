package ejerciciosargentinaprograma.clase5;


/*  un máximo de 3 itemCarrito y un Nº de Carrito */
public class Carrito {
    private int nroCarrito;
    private ItemCarrito[] items;

    public Carrito(int nroCarrito) {
        this.nroCarrito = nroCarrito;
        /* No pido itemCarrito en el argumento porque siempre va a ser un max = 3 de items. Creo un array vacio para que se cree siempre */
        this.items = new ItemCarrito[3];
    }

    public int getNroCarrito() {
        return nroCarrito;
    }

    public ItemCarrito getItemCarrito(int posicion) {
        return items[posicion];
    }

    public void setNroCarrito(int nroCarrito) {
        this.nroCarrito = nroCarrito;
    }
    
    public String getNombreArticuloCarrito(int posicion){
        
        String nombreArticulo = this.getItemCarrito(posicion).getProducto().getNombre();
        return nombreArticulo;
    }
    public int getCantidadArticuloCarrito(int posicion){
        
        int cantidadArticulo = this.getItemCarrito(posicion).getCantidad();
        return cantidadArticulo;
    }
    
    public void setItemCarrito(ItemCarrito itemNuevo, int posicion) {
        this.items[posicion] = itemNuevo;
    }

    public float getPrecioArticuloCarrito(int posicion) {
        float precioArticulo = this.getItemCarrito(posicion).getProducto().getPrecio();
        return precioArticulo; 
    }
    
    public float getTotal(){
        float total = 0;
        for (int i=0; i<3 ; i++){
            total += this.items[i].getSubtotal();
        }
        return total;
    }
    
    
    
    
    
    
    
    
}
