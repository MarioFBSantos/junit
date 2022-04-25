package qet;

import java.util.ArrayList;
import java.util.Iterator;


public class processamento {
    
    private ArrayList pagamento;
    
    public processamento(){
        pagamento = new ArrayList();
    }
    
    public int qtdBoletos(){
        return pagamento.size();
    }
    
}
