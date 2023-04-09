package ejerciciosargentinaprograma.clase7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DescuentoPorcTest {
    
    public DescuentoPorcTest() {
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

    /**
     * Test of valorFinal method, of class DescuentoPorc.
     */
    @Test
    public void testValorFinal() {
        System.out.println("valorFinal");
        float valorInicial = 100.0F;
        DescuentoPorc instance = new DescuentoPorc();
        instance.setValor(15);
        float expResult = 85.0F;
        float result = instance.valorFinal(valorInicial);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testValorFinal2() {
        System.out.println("valorFinal");
        float valorInicial = 100.0F;
        DescuentoPorc instance = new DescuentoPorc();
        instance.setValor(20);
        float expResult = 80.0F;
        float result = instance.valorFinal(valorInicial);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testValorFinal3() {
        System.out.println("valorFinal");
        float valorInicial = 145.0F;
        DescuentoPorc instance = new DescuentoPorc();
        instance.setValor(20);
        float expResult = 80.0F;
        float result = instance.valorFinal(valorInicial);
        assertEquals(expResult, result, 0);
    }
    
}
