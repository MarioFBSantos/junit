package qet;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class boletoTest {
    
    boleto boleto1;
    
    @Before
    public void inicializa(){
        boleto1 = new boleto(1111, "20/10/2022", 800.0);
    }
    
    @Test
    public void testData(){
        assertEquals("20/10/2022", boleto1.getData());
    }
    
}
