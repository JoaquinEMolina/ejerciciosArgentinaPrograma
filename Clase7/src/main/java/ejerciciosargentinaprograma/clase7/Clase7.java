package ejerciciosargentinaprograma.clase7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Clase7 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int nroCarrito = 1;
        
               
        /* Los guardo en un array para llamarlos mas facil despues */
        Producto[] productos = new Producto[3];
        
        /* k la voy a usar en la lectura de las lineas del archivo, para guardar una a una en el array de productos */
        int k=0;
        try{
            /* El for este lee linea a linea del archivo */
        for(String linea: Files.readAllLines(Paths.get("C:\\Users\\Joaquin\\Documents\\GitHub\\ejerciciosArgentinaPrograma\\Clase5\\src\\main\\java\\ejerciciosargentinaprograma\\clase5\\compra.txt")))
        {
            String nombreProducto = linea.split(";")[1];
            /* A los float e int los tengo que convertir de String a ese otro tipo de variable */
            float precioProducto = Float.parseFloat(linea.split(";")[2]);
            int cantidadProductos = Integer.parseInt(linea.split(";")[0]);
            
            /* Creo un producto nuevo */
            Producto prod = new Producto(k, nombreProducto, precioProducto);
            /* Lo guardo en el array de productos */
            productos[k] = prod;
            
            k++;
        }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        
        
        
        
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
         System.out.println("Posee descuentos? 'Porcentaje', 'Fijo' o 'Porcentaje Tope");
         String desc = teclado.next();
         
         float total = carrito.getTotal();
         if ("fijo".equals(desc) || "Fijo".equals(desc)){
             DescuentoFijo descf = new DescuentoFijo();
             total = descf.valorFinal(total);
             System.out.println("El valor total con descuento es: $" + total);
         }
         if ("porcentaje".equals(desc) || "Porcentaje".equals(desc)){
             DescuentoPorc descp = new DescuentoPorc();
             total = descp.valorFinal(total);
             System.out.println("El valor total con descuento es: $" + total);
         }
         if ("porcentaje tope".equals(desc) || "Porcentaje Tope".equals(desc)){
             DescuentoPorcentajeConTope descpt = new DescuentoPorcentajeConTope();
             total = descpt.valorFinal(total);
             System.out.println("El valor total con descuento es: $" + total);
         }
         
         
    
    }
}
       
        
        
        
        
        
       
