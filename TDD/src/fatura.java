
package qet;

public class fatura {

    private double total;
    private String data;
    private String nome;
    private boolean paga;
    
    public fatura(double total, String data, String nome, boolean paga){
      super();
      this.data = data;
      this.total = total;
      this.nome = nome;
      this.paga = paga;
    }
    
    public String getData(){
        return data;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getTotal(){
        return total;
    }
    
    public boolean getPaga(){
        return paga;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
        
    public void setTotal(double total){
        this.total = total;
    }
    
    public void setPaga(boolean paga){
        this.paga = paga;
    }
  
}
