
public class Shopping
{
 
    private String abertura;
    private String fechamento;
    private Endereco endereco;
    
    public Shopping(String Abertura, String fechamento, Endereco endereco){
        this.abertura = abertura;
        this.fechamento = fechamento;
        this.endereco = endereco;
    }
    
    public void setAbertura(String abertura){
        this.abertura = abertura;
    }
    
    public String getAbertura(){
        return abertura;
    }
    
    public void setFechamento(String fechamento){
        this.fechamento = fechamento;
    }
    
    public String getFechamento(){
        return fechamento;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    
}
