
public class Praia{

    private boolean perigoTubarao;
    private boolean propriaParaBanho;
    private String tipoDeOrla;


    public Praia(boolean perigoTubarao, boolean propriaParaBanho, String tipoDeOrla)
    {
        this.perigoTubarao = perigoTubarao;
        this.propriaParaBanho = propriaParaBanho;
        this.tipoDeOrla = tipoDeOrla;
    }

    public void setPerigoTubarao(boolean perigoTubarao) {
        this.perigoTubarao = perigoTubarao;
    }
    
    public boolean getPerigoTubarao() {
        return perigoTubarao;
    }
    
    public void setPropriaParaBanho(boolean propriaParaBanho){
        this.propriaParaBanho = propriaParaBanho;
    }
    
    public boolean getPropriaParaBanho(){
        return propriaParaBanho;
    }
    
    public void setTipoDeOrla(String tipoDeOrla){
        this.tipoDeOrla = tipoDeOrla;
    }
    
    public String getTipoDeOrla(){
        return tipoDeOrla;
    }
        
}
