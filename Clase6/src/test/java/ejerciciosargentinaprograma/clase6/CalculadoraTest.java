package ejerciciosargentinaprograma.clase6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
     /**
     * Test of multiplicar method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplicar1() throws Exception {
        System.out.println("multiplicar");
        double unNumero = 80.0;
        double otroNumero = 3.0;
        Calculadora calc = new Calculadora(unNumero, otroNumero);
        double expResult = 240.0;
        double result = calc.multiplicar(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
        
    }
    
     /**
     * Test of sumar method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testSumar2() throws Exception {
        System.out.println("sumar");
        double unNumero = 150.0;
        double otroNumero = 180.0;
        Calculadora calc = new Calculadora(unNumero, otroNumero);
        double expResult = 110.0;
        double result = calc.sumar(unNumero, otroNumero)/3;
        assertEquals(expResult, result, 0);
        
    }
    
    /**
     * Test of restar method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testRestar3() throws Exception {
        System.out.println("restar");
        double unNumero = 90.0;
        double otroNumero = 50.0;
        Calculadora calc = new Calculadora(unNumero, otroNumero);
        double expResult = 605.0;
        double result = calc.restar(unNumero, otroNumero)*15;
        assertEquals(expResult, result, 0);
    }
    
    /**
     * Test of sumar method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testSumar4() throws Exception {
        System.out.println("sumar");
        double unNumero = 70.0;
        double otroNumero = 40.0;
        Calculadora calc = new Calculadora(unNumero, otroNumero);
        double expResult = 2700.0;
        double result = calc.sumar(unNumero, otroNumero)*25;
        assertEquals(expResult, result, 0);
        
    }
    
}
