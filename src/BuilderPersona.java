public class BuilderPersona {

    private String nome;
    private String cognome;
    private Integer eta;
    private String indirizzo;

    
    public BuilderPersona(String nome, String cognome ){
        this.nome = nome;
        this.cognome = cognome;
    }
    
    public BuilderPersona setEta(int eta){
        this.eta = eta;
        return this; 
    } 

    public BuilderPersona setIndirizzo(String indirizzo){
        this.indirizzo=indirizzo;
        return this;
    }

    public Persona buildPersona(){
        return new Persona(this);
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Integer getEta() {
        return eta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    
}
