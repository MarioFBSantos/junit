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
        
        boleto4 = new boleto(4444,"20/10/2022", 1000.0);
        boleto5 = new boleto(5555,"20/10/2022", 500.0);
        boleto6 = new boleto(6666, "20/10/2022", 250.0);
        
        process2 = new processamento();
        process2.addBoleto(boleto4);
        process2.addBoleto(boleto5);
        process2.addBoleto(boleto6);
        
        boleto7 = new boleto(7777, "22/10/2022", 500.0);
        boleto8 = new boleto(8888,"22/10/2022", 400.0);
        
        process3 = new processamento();
        process3.addBoleto(boleto7);
        process3.addBoleto(boleto8);
        
        
        
    }
    
    @Test
    public void testTotal(){
        assertTrue(process.getTotalPago() >= fatura1.getTotal() );
        
    }
    // primeiro caso 
    @Test 
    public void testSetStatus(){
        process.setFaturaStatus(fatura1);
        assertEquals(fatura1.getPaga(), true);
    }
    
    @Test
    public void testQtdBoletos(){
        assertTrue(process.qtdBoletos() == 3);
    }
            
    @Test
    public void testPaga(){
        assertTrue(process.getTotalPago() >= fatura1.getTotal());
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
  // terceiro caso
    
     @Test
    public void testPaga3(){
        assertTrue(process3.getTotalPago() >= fatura3.getTotal());
    }
    
    @Test 
    public void testSetStatus3(){
        process.setFaturaStatus(fatura3);
        assertEquals(fatura3.getPaga(), true);
    }
    
    @Test
    public void testQtdBoletos3(){
        assertTrue(process3.qtdBoletos() == 2);
    } 
}
