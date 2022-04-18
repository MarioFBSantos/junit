package qet;

import java.util.ArrayList;
import java.util.Iterator;


public class processamento {
    
    private ArrayList pagamento;
    
    public processamento(){
        pagamento = new ArrayList();
    }
    
    public double getTotalPago(){
        double total = 0.0;
        
        for(Iterator i = pagamento.iterator(); i.hasNext();){
             boleto item = (boleto) i.next();
              total += item.getPago();
        }
        
        return total;
    }
    
    public void addBoleto(boleto item){
        pagamento.add(item);
        System.out.println(item);
    }
    
    public int qtdBoletos(){
        return pagamento.size();
    }
    
    public void esvazia(){
        pagamento.clear();
    }
    
    public void setFaturaStatus(fatura item){
        if(this.getTotalPago() >= item.getTotal()){
            item.setPaga(true);
        }
    }
    
}
