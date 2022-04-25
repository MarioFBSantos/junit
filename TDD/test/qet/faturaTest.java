package qet;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class faturaTest {
    
    fatura fatura1;
    
    @Before
    public void inicializa(){
        fatura1 = new fatura(2000.0, "20/10/2022", "Jorge", false);
    }
    
    @Test
    public void testCriaFatura(){
       assertTrue(2000.0 == fatura1.getTotal());
       assertEquals("20/10/2022", fatura1.getData());
       assertEquals("Jorge", fatura1.getNome());
       assertEquals(false, fatura1.getPaga());
    }
    
}
