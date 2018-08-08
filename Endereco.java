
public class Endereco {
    
    private String logradouro;
    private String numero;
    private String bairro;

    public Endereco(String logradouro, String numero, String bairro) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
    }
            
    public String getlogradouro() {
        return this.logradouro;
    }
    
    public void setlogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    public String getnumero() {
        return this.numero;
    }
    
    public void setnumero(String numero) {
        this.numero=numero;
    }
    
    public String getbairro() {
        return this.bairro;
    }
    
    public void setbairro(String bairro) {
        this.bairro=bairro;
    }
    
}
