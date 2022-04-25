package qet;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class processamentoTest {
    
    processamento process;
    processamento process2;
    processamento process3;
    
    fatura fatura1;
    fatura fatura2;
    fatura fatura3;
    
    boleto boleto1;
    boleto boleto2;
    boleto boleto3;
    
    boleto boleto4;
    boleto boleto5;
    boleto boleto6;
    
    boleto boleto7;
    boleto boleto8;
    
    @Before
    public void inicializa(){
        fatura1 = new fatura(1500.0, "20/10/2022", "Jorge", false);
        fatura2 = new fatura(1500.0, "22/10/2022", "Jorge junior", false);
        fatura3 = new fatura(1500.0, "25/10/2022", "Junior Jorge", false);

        boleto1 = new boleto(1111, "20/10/2022", 500.0);
        boleto2 = new boleto(2222, "20/10/2022", 400.0);
        boleto3 = new boleto(3333, "20/10/2022", 600.0);
        
        process = new processamento();
        process.addBoleto(boleto1);
        process.addBoleto(boleto2);
        process.addBoleto(boleto3);
        
    }
    
    @Test
    public void testTotal(){
        assertTrue(process.getTotalPago() >= fatura1.getTotal() );
        
    }
    // primeiro caso 
    @Test
    public void testQtdBoletos(){
        assertTrue(process.qtdBoletos() == 3);
    }
     
    @Test
    public void testPaga(){
        assertTrue(process.getTotalPago() >= fatura1.getTotal());
    }
    
    @Test 
    public void testSetStatus(){
        process.setFaturaStatus(fatura1);
        assertEquals(fatura1.getPaga(), true);
    }
    
    
     // segundo caso 
    @Test
    public void testPaga2(){
        assertTrue(process2.getTotalPago() >= fatura2.getTotal());
    }
    
    @Test 
    public void testSetStatus2(){
        process.setFaturaStatus(fatura2);
        assertEquals(fatura2.getPaga(), true);
    }
    
    @Test
    public void testQtdBoletos2(){
        assertTrue(process2.qtdBoletos() == 3);
}
