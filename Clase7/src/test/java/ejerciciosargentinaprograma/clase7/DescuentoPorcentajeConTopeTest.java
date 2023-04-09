package ejerciciosargentinaprograma.clase7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescuentoPorcentajeConTopeTest {
    
    public DescuentoPorcentajeConTopeTest() {
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
    public void testValorFinal() {
        System.out.println("valorFinal");
        float valorInicial = 100000.0F;
        DescuentoPorcentajeConTope instance = new DescuentoPorcentajeConTope();
        instance.setValor(10);
        float expResult = 98000.0F;
        float result = instance.valorFinal(valorInicial);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testValorFinal1() {
        System.out.println("valorFinal");
        float valorInicial = 1000.0F;
        DescuentoPorcentajeConTope instance = new DescuentoPorcentajeConTope();
        instance.setValor(30);
        float expResult = 700.0F;
        float result = instance.valorFinal(valorInicial);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testValorFinal2() {
        System.out.println("valorFinal");
        float valorInicial = 50000.0F;
        DescuentoPorcentajeConTope instance = new DescuentoPorcentajeConTope();
        instance.setValor(30);
        float expResult = 700.0F;
        float result = instance.valorFinal(valorInicial);
        assertEquals(expResult, result, 0);
    }
}
