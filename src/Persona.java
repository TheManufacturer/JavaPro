public class Persona {

    private String nome;
    private String cognome;
    private Integer eta;
    private String indirizzo;
    
    public Persona(BuilderPersona builder) {
        this.nome = builder.getNome();
        this.cognome = builder.getCognome();
        this.eta = builder.getEta();
        this.indirizzo = builder.getIndirizzo();
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


    @Override
    public String toString() {
        return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", indirizzo=" + indirizzo + "]";
    }     
}
