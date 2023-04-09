package ejerciciosargentinaprograma.clase7;

import java.util.Scanner;


public class Clase5ej1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nroCarrito = 1;
        
        /* Creo productos */
        Producto prod1 = new Producto(1, "Azucar 1kg", 350);
        Producto prod2 = new Producto(2, "Yerba 1kg", (float) 650.50);
        Producto prod3 = new Producto(3, "Aceite 1.5 L", 760);
        
        /* Los guardo en un array para llamarlos mas facil despues */
        Producto[] productos = new Producto[3];
        productos[0] = prod1;
        productos[1] = prod2;
        productos[2] = prod3;
        
        System.out.println("------------ Programa crear carrito de compra ------------");
        
        /* Crear el carrito para la compra */
        Carrito carrito = new Carrito(nroCarrito);
        
        /* Hago llamar los productos y que elija cuales quiere */
        int nroEleccion,cantEleccion;   
        for (int i=0 ; i<3 ; i++){
            System.out.println("¿Qué producto desea agregar? Teclee el numero");
            for (int m=0 ; m<productos.length; m++){
                System.out.println(m+1 + ")" + productos[m].getNombre() + " - " + "Precio: " + productos[m].getPrecio());
             }
            nroEleccion = teclado.nextInt();
            System.out.println("¿Qué cantidad de "+ productos[nroEleccion-1].getNombre() + " desea agregar? Teclee el numero:");
            cantEleccion = teclado.nextInt();
            ItemCarrito item = new ItemCarrito(productos[i], cantEleccion);
            /* Muestro por consola para validar */
            System.out.println("La eleccion fue: " + item.getProducto().getNombre() + " - " + item.getCantidad());
            System.out.println("------------------------------------");
            carrito.setItemCarrito(item, i);
            
        }
        for (int i=0; i<3 ; i++){
            /* System.out.println(carrito.getItemCarrito(i).getProducto().getNombre() + " " + carrito.getItemCarrito(i).getCantidad()); */
            /* esto lo abrevie en getNombreArticuloCarrito(), getCantidadItemCarrito(), getPrecioArticuloCarrito() */
            System.out.println(carrito.getNombreArticuloCarrito(i) + ": " + carrito.getCantidadArticuloCarrito(i) + " - Precio: $" + carrito.getPrecioArticuloCarrito(i));
            
        }
        System.out.println("El total a pagar de la compra es de: $" + carrito.getTotal());
        }
}
       
        
        
        
        
        
       
