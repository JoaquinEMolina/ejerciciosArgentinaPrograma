/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ejerciciosargentinaprograma.clase7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Joaquin
 */
public class CarritoTest {
    
    public CarritoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   
    
    @Test
    public void testGetPrecioArticuloCarrito1() {
        System.out.println("getPrecioArticuloCarrito");
        int posicion = 0;
        Carrito instance = new Carrito(1);
        Producto prod1 = new Producto(1, "Azucar 1kg", 350);
        Producto prod2 = new Producto(2, "Yerba 1kg", (float) 650.50);
        Producto prod3 = new Producto(3, "Aceite 1.5 L", 760);
        ItemCarrito item1 = new ItemCarrito(prod1, 1);
        ItemCarrito item2 = new ItemCarrito(prod2, 5);
        ItemCarrito item3 = new ItemCarrito(prod3, 10);
        instance.setItemCarrito(item1, 0);
        instance.setItemCarrito(item2, 1);
        instance.setItemCarrito(item3, 2);
        
        float expResult = 350.0F;
        float result = instance.getPrecioArticuloCarrito(posicion);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testGetPrecioArticuloCarrito2() {
        System.out.println("getPrecioArticuloCarrito");
        int posicion = 0;
        Carrito instance = new Carrito(1);
        Producto prod1 = new Producto(1, "Azucar 1kg", 350);
        Producto prod2 = new Producto(2, "Yerba 1kg", (float) 650.50);
        Producto prod3 = new Producto(3, "Aceite 1.5 L", 760);
        ItemCarrito item1 = new ItemCarrito(prod1, 1);
        ItemCarrito item2 = new ItemCarrito(prod2, 5);
        ItemCarrito item3 = new ItemCarrito(prod3, 10);
        instance.setItemCarrito(item1, 0);
        instance.setItemCarrito(item2, 1);
        instance.setItemCarrito(item3, 2);
        
        float expResult = 33.0F;
        float result = instance.getPrecioArticuloCarrito(posicion);
        assertEquals(expResult, result, 0);
    }

}
