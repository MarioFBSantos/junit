
package qet;
import java.util.ArrayList;

public class boleto {

    private double codigo;
    private String data;
    private double pago;
    
    public boleto(double codigo, String data, double pago){
      super();
      this.data = data;
      this.codigo = codigo;
      this.pago = pago;
    }
    
    public String getData(){
        return data;
    }
    
}

